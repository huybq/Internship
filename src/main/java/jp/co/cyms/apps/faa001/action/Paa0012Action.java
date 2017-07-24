package jp.co.cyms.apps.faa001.action;

import jp.co.cyms.apps.faa001.form.Paa0011Form;

/**
 *
 * @author tichnv
 * @since 2016/11/22
 */
@SuppressWarnings("serial")
public class Paa0012Action extends Paa0011Form {

	private String redirectFunctionId;

	private String redirectScreenId;

	@Override
	public String execute() {
		return SUCCESS;
	}
	/**
	 * Redirect action
	 *
	 * @return String
	 */
	public String doEvent01() {

		return super.setDynamicAction(redirectFunctionId, redirectScreenId);
	}
	/**
	 * redirectFunctionIdを取得します。
	 * @return redirectFunctionId
	 */
	public String getRedirectFunctionId() {
	    return redirectFunctionId;
	}
	/**
	 * redirectFunctionIdを設定します。
	 * @param redirectFunctionId redirectFunctionId
	 */
	public void setRedirectFunctionId(String redirectFunctionId) {
	    this.redirectFunctionId = redirectFunctionId;
	}
	/**
	 * redirectScreenIdを取得します。
	 * @return redirectScreenId
	 */
	public String getRedirectScreenId() {
	    return redirectScreenId;
	}
	/**
	 * redirectScreenIdを設定します。
	 * @param redirectScreenId redirectScreenId
	 */
	public void setRedirectScreenId(String redirectScreenId) {
	    this.redirectScreenId = redirectScreenId;
	}

}
