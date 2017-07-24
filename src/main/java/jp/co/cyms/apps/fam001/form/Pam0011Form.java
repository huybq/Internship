package jp.co.cyms.apps.fam001.form;

import jp.co.cyms.base.BaseAction;

/**
 * Form Pam0011Form
 *
 * @author ninhnv
 * @since 2016/11/30
 */
public class Pam0011Form extends BaseAction{
	/**
	 * デフォルトシリアルバージョンID
	 */
	private static final long serialVersionUID = 1L;

	/** variable values get from ajax */
	protected String values;

	/** variable category get from ajax */
	protected String category;

	/** variable classMst get from ajax */
	protected String classMst;

	/** variable cdPk get from ajax */
	protected String cdPk;

	/** variable name get from ajax */
	protected String name;

	/** variable column1 get from ajax */
	protected String column1;

	/** variable column2 get from ajax */
	protected String column2;

	/** variable column3 get from ajax */
	protected String column3;

	/** variable column4 get from ajax */
	protected String column4;

	/** variable column5 get from ajax */
	protected String column5;

	/** variable time1 get from ajax */
	protected String time1;

	/** variable checkInsert get from ajax */
	protected Integer checkInsert;

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

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

	public Integer getCheckInsert() {
		return checkInsert;
	}

	public void setCheckInsert(Integer checkInsert) {
		this.checkInsert = checkInsert;
	}

}
