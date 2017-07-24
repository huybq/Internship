package jp.co.cyms.apps.faa001.bean;

import java.io.Serializable;

import jp.co.cyms.base.BaseDBBean;

/**
 * UserBean class
 *
 * @author tichnv
 * @since 2016/11/22
 */
public class UserBean extends BaseDBBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userId;

	private String userPassword;

	private String userAuthorityCd;

	private String userAuthorityName;

	private String userName;

	private String userCompanyCd;

	private String userCompanyName;

	private String territoryCd;

	private String systemId;

//	private List<CustomerCdBean> listCustomerCdBean;
//
//	private String customerCd;
//
//	private String customerName;

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
	 * userAuthorityCdを取得します。
	 * @return userAuthorityCd
	 */
	public String getUserAuthorityCd() {
	    return userAuthorityCd;
	}

	/**
	 * userAuthorityCdを設定します。
	 * @param userAuthorityCd userAuthorityCd
	 */
	public void setUserAuthorityCd(String userAuthorityCd) {
	    this.userAuthorityCd = userAuthorityCd;
	}

	/**
	 * userAuthorityNameを取得します。
	 * @return userAuthorityName
	 */
	public String getUserAuthorityName() {
	    return userAuthorityName;
	}

	/**
	 * userAuthorityNameを設定します。
	 * @param userAuthorityName userAuthorityName
	 */
	public void setUserAuthorityName(String userAuthorityName) {
	    this.userAuthorityName = userAuthorityName;
	}

	/**
	 * userNameを取得します。
	 * @return userName
	 */
	public String getUserName() {
	    return userName;
	}

	/**
	 * userNameを設定します。
	 * @param userName userName
	 */
	public void setUserName(String userName) {
	    this.userName = userName;
	}

	/**
	 * userCompanyCdを取得します。
	 * @return userCompanyCd
	 */
	public String getUserCompanyCd() {
	    return userCompanyCd;
	}

	/**
	 * userCompanyCdを設定します。
	 * @param userCompanyCd userCompanyCd
	 */
	public void setUserCompanyCd(String userCompanyCd) {
	    this.userCompanyCd = userCompanyCd;
	}

	/**
	 * userCompanyNameを取得します。
	 * @return userCompanyName
	 */
	public String getUserCompanyName() {
	    return userCompanyName;
	}

	/**
	 * userCompanyNameを設定します。
	 * @param userCompanyName userCompanyName
	 */
	public void setUserCompanyName(String userCompanyName) {
	    this.userCompanyName = userCompanyName;
	}

	/**
	 * territoryCdを取得します。
	 * @return territoryCd
	 */
	public String getTerritoryCd() {
	    return territoryCd;
	}

	/**
	 * territoryCdを設定します。
	 * @param territoryCd territoryCd
	 */
	public void setTerritoryCd(String territoryCd) {
	    this.territoryCd = territoryCd;
	}

	/**
	 * systemIdを取得します。
	 * @return systemId
	 */
	public String getSystemId() {
	    return systemId;
	}

	/**
	 * systemIdを設定します。
	 * @param systemId systemId
	 */
	public void setSystemId(String systemId) {
	    this.systemId = systemId;
	}

//	public List<CustomerCdBean> getListCustomerCdBean() {
//		return listCustomerCdBean;
//	}
//
//	public void setListCustomerCdBean(List<CustomerCdBean> listCustomerCdBean) {
//		this.listCustomerCdBean = listCustomerCdBean;
//	}
//
//	public String getCustomerCd() {
//		return customerCd;
//	}
//
//	public void setCustomerCd(String customerCd) {
//		this.customerCd = customerCd;
//	}
//
//	public String getCustomerName() {
//		return customerName;
//	}
//
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}

}
