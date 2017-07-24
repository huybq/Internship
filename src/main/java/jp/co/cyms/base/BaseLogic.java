/*
 * CLASS   : BaseLogic
 * PACKAGE : jp.co.cyms.base
 * VERSION : 1.0
 * HISTORY : 2014-08-01�?SC�?U CREATE
 */
package jp.co.cyms.base;

import java.util.List;

/**
 * BaseLogic
 * 
 * @author LSC LU
 * @since 2014/08/01
 */
public abstract class BaseLogic {

	/**
	 * resultKey
	 */
	protected String resultKey;
	/**
	 * resultStatus
	 */
	protected String resultStatus;
	/**
	 * resultMessageLists
	 */
	protected List<String> resultMessageList;
	/**
	 * errorMessageList
	 */
	/*protected List<ValidMsgBean> errorMessageList;

	*//**
	 * addResultMessage
	 * 
	 * @param message String
	 *//*
	protected void addResultMessage(String message) {
		if (resultMessageList == null) {
			resultMessageList = new ArrayList<String>();
		}
		resultMessageList.add(message);
	}

	*//**
	 * clearResultMessage
	 * 
	 * @param message String
	 *//*
	protected void clearResultMessage(String message) {
		if (resultMessageList == null) {
			resultMessageList = new ArrayList<String>();
		}
		resultMessageList.clear();
	}

	*//**
	 * addErrorMessage
	 * 
	 * @param message ValidMsgBean
	 *//*
	protected void addErrorMessage(ValidMsgBean message) {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		errorMessageList.add(message);
	}

	*//**
	 * addErrorMessage
	 * 
	 * @param field String
	 * @param labelId String
	 * @param msgId String
	 * @throws Exception Exception
	 *//*
	protected void addErrorMessage(String field, String labelId, String msgId) throws Exception {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		ValidMsgBean message = new ValidMsgBean(field, labelId, msgId);
		errorMessageList.add(message);
	}

	*//**
	 * addErrorMessage
	 * 
	 * @param field String
	 * @param labelId String
	 * @param msgId String
	 * @param params String[]
	 * @throws Exception Exception
	 *//*
	protected void addErrorMessage(String field, String labelId, String msgId, String[] params) throws Exception {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		ValidMsgBean message = new ValidMsgBean(field, labelId, msgId, params);
		errorMessageList.add(message);
	}

	*//**
	 * addGridErrorMessage
	 * 
	 * @param lineNo String
	 * @param item String
	 * @param msgId String
	 * @throws Exception Exception
	 *//*
	protected void addGridErrorMessage(String lineNo, String item, String msgId) throws Exception {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		ValidMsgBean message = new ValidMsgBean();
		message.setErrorFieldLabel("Seq:" + lineNo + " [" + item + "]");
		message.setErrorMsg(Language.getMessage(msgId));
		errorMessageList.add(message);
	}

	*//**
	 * addCustomErrorMessage
	 * 
	 * @param field String
	 * @param msgId String
	 * @throws Exception Exception
	 *//*
	protected void addCustomErrorMessage(String field, String msgId) throws Exception {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		ValidMsgBean message = new ValidMsgBean();
		message.setErrorFieldLabel(field);
		message.setErrorMsg(Language.getMessage(msgId));
		errorMessageList.add(message);
	}

	*//**
	 * clearErrorMessage
	 * 
	 * @param message ValidMsgBean
	 *//*
	protected void clearErrorMessage(String message) {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		resultMessageList.clear();
	}

	*//**
	 * @return the resultKey
	 *//*
	public String getResultKey() {
		return resultKey;
	}

	*//**
	 * @return the resultMessageList
	 *//*
	public List<String> getResultMessageList() {
		return resultMessageList;
	}

	*//**
	 * @return the resultStatus
	 *//*
	public String getResultStatus() {
		return resultStatus;
	}

	*//**
	 * @return errorMessageList
	 *//*
	public List<ValidMsgBean> getErrorMessageList() {
		if (errorMessageList == null) {
			errorMessageList = new ArrayList<ValidMsgBean>();
		}
		return errorMessageList;
	}

	*//**
	 * @param errorMessageList errorMessageList
	 *//*
	public void setErrorMessageList(List<ValidMsgBean> errorMessageList) {
		this.errorMessageList = errorMessageList;
	}*/
}
