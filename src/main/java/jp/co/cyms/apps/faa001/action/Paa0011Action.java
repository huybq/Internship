package jp.co.cyms.apps.faa001.action;

import java.util.ArrayList;
import java.util.List;

import jp.co.cyms.apps.faa001.bean.SystemGroupBean;
import jp.co.cyms.apps.faa001.bl.Paa0011BL;
import jp.co.cyms.apps.faa001.form.Paa0011Form;
import jp.co.cyms.apps.fam001.bl.Pam0011BL;
import jp.co.cyms.common.Constant;
import jp.co.cyms.common.StringUtil;

/**
 *
 * @author tichnv
 * @since 2016/11/22
 */
@SuppressWarnings("serial")
public class Paa0011Action extends Paa0011Form  {

	private String userId;

	private String userPassword;

	private SystemGroupBean systemInfo = new SystemGroupBean();

	private List<SystemGroupBean> listSystemGroupBean = new ArrayList<SystemGroupBean>();

	private String valueCustomerCd;

	/**
	 * Event ID:Login
	 */
	private static final String EVENT_ID_LOGIN = "saa0011_01";

	public Paa0011Action() throws Exception {

	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	/**
	 * Login system
	 *
	 * @return String
	 */
	public String doEvent01() {
		try {
			Paa0011BL logic = new Paa0011BL();
			userInfo.setUserId(userId);
			userInfo.setUserPassword(userPassword);
			userInfo.setSystemId(systemInfo.getSystemId());
			userInfo = logic.login(userInfo);
			if (userInfo == null) {
				throw new NullPointerException("UserInfo NULL");
			}
			for (SystemGroupBean systemGroupBean : listSystemGroupBean) {
				if (isSystemGroupEquals(systemGroupBean)) {
					systemInfo.setSystemName(systemGroupBean.getSystemName());
					systemInfo.setSystemType(systemGroupBean.getSystemType());
				}
			}
			// Set session time out for system
			Pam0011BL pam0011BL = new Pam0011BL();
			String sessionTimeOut =  pam0011BL.selectSessionTimeOut();
			if(!StringUtil.isNullOrEmpty(sessionTimeOut)){
				int timeOut = Integer.parseInt(sessionTimeOut);
				request.getSession().setMaxInactiveInterval(timeOut * 60);
			}					
			userInfo.setSystemId(systemInfo.getSystemId());
			setMenu(logic);
			session.put(Constant.SESSION_KEY_SYSTEM_GROUP_INFO, systemInfo);
			session.put(Constant.SESSION_KEY_USER_INFO, userInfo);
		} catch (Exception e) {
			LOG.error("Login progress", e);
			super.addActionError("EA-0013");
			return ERROR;
		}
		return SUCCESS;
	}

	private boolean isSystemGroupEquals(SystemGroupBean systemGroupBean){
		return systemInfo.getSystemId().equals(systemGroupBean.getSystemId());
	}
	private void setMenu(Paa0011BL logic) throws Exception {
		menuInfo = logic.getMenuInfo(userInfo);
		session.put(Constant.SESSION_KEY_MENU_INFO, menuInfo);
	}
	/**
	 * Logout system
	 *
	 * @return String
	 */
	public String doEvent99() {
		session.clear();
		return SUCCESS;
	}

	public void validate() {
		Paa0011BL logic = new Paa0011BL();
		try {
			listSystemGroupBean = logic.getAllSystemGroup();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (EVENT_ID_LOGIN.equals(super.getEventId())) {
			if (StringUtil.isEmpty(userId)) {
				super.addActionError("EA-0011");
			}
			if (StringUtil.isEmpty(userPassword)) {
				super.addActionError("EA-0012");
			}
		}
	}


	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public String getUserId() {
	    return userId;
	}

	/**
	 * userIdを設定します。
	 * @param userId userId
	 */
	public void setUserId(String userId) {
	    this.userId = userId;
	}

	/**
	 * userPasswordを取得します。
	 * @return userPassword
	 */
	public String getUserPassword() {
	    return userPassword;
	}

	/**
	 * userPasswordを設定します。
	 * @param userPassword userPassword
	 */
	public void setUserPassword(String userPassword) {
	    this.userPassword = userPassword;
	}

	/**
	 * systemInfoを取得します。
	 * @return systemInfo
	 */
	public SystemGroupBean getSystemInfo() {
	    return systemInfo;
	}

	/**
	 * systemInfoを設定します。
	 * @param systemInfo systemInfo
	 */
	public void setSystemInfo(SystemGroupBean systemInfo) {
	    this.systemInfo = systemInfo;
	}

	/**
	 * listSystemGroupBeanを取得します。
	 * @return listSystemGroupBean
	 */
	public List<SystemGroupBean> getListSystemGroupBean() {
	    return listSystemGroupBean;
	}

	/**
	 * listSystemGroupBeanを設定します。
	 * @param listSystemGroupBean listSystemGroupBean
	 */
	public void setListSystemGroupBean(List<SystemGroupBean> listSystemGroupBean) {
	    this.listSystemGroupBean = listSystemGroupBean;
	}

	public String getValueCustomerCd() {
		return valueCustomerCd;
	}

	public void setValueCustomerCd(String valueCustomerCd) {
		this.valueCustomerCd = valueCustomerCd;
	}

}
