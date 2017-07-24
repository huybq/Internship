package jp.co.cyms.apps.fam001.bean;

import java.io.Serializable;

import jp.co.cyms.base.BaseDBBean;

/**
 * Bean Pam0011Bean
 *
 * @author ninhnv
 * @since 2016/11/30
 */
public class Pam0011Bean  extends BaseDBBean implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String category;
	private String classMst;
	private String cdPk;
	private String name;
	private String column1;
	private String column2;
	private String column3;
	private String column4;
	private String column5;
	private String time1;
	private String updateUser;
	private String updatedDtUtc;
	private String updatedDtServer;
	private String exclusiveFg;

	/** Time zone */
	private int timeZone;

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getClassMst() {
		return classMst;
	}
	public void setClassMst(String classMst) {
		this.classMst = classMst;
	}
	public String getCdPk() {
		return cdPk;
	}
	public void setCdPk(String cdPk) {
		this.cdPk = cdPk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColumn1() {
		return column1;
	}
	public void setColumn1(String column1) {
		this.column1 = column1;
	}
	public String getColumn2() {
		return column2;
	}
	public void setColumn2(String column2) {
		this.column2 = column2;
	}
	public String getColumn3() {
		return column3;
	}
	public void setColumn3(String column3) {
		this.column3 = column3;
	}
	public String getColumn4() {
		return column4;
	}
	public void setColumn4(String column4) {
		this.column4 = column4;
	}
	public String getColumn5() {
		return column5;
	}
	public void setColumn5(String column5) {
		this.column5 = column5;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdatedDtUtc() {
		return updatedDtUtc;
	}
	public void setUpdatedDtUtc(String updatedDtUtc) {
		this.updatedDtUtc = updatedDtUtc;
	}
	public String getUpdatedDtServer() {
		return updatedDtServer;
	}
	public void setUpdatedDtServer(String updatedDtServer) {
		this.updatedDtServer = updatedDtServer;
	}
	public String getExclusiveFg() {
		return exclusiveFg;
	}
	public void setExclusiveFg(String exclusiveFg) {
		this.exclusiveFg = exclusiveFg;
	}
	public int getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(int timeZone) {
		this.timeZone = timeZone;
	}


}
