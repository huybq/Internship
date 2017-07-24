package jp.co.cyms.apps.faa001.bean;

import java.io.Serializable;

import jp.co.cyms.base.BaseDBBean;

public class CustomerCdBean extends BaseDBBean implements Serializable  {

	private static final long serialVersionUID = 1L;

	private String customerCd;

	private String customerName;

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


}
