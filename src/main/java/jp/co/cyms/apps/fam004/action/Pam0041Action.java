package jp.co.cyms.apps.fam004.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import jp.co.cyms.apps.fam004.bean.Pam0041Bean;
import jp.co.cyms.apps.fam004.bl.Pam0041BL;
import jp.co.cyms.apps.fam004.form.Pam0041Form;

/**
 * Pam0041Action Union 4 master
 * @author namnv
 *
 */
public class Pam0041Action extends Pam0041Form{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/** List Union 4 Master */
	private List<Pam0041Bean> listUnion4;

	/** List Error */
	private Map<String, String> listArrError;

	/** Pam0041Bean bean */
	private Pam0041Bean pam0041;

	/** Message ID */
	private String messageId;

	/** Business logic class */
	Pam0041BL pam0041BL = new Pam0041BL();

	/**
	 * Method init fam004 screen
	 * @return result
	 */
	public String initScreen() throws Exception {
		LOG.info("***********Initial Union 4 Master Start***********", "");

		// Get user info
		userInfo = this.getUserInfo();

		Pam0041Bean param = new Pam0041Bean();
		// Set data for param
		param.setSystemId(userInfo.getSystemId());
		/*param.setCustomerCd(userInfo.getCustomerName());*/

		LOG.info("***********Initial Union 4 Master End***********", "");

		return SUCCESS;
	}
	
	/**
	 * Method execute when init fam004 screen
	 * @return result
	 */
	@Override
	public String execute() throws Exception {
		LOG.info("***********get List Union 4 Master Start***********", "");

		// Get user info
		userInfo = this.getUserInfo();

		Pam0041Bean param = new Pam0041Bean();
		// Set data for param
		param.setSystemId(userInfo.getSystemId());
		/*param.setCustomerCd(userInfo.getCustomerName());*/

		// Get list union 4 master
		listUnion4 = pam0041BL.listgetListUnion4(param);

		LOG.info("***********get List Union 4 Master End***********", "");

		return SUCCESS;
	}

	/**
	 * Get info union 4 Master for update
	 * @return
	 */
	public String receiveInfoUnion4(){
		LOG.info("***********get Info Union 4 Master Start***********", "");

		// Get user info
		userInfo = this.getUserInfo();

		Pam0041Bean param = new Pam0041Bean();
		// Set data for bean
		param.setSystemId(userInfo.getSystemId());
		param.setCategory(category);
		param.setClassUnion4(classUnion4);
		param.setCd1Pk(cd1Pk);
		param.setCd2Pk(cd2Pk);
		/*param.setCustomerCd(userInfo.getCustomerName());*/

		// Get a union 4 for edit
		pam0041 = pam0041BL.getUnion5(param);

		LOG.info("***********Info Union 4 Master End***********", "");

		return SUCCESS;
	}

	/**
	 * Insert/update data union 4 master
	 * @throws Exception 
	 */
	public String saveUnion4Master() throws Exception {
		LOG.info("***********Save Union 4 Master Start***********");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		// Get user info
		userInfo = this.getUserInfo();

		// Call method validate before insert
		validateForm();

		try {
			if ("true".equals(this.listArrError.get("flag"))) {
				Pam0041Bean param = new Pam0041Bean();
				// Set data for bean
				param.setSystemId(userInfo.getSystemId());
				param.setCategory(category);
				param.setClassUnion4(classUnion4);
				param.setCd1Pk(cd1Pk);
				param.setCd2Pk(cd2Pk);
				param.setName(name);
				param.setColumn1(column1);
				param.setColumn2(column2);
				param.setColumn3(column3);
				param.setColumn4(column4);
				param.setColumn5(column5);
				/*param.setCustomerCd(userInfo.getCustomerName());*/
				param.setUpdatedUser(userInfo.getUserId());

				String timeZone = doGetTimeZoneSerVer();
				String[] arrTimeZone = timeZone.split(":");
				if (arrTimeZone != null) {
					param.setTimeZone(Integer.parseInt(arrTimeZone[0]));
				}

				if ("NEW".equals(mode)) {
					if (!checkDuplicate(param)) {
//						param.setCustomerCd("PRC");
						// Insert union 4 master
						pam0041BL.insertUnion4(param);
					}

				} else {
					// Update union 4 master
					pam0041BL.updateUnion4(param);
				}
				transactionManager.commit(transactionStatus);
			}
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
		}


		LOG.info("***********Save Union 4 Master End***********");

		return SUCCESS;
	}

	/**
	 * Delete union 4 master
	 */
	public String delUnion4Master() {
		LOG.info("***********Delete Union 4 Start***********");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		// Get user info
		userInfo = this.getUserInfo();
		String[] beanTemps = valuesDelete.split(",");
		List<Pam0041Bean> params = new ArrayList<Pam0041Bean>();

		try {
			// Browser each data from list data selected to delete
			for (String beanTemp : beanTemps) {
				Pam0041Bean param = new Pam0041Bean();
				String[] pam0041BeanTemp = beanTemp.split(":");
				// Set data for bean
				param.setSystemId(userInfo.getSystemId());
				/*param.setCustomerCd(userInfo.getCustomerName());*/
				param.setCategory(pam0041BeanTemp[0]);
				param.setClassUnion4(pam0041BeanTemp[1]);
				param.setCd1Pk(pam0041BeanTemp[2]);
				param.setCd2Pk(pam0041BeanTemp[3]);
				// Add bean to list params
				params.add(param);
			}

			// Delete list params
			pam0041BL.deleteUnion4(params);
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
		}
		

		LOG.info("***********Delete Union 4 End***********");

		return SUCCESS;
	}

	/**
	 * validate of action doEvent01
	 */
	public void validateDelUnion4Master() {
		LOG.info("*************Validate DelUnion4Master Start*************", "");
		int temp = 0;
		Pam0041Bean fam004Bean = null;
		Pam0041BL logic = new Pam0041BL();
		String[] beanTemps = valuesDelete.split(",");
		userInfo = this.getUserInfo();

		for (String beanTemp : beanTemps) {
			fam004Bean = new Pam0041Bean();
			String[] pam0041BeanTemp = beanTemp.split(":");
			fam004Bean.setSystemId(userInfo.getSystemId());
			fam004Bean.setCategory(pam0041BeanTemp[0]);
			fam004Bean.setClassUnion4(pam0041BeanTemp[1]);
			fam004Bean.setCd1Pk(pam0041BeanTemp[2]);
			fam004Bean.setCd2Pk(pam0041BeanTemp[3]);

			//Pam0041Bean in process
			Pam0041Bean fam004Bean2 = logic.getUnion4(fam004Bean);
			if(fam004Bean2 != null) {
				String exclusiveFg = fam004Bean2.getExclusiveFg();
				if(exclusiveFg != null && exclusiveFg.equals("1")) {
					temp++;
				}
			}
		}
		if(temp > 0) {
			//messageId = "EA-00015";
		}
		LOG.info("*************Validate DelUnion4Master End*************", "");
	}

	/**
	 * Check duplicate when create new a data
	 * @param param
	 * @return boolean
	 */
	public boolean checkDuplicate(Pam0041Bean param){
		boolean iDuplicate = false;
		// Count union 4 data exist on union 4 master table
		int count = pam0041BL.countUnion4(param);

		if (count == 0) {
			iDuplicate = false;
		} else {
			messageId = "EA-0002";
			iDuplicate = true;
		}

		return iDuplicate;
	}

	/**
	 * action set ExclusiveFg to 0
	 * @return
	 */
	public String doUpdateExclusiveFg() {
		LOG.info("*************doUpdateExclusiveFg Start*************", "");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		// Get session user login
		userInfo = this.getUserInfo();
		Pam0041Bean fam004Bean = new Pam0041Bean();
		//set data for bean to check
		fam004Bean.setSystemId(userInfo.getSystemId());
		fam004Bean.setCategory(category);
		fam004Bean.setClassUnion4(classUnion4);
		fam004Bean.setCd1Pk(cd1Pk);
		fam004Bean.setCd2Pk(cd2Pk);
		fam004Bean.setExclusiveFg("0");

		Pam0041BL logic = new Pam0041BL();
		try {
			logic.updateExclusiveFg(fam004Bean);
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
		}
		
		LOG.info("*************doUpdateExclusiveFg End*************", "");
		return SUCCESS;
	}

	/**
	 * Validate form insert and edit
	 */
	public void validateForm() {
		Map<String, String> mapError = new HashMap<String, String>();
		boolean flag = true;
		// Check value of category
		if (category == null || "".equals(category)) {
			mapError.put("category", "Category is required.");
			flag = false;
		}
		// Check value of classUnion4
		if (classUnion4 == null || "".equals(classUnion4)) {
			mapError.put("classUnion4", "Class is required.");
			flag = false;
		}
		// Check value of cd1Pk
		if (cd1Pk == null || "".equals(cd1Pk)) {
			mapError.put("cd1Pk", "CD1_PK is required.");
			flag = false;
		}
		// Check value of cd2Pk
		if (cd2Pk == null || "".equals(cd2Pk)) {
			mapError.put("cd2Pk", "CD2_PK is required.");
			flag = false;
		}

		mapError.put("flag", String.valueOf(flag));
		this.listArrError = mapError;
	}

	/**
	 * @return the listUnion4
	 */
	public List<Pam0041Bean> getListUnion4() {
		return listUnion4;
	}

	/**
	 * @param listUnion4 the listUnion4 to set
	 */
	public void setListUnion4(List<Pam0041Bean> listUnion4) {
		this.listUnion4 = listUnion4;
	}

	/**
	 * @return the pam0041
	 */
	public Pam0041Bean getPam0041() {
		return pam0041;
	}

	/**
	 * @param pam0041 the pam0041 to set
	 */
	public void setPam0041(Pam0041Bean pam0041) {
		this.pam0041 = pam0041;
	}

	/**
	 * @return the listArrError
	 */
	public Map<String, String> getListArrError() {
		return listArrError;
	}

	/**
	 * @param listArrError the listArrError to set
	 */
	public void setListArrError(Map<String, String> listArrError) {
		this.listArrError = listArrError;
	}

	/**
	 * @return the messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
}
