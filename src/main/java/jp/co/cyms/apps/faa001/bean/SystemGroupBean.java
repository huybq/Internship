package jp.co.cyms.apps.faa001.bean;

import java.io.Serializable;

import jp.co.cyms.base.BaseDBBean;
/**
 * SystemGroupBean class
 *
 * @author tichnv
 * @since 2016/11/22
 */
public class SystemGroupBean extends BaseDBBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String systemId;

	private String systemName;

	private String systemType;

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

	/**
	 * systemNameを取得します。
	 * @return systemName
	 */
	public String getSystemName() {
	    return systemName;
	}

	/**
	 * systemNameを設定します。
	 * @param systemName systemName
	 */
	public void setSystemName(String systemName) {
	    this.systemName = systemName;
	}

	/**
	 * systemTypeを取得します。
	 * @return systemType
	 */
	public String getSystemType() {
	    return systemType;
	}

	/**
	 * systemTypeを設定します。
	 * @param systemType systemType
	 */
	public void setSystemType(String systemType) {
	    this.systemType = systemType;
	}


}
