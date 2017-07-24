package jp.co.cyms.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.cyms.apps.faa001.bean.MenuBean;
import jp.co.cyms.apps.faa001.bean.SystemGroupBean;
import jp.co.cyms.apps.faa001.bean.Un1MstBean;
import jp.co.cyms.apps.faa001.bean.UserBean;
import jp.co.cyms.apps.faa001.bl.Paa0011BL;
import jp.co.cyms.apps.fam001.bean.Pam0011Bean;
import jp.co.cyms.apps.fam001.bl.Pam0011BL;
import jp.co.cyms.common.Constant;
import jp.co.cyms.common.DateUtil;
import jp.co.cyms.common.StringUtil;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tichnv
 *
 */
@SuppressWarnings("serial")
public abstract class BaseAction extends ActionSupport implements ServletRequestAware ,SessionAware{

	protected Map<String, Object> session;

	protected UserBean userInfo;

	protected SystemGroupBean systemGroupInfo;

	protected List<MenuBean> menuInfo;

	protected String currentFunctionId;

	protected String currentScreenId;
	
	protected String reportId;
	
	protected String errCode;
	
	protected HttpServletResponse response;
	
	protected DataSourceTransactionManager transactionManager; 
	
	protected String jobDate;
	
	protected String jobNo;
	
	protected String driverId;
	
	protected String tabletId;
	
	protected String screenType;
	
	protected HttpServletRequest request;
	
	protected String contextPath;
	/** Booking No */
	protected String bookingNo;
	/** Job Month */
	protected String jobMonth;
	/** Deleted Data Only */
	protected int deletedDataOnly;
	
	protected String workDate;
	
	protected String jobPatternHidden;
	
	protected String seqNoParam;
	
	protected String tabletIdParam;
	
	/** Date time from client */
	protected String clientTime;
	
	/** Time zone of Client */
	protected String timeZoneClient;
	
	protected String currentScreenName;
	
	@Override
 	public void setServletRequest(HttpServletRequest request) {
		this.request = request;  
    }

	/**
	 * @return the response
	 */
	public HttpServletResponse getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(HttpServletResponse response) {
		this.response = ServletActionContext.getResponse();
	}

	/**
	 * Struts2のResult：動的遷移
	 */
	public static final String DYNAMIC = "dynamicAction";

	public SystemGroupBean getSystemGroupInfo() {
		if (session != null) {
			return (SystemGroupBean) session.get(Constant.SESSION_KEY_SYSTEM_GROUP_INFO);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public BaseAction() {
		this.userInfo = new UserBean();
		transactionManager = new DataSourceTransactionManager();
		if (transactionManager == null) {
			ApplicationContext ac = WebApplicationContextUtils
					.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
			transactionManager = ac.getBean("transactionManager", DataSourceTransactionManager.class);
		}

		HttpServletRequest request = ServletActionContext.getRequest();
		List<MenuBean> menuInfo = (List<MenuBean>) request.getSession().getAttribute(Constant.SESSION_KEY_MENU_INFO);
		String currentPath = request.getServletPath();
		if (currentPath != null && !currentPath.contains("/common001") && !currentPath.contains("/redirect")) {
			// Get current screen name
			String functionId = currentPath.split("/")[2];
			String screenName = functionId.replace(".action", "");
			this.currentScreenName = doGetCurrentScreenName(screenName, menuInfo);
			if (session == null) {
				session = ActionContext.getContext().getSession();
			}
			session.put(Constant.SESSION_KEY_CURRENT_SCREEN_NAME, currentScreenName);
		}
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@SuppressWarnings("unchecked")
	public List<MenuBean> getMenuInfo() {
		if (session != null) {
			return (List<MenuBean>) session.get(Constant.SESSION_KEY_MENU_INFO);
		}
		return null;
	}

	public UserBean getUserInfo() {
		if (session != null) {
			return (UserBean) session.get(Constant.SESSION_KEY_USER_INFO);
		}
		return null;
	}

	public String getCurrentFunctionId() {
		if (session != null) {
			return (String) session.get(Constant.SESSION_KEY_CURRENT_FUNCTION_ID);
		}
		return null;
	}

	public String getCurrentScreenId() {
		if (session != null) {
			return (String) session.get(Constant.SESSION_KEY_CURRENT_SCREEN_ID);
		}
		return null;
	}
	
	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}	

	/**
	 * @return the errCode
	 */
	public String getErrCode() {
		return errCode;
	}

	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	/**
	 * @return the transactionManager
	 */
	public DataSourceTransactionManager getTransactionManager() {
		return transactionManager;
	}

	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(
			DataSourceTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	

	/**
	 * @return the jobDate
	 */
	public String getJobDate() {
		return jobDate;
	}

	/**
	 * @param jobDate the jobDate to set
	 */
	public void setJobDate(String jobDate) {
		this.jobDate = jobDate;
	}

	public String getBusinessDate() throws Exception {
		if (session != null) {
			Paa0011BL paa0011BL = new Paa0011BL();
			Un1MstBean un1MstBean = new Un1MstBean();
			un1MstBean.setCategory("SYS");
			un1MstBean.setClazz("01");
			un1MstBean.setCdPk("01");
			Un1MstBean serverInfo = paa0011BL.getUn1MstData(un1MstBean);
			un1MstBean.setCategory("DAT");
			un1MstBean.setClazz("02");
			un1MstBean.setCdPk(getSystemGroupInfo().getSystemId());
			Un1MstBean clientInfo = paa0011BL.getUn1MstData(un1MstBean);
			un1MstBean.setClazz("03");
			Un1MstBean startTimeInfo = paa0011BL.getUn1MstData(un1MstBean);
			String serverTimezone = null;
			String clientTimezone = null;
			String startTime = null;
			if (serverInfo != null) {
				serverTimezone = serverInfo.getTime1();
			}
			if (clientInfo != null) {
				clientTimezone = clientInfo.getTime1();
			}
			if (startTimeInfo != null) {
				startTime = startTimeInfo.getTime1();
			}
			return DateUtil.doGetBusinessDate(serverTimezone, clientTimezone, startTime);
		}
		return null;
	}
	
	/**
	 * Get time system with format
	 * @param format Format date dd/MMM/yyyy kk:mm:ss
	 * @return Date of SYSTEM
	 * @throws Exception
	 */
	public String getBusinessDate(String format) throws Exception {
		if (session != null) {
			Paa0011BL paa0011BL = new Paa0011BL();
			Un1MstBean un1MstBean = new Un1MstBean();
			un1MstBean.setCategory("SYS");
			un1MstBean.setClazz("01");
			un1MstBean.setCdPk("01");
			Un1MstBean serverInfo = paa0011BL.getUn1MstData(un1MstBean);
			un1MstBean.setCategory("DAT");
			un1MstBean.setClazz("02");
			un1MstBean.setCdPk(getSystemGroupInfo().getSystemId());
			Un1MstBean clientInfo = paa0011BL.getUn1MstData(un1MstBean);
			un1MstBean.setClazz("03");
			Un1MstBean startTimeInfo = paa0011BL.getUn1MstData(un1MstBean);
			String serverTimezone = null;
			String clientTimezone = null;
			String startTime = null;
			if (serverInfo != null) {
				serverTimezone = serverInfo.getTime1();
			}
			if (clientInfo != null) {
				clientTimezone = clientInfo.getTime1();
			}
			if (startTimeInfo != null) {
				startTime = startTimeInfo.getTime1();
			}
			return DateUtil.doGetBusinessDate(serverTimezone, clientTimezone, startTime, format);
		}
		return null;
	}
	
	/**
	 * Get Date time for report
	 * @param format Format date dd/MMM/yyyy KK:mm:ss
	 * @return Date of SYSTEM
	 * @throws Exception
	 */
	public String doGetDateForReport(String format) throws Exception {
		if (session != null) {
			Paa0011BL paa0011BL = new Paa0011BL();
			Un1MstBean un1MstBean = new Un1MstBean();
			un1MstBean.setCategory("DAT");
			un1MstBean.setClazz("02");
			un1MstBean.setCdPk(getSystemGroupInfo().getSystemId());
			Un1MstBean clientInfo = paa0011BL.getUn1MstData(un1MstBean);
			
			String clientTimezone = null;
			if (clientInfo != null) {
				clientTimezone = clientInfo.getTime1();
			}
			return DateUtil.doGetDateForReport2(clientTimezone, format, clientTime, timeZoneClient);
		}
		return null;
	}

	/**
	 * Get Local Time(Now)
	 *
	 * @return business date String
	 */
	public Date doGetLocalTime() throws Exception {
		Paa0011BL paa0011BL = new Paa0011BL();
		Un1MstBean un1MstBean = new Un1MstBean();
		un1MstBean.setCategory("SYS");
		un1MstBean.setClazz("01");
		un1MstBean.setCdPk("01");
		Un1MstBean serverInfo = paa0011BL.getUn1MstData(un1MstBean);
		un1MstBean.setCategory("DAT");
		un1MstBean.setClazz("02");
		un1MstBean.setCdPk(getSystemGroupInfo().getSystemId());
		Un1MstBean clientInfo = paa0011BL.getUn1MstData(un1MstBean);
		String serverTimezone = null;
		String clientTimezone = null;
		if (serverInfo != null) {
			serverTimezone = serverInfo.getTime1();
		}
		if (clientInfo != null) {
			clientTimezone = clientInfo.getTime1();
		}
		Date localTime = DateUtil.addMinute(new Date(), -(DateUtil.timezoneToMinute(serverTimezone)));
		return localTime = DateUtil.addMinute(localTime, DateUtil.timezoneToMinute(clientTimezone));
	}

	@Override
	public void addActionError(String messageId) {
		addActionError(messageId, (String[]) null);
	}

	/**
	 * エラーメッセージIDを追加します。
	 *
	 * @param messageId
	 *            メッセージID
	 * @param params
	 *            パラメタ
	 */
	public void addActionError(String messageId, String... params) {
		String message = super.getText(messageId, params);
		super.addActionError(message);
	}

	/**
	 * 呼出元のイベントIDを取得します。
	 *
	 * @return イベントID
	 */
	public String getEventId() {
		return ActionContext.getContext().getName();
	}

	/**
	 * 動的遷移先の情報を設定します。
	 *
	 * @param functionId
	 *            機能ID
	 * @param screenId
	 *            画面ID
	 * @return 結果
	 */
	public String setDynamicAction(String functionId, String screenId) {
		return setDynamicActionImpl(functionId, screenId);
	}

	/**
	 * 動的遷移情報を設定します。
	 *
	 * @param functionId
	 *            機能ID
	 * @param screenId
	 *            画面ID
	 * @return 結果
	 * @throws Exception 
	 */
	private String setDynamicActionImpl(String functionId, String screenId) {
		this.currentFunctionId = functionId;
		this.currentScreenId = screenId;
		
		// Get current screen name
		//this.currentScreenName = doGetCurrentScreenName(screenId);
		
		session.put(Constant.SESSION_KEY_CURRENT_FUNCTION_ID, currentFunctionId);
		session.put(Constant.SESSION_KEY_CURRENT_SCREEN_ID, currentScreenId);
		session.put(Constant.SESSION_KEY_CURRENT_SCREEN_NAME, currentScreenName);
		return DYNAMIC;
	}

	public String getContextPath() {
		if (request == null) {
			return null;
		}
		return contextPath = request.getContextPath();
	}
	
	/**
	 * Get time zone  
	 * @param category
	 * @param classCd
	 * @param Cd
	 * @return time zone
	 */
	public String doGetTimeZoneSerVer() throws Exception{
		Pam0011BL bl = new Pam0011BL();
		Pam0011Bean pam0011Bean = new Pam0011Bean();		
		pam0011Bean.setCategory(Constant.CATEGORY_SYS);
		pam0011Bean.setClassMst(Constant.CLASS_01);
		pam0011Bean.setCdPk(Constant.CLASS_01);
		Pam0011Bean beanResult = bl.selectUnion1ById(pam0011Bean);
		if(beanResult != null){
			return beanResult.getTime1();
		}
		return null;
		
	}
	
	public String doGetCurrentScreenName(String screenId, List<MenuBean> menuInfo){
		if(menuInfo != null) {
			for(MenuBean bean: menuInfo) {
				if(screenId.equals(bean.getScreenId())) {
					return bean.getMenuName();
				}
			}
		}
		return "";
	}
	
	/**
	 * Get time zone  
	 * @param category
	 * @param classCd
	 * @param systemId
	 * @return time zone
	 */
	public String doGetTimeZoneSystem(String systemId){
		Pam0011BL bl = new Pam0011BL();
		Pam0011Bean pam0011Bean = new Pam0011Bean();		
		pam0011Bean.setCategory(Constant.CATEGORY_DAT);
		pam0011Bean.setClassMst(Constant.CLASS_02);
		pam0011Bean.setCdPk(systemId);
		Pam0011Bean beanResult = bl.selectUnion1ById(pam0011Bean);
		if(beanResult != null){
			return beanResult.getTime1();
		}
		return null;
	}
	
	/**
	 * get System Time (UTC)
	 * 
	 * @return int timeZoneNum
	 * @throws Exception 
	 */
	public int doGetSystemTimeUTC() throws Exception {
		// Get timeZone
		String timeZone = doGetTimeZoneSerVer();
		ArrayList<Integer> arrTimeZone = splitTimeZone(timeZone);
		int timeZoneNum = 0;
		if (arrTimeZone != null && arrTimeZone.size() > 0) {
			timeZoneNum = arrTimeZone.get(0);
		}
		return timeZoneNum;
	}
	
	/**
	 *  get System Time (Local)
	 * 
	 * @return int timeSystem
	 * @throws Exception 
	 */
	public int doGetSystemTimeLocal(String systemId) throws Exception {
		int timeZoneNum = doGetSystemTimeUTC();
		// Get/Set time of current system
		String timeSystemId = doGetTimeZoneSystem(systemId);
		ArrayList<Integer> arrTimeSystem = splitTimeZone(timeSystemId);
		int timeSystem = 0;
		if (arrTimeSystem != null && arrTimeSystem.size() > 0) {
			// System Time (Local) = Syatem Time (UTC) + [UN1_MST](DAT,02) Time Difference
			timeSystem = timeZoneNum - arrTimeSystem.get(0);
		}
		return timeSystem;
	}
	
	/**
	 * Split timezone and return hour-minute
	 * @param timeZone Time Zone
	 * @return listTimeZone ArrayList<Integer>
	 */
	public ArrayList<Integer> splitTimeZone(String timeZone) {
		ArrayList<Integer> listTimeZone = new ArrayList<Integer>();
		if (!StringUtil.isEmpty(timeZone)) {
			String[] arrTimeZone = timeZone.split(":");
			if (arrTimeZone != null) {
				listTimeZone.add(Integer.parseInt(arrTimeZone[0]));
				listTimeZone.add(Integer.parseInt(arrTimeZone[1])); 
			}
		}
		return listTimeZone;
	}

	/**
	 * @return the jobNo
	 */
	public String getJobNo() {
		return jobNo;
	}

	/**
	 * @param jobNo the jobNo to set
	 */
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	/**
	 * @return the driverId
	 */
	public String getDriverId() {
		return driverId;
	}

	/**
	 * @param driverId the driverId to set
	 */
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	/**
	 * @return the tabletId
	 */
	public String getTabletId() {
		return tabletId;
	}

	/**
	 * @param tabletId the tabletId to set
	 */
	public void setTabletId(String tabletId) {
		this.tabletId = tabletId;
	}

	/**
	 * @return the screenType
	 */
	public String getScreenType() {
		return screenType;
	}

	/**
	 * @param screenType the screenType to set
	 */
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	/**
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return the bookingNo
	 */
	public String getBookingNo() {
		return bookingNo;
	}

	/**
	 * @param bookingNo the bookingNo to set
	 */
	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	/**
	 * @return the jobMonth
	 */
	public String getJobMonth() {
		return jobMonth;
	}

	/**
	 * @param jobMonth the jobMonth to set
	 */
	public void setJobMonth(String jobMonth) {
		this.jobMonth = jobMonth;
	}

	/**
	 * @return the workDate
	 */
	public String getWorkDate() {
		return workDate;
	}

	/**
	 * @param workDate the workDate to set
	 */
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	/**
	 * @return the deletedDataOnly
	 */
	public int getDeletedDataOnly() {
		return deletedDataOnly;
	}

	/**
	 * @param deletedDataOnly the deletedDataOnly to set
	 */
	public void setDeletedDataOnly(int deletedDataOnly) {
		this.deletedDataOnly = deletedDataOnly;
	}

	/**
	 * @return the jobPatternHidden
	 */
	public String getJobPatternHidden() {
		return jobPatternHidden;
	}

	/**
	 * @param jobPatternHidden the jobPatternHidden to set
	 */
	public void setJobPatternHidden(String jobPatternHidden) {
		this.jobPatternHidden = jobPatternHidden;
	}

	/**
	 * @return the seqNoParam
	 */
	public String getSeqNoParam() {
		return seqNoParam;
	}

	/**
	 * @param seqNoParam the seqNoParam to set
	 */
	public void setSeqNoParam(String seqNoParam) {
		this.seqNoParam = seqNoParam;
	}

	/**
	 * @return the tabletIdParam
	 */
	public String getTabletIdParam() {
		return tabletIdParam;
	}

	/**
	 * @param tabletIdParam the tabletIdParam to set
	 */
	public void setTabletIdParam(String tabletIdParam) {
		this.tabletIdParam = tabletIdParam;
	}
	
	/**
	 * @return the clientTime
	 */
	public String getClientTime() {
		return clientTime;
	}

	/**
	 * @param clientTime the clientTime to set
	 */
	public void setClientTime(String clientTime) {
		this.clientTime = clientTime;
	}

	/**
	 * @return the timeZoneClient
	 */
	public String getTimeZoneClient() {
		return timeZoneClient;
	}

	/**
	 * @param timeZoneClient the timeZoneClient to set
	 */
	public void setTimeZoneClient(String timeZoneClient) {
		this.timeZoneClient = timeZoneClient;
	}

	public String getCurrentScreenName() {
		if (session != null) {
			return (String) session.get(Constant.SESSION_KEY_CURRENT_SCREEN_NAME);
		}
		return "";
	}

	public void setCurrentScreenName(String currentScreenName) {
		this.currentScreenName = currentScreenName;
	}
}
