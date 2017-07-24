package jp.co.cyms.common.action;

import java.util.Map;

import jp.co.cyms.apps.fam004.bl.Pam0041BL;
import jp.co.cyms.base.BaseAction;

import com.google.gson.Gson;

/**
 * Common Action class
 *
 * @author tichnv
 *
 */
public class CommonAction extends BaseAction {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	protected String sysMessage;

	/* Initiate collections contain request parameter. */
	private Map<String, Object>	reqParams;

	private String reportErr;
	/**
	 * Get all message.
	 *
	 * @return String
	 */
	public String execute() {
		Pam0041BL pam0041BL = new Pam0041BL();
		Gson gson = new Gson();
		userInfo = this.getUserInfo();

		/** Check userInfo not null */
		if (userInfo != null) {
			sysMessage = gson.toJson(pam0041BL.getAllMessage(userInfo.getSystemId()));
		}
		return SUCCESS;
	}

	/**
	 * Validation export.
	 * @return String
	 * @throws Exception
	 */
	/*public String validationExport() throws Exception {
		LOG.info("------> validationExport start <------");
		*//** Initialize ExportBL *//*
		ExportBL exportBL = new ExportBL();
		try {
			UserBean userBean = getUserInfo();
			 Get folder template 
			SysParam sysParamTemplateFolder = exportBL.getMcmsSysparaByKey(
					Constant.TEMP_TYPE, Constant.TEMPLATE_FOLDER, userBean.getSystemId());

			 Get file template
			SysParam sysParamTemplateFile = exportBL.getMcmsSysparaByKey(
					Constant.FILE_TYPE,reportId, userBean.getSystemId());

			String templateFolder = sysParamTemplateFolder.getValue();
			String templateName = sysParamTemplateFile.getValue();
			String templateFile = templateFolder + "/" + templateName;

			// Check templateFolder isExist.
			if (!FileUtil.isFileExist(templateFolder)) {
				reportErr = "EA-0050";
				LOG.info("------> Folder template does not exist ! <------");
				return SUCCESS;
			}

			// Check templateFile isExist.
			if (!FileUtil.isFileExist(templateFile)) {

				reportErr = "EA-0051";
				LOG.info("------> File template does not exist ! <------");
				return SUCCESS;
			}

			 Get out put folder path 
			SysParam sysParamOutputFolder = exportBL.getMcmsSysparaByKey(
					Constant.TEMP_TYPE, Constant.OUTPUT_FOLDER, userBean.getSystemId());
			String outputFolder = sysParamOutputFolder.getValue();

			// Check outputFolder isExist.
			if (!FileUtil.isFileExist(outputFolder)) {

				LOG.info("------> Output folder does not exist ! <------");
				reportErr = "EA-0052";
				return SUCCESS;
			}
		} catch (Exception e) {
			LOG.error(e.getMessage());
			reportErr = "EA-0000";
			throw e;
		}
		LOG.info("------> validationExport end <------");
		return SUCCESS;
	}
*/
	/**
	 * Export data for R1 03.
	 *
	 * @param request
	 * @param response
	 * @return String : key notification to view.
	 * @throws Exception
	 *//*
	public String exportR103() throws Exception {
		Pab0021SReportBL pab0021SReportBL = new Pab0021SReportBL();
		HttpServletResponse response = ServletActionContext.getResponse();

		 【出力】ボタンクリックのハンドル 
		LOG.info("------> exportR103 Start <------");
		 Assign a Map for reqParams 
		reqParams = new HashMap<String, Object>();

		 put systemId
		reqParams.put(Constant.SYSTEM_ID_PARAM, getUserInfo().getSystemId());

		try {
			 Enforce export reports. 
			Map<String, Object> resultMap = pab0021SReportBL.exportExecute(reqParams, response);

			 Pulled out of the implementation status report 
			Boolean success = (Boolean) resultMap.get(SUCCESS);

			 Get error code. 
			String errorCode = (String) resultMap.get("errorCode");

			
			 * Check success is true and errorMsg is null or empty then write
			 * log success.
			 
			if (success && StringUtil.isNullOrEmpty(errorCode)) {
				LOG.info("Download file successfully");
			}
			else { // Check success is false then write log error.
				LOG.info("*******Something had error!!!");				
			}
		}
		catch (Exception ex) {
			LOG.info("------> exportR103 Exception End <------");
			errCode = "EA-0000";
		}
		LOG.info("*******exportR103 end");
		return null;
	}*/

	/**
	 * @return the sysMessage
	 */
	public String getSysMessage() {
		return sysMessage;
	}

	/**
	 * @param sysMessage
	 *            the sysMessage to set
	 */
	public void setSysMessage(String sysMessage) {
		this.sysMessage = sysMessage;
	}

	/**
	 * @return the reportErr
	 */
	public String getReportErr() {
		return reportErr;
	}

	/**
	 * @param reportErr the reportErr to set
	 */
	public void setReportErr(String reportErr) {
		this.reportErr = reportErr;
	}

	public String redirectIntosac0021s() throws Exception {
		return SUCCESS;
	}

	public String redirectToSac0031s() throws Exception {
		return SUCCESS;
	}

	/**
	 * Redirect to SAC0011S Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToSac0011s() throws Exception{
		return SUCCESS;
	}
	
	/**
	 * Redirect to SAB0021S Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToSab002s() throws Exception{
		return SUCCESS;
	}

	/**
	 * Redirect to FAC005S Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToFac005s() throws Exception{
		return SUCCESS;
	}

	/**
	 * Redirect to FAC003S Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToFac003s() throws Exception{
		return SUCCESS;
	}

	/**
	 * Redirect to Home Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToHome() throws Exception{
		return SUCCESS;
	}

	/**
	 * Redirect to FAC004 Screen
	 * @return
	 * @throws Exception
	 */
	public String redirectToFad004() throws Exception{
		return SUCCESS;
	}
}
