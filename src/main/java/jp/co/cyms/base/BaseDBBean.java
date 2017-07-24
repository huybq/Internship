/*
 * CLASS   : BaseDBBean
 * PACKAGE : jp.co.cyms.base
 * VERSION : 1.0
 * HISTORY : 2014-08-01　LSC　LU CREATE
 */
package jp.co.cyms.base;

import java.util.Date;

import jp.co.cyms.common.SystemCommon;

/**
 * BaseDBBean
 *
 * @author LSC LU
 * @since 2014/08/01
 */
public abstract class BaseDBBean extends BaseBean {

	/**
	 * regUsr
	 */
	private String registeredUser;
	/**
	 * regDTime
	 */
	private Date registeredDt = new Date();
	/**
	 * updUsr
	 */
	private String updatedUser;
	/**
	 * updDTime
	 */
	private Date updatedDt = new Date();

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return SystemCommon.languageCode();
	}

	/**
	 * @return the registeredUser
	 */
	public String getRegisteredUser() {
		return registeredUser;
	}

	/**
	 * @param registeredUser
	 *            the registeredUser to set
	 */
	public void setRegisteredUser(String registeredUser) {
		this.registeredUser = registeredUser;
	}

	/**
	 * @return the updatedUser
	 */
	public String getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * @param updatedUser
	 *            the updatedUser to set
	 */
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * @return the registeredDt
	 */
	public Date getRegisteredDt() {
		return registeredDt;
	}

	/**
	 * @param registeredDt
	 *            the registeredDt to set
	 */
	public void setRegisteredDt(Date registeredDt) {
		this.registeredDt = registeredDt;
	}

	/**
	 * @return the updatedDt
	 */
	public Date getUpdatedDt() {
		return updatedDt;
	}

	/**
	 * @param updatedDt
	 *            the updatedDt to set
	 */
	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

}
