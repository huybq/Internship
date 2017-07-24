package jp.co.cyms.apps.fam001.action;

import java.util.List;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import jp.co.cyms.apps.fam001.bean.Pam0011Bean;
import jp.co.cyms.apps.fam001.bl.Pam0011BL;
import jp.co.cyms.apps.fam001.form.Pam0011Form;
import jp.co.cyms.common.StringUtil;

/**
 * [FAM001]Union_1 Master
 * Pam0011Action class to manage master information stored in [UN1_MST].
 *
 * @author ninhnv
 * @since 2016/11/30
 */
public class Pam0011Action extends Pam0011Form{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/** List<Pam0011Bean> fam001List */
	private List<Pam0011Bean> fam001List;

	/** Pam0011Bean fam001Bean */
	private Pam0011Bean fam001Bean;

	/** List Error */
	private List<String> listError;

	/** Message Id */
	private String messageId;

	/**
	 * Method execute when init fam001 screen
	 * @return result
	 */
	@Override
	public String execute() throws Exception {
		userInfo = this.getUserInfo();
		LOG.info("*************execute Start*************", "");
		Pam0011BL logic = new Pam0011BL();
		fam001List = logic.getListUnion1();
		LOG.info("*************execute End*************", "");
		return SUCCESS;
	}

	/**
	 * action delete union 1
	 * @return result
	 */
	public String doEvent01() {
		LOG.info("*************doEvent01 Start*************", "");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		Pam0011Bean fam001Bean = null;
		Pam0011BL logic = new Pam0011BL();
		try {
			String[] beanTemps = this.values.split(",");
			for (String beanTemp : beanTemps) {
				fam001Bean = new Pam0011Bean();
				String[] fam001BeanTemp = beanTemp.split(":");
				fam001Bean.setCategory(fam001BeanTemp[0]);
				fam001Bean.setClassMst(fam001BeanTemp[1]);
				fam001Bean.setCdPk(fam001BeanTemp[2]);

				//delete Union 1
				logic.deleteUnion1(fam001Bean);
			}
			fam001List = logic.getListUnion1();
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
		}
		
		LOG.info("*************doEvent01 End*************", "");
		return SUCCESS;
	}

	/**
	 * validate of action doEvent01
	 */
	public void validateDoEvent01() {
		LOG.info("*************Validate doEvent01 Start*************", "");
		int temp = 0;
		Pam0011Bean fam001Bean = null;
		Pam0011BL logic = new Pam0011BL();
		String[] beanTemps = this.values.split(",");
		for (String beanTemp : beanTemps) {
			fam001Bean = new Pam0011Bean();
			String[] fam001BeanTemp = beanTemp.split(":");
			fam001Bean.setCategory(fam001BeanTemp[0]);
			fam001Bean.setClassMst(fam001BeanTemp[1]);
			fam001Bean.setCdPk(fam001BeanTemp[2]);

			//check in process
			try {
				Pam0011Bean fam001Bean2 = logic.selectUnion1ById(fam001Bean);
				if(fam001Bean2 != null) {
					String exclusiveFg = fam001Bean2.getExclusiveFg();
					if(exclusiveFg != null && exclusiveFg.equals("1")) {
						temp++;
					} else {
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				LOG.info("*************Validate Do Event 01*************", "");
			}
			
		}
		if(temp > 0) {
			//messageId = "EA-00015";
		}
		LOG.info("*************Validate doEvent01 End*************", "");
	}

	/**
	 * action insert or update union 1
	 * @return result
	 * @throws Exception
	 */
	public String doEvent02() throws Exception {
		LOG.info("*************doEvent02 Start*************", "");

		if(!StringUtil.isEmpty(messageId)) {
			LOG.info("*************doEvent02 End*************", "");
			return ERROR;
		}
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		userInfo = this.getUserInfo();
		Pam0011Bean fam001Bean = new Pam0011Bean();
		//set data for bean
		fam001Bean.setCategory(this.category);
		fam001Bean.setClassMst(this.classMst);
		fam001Bean.setCdPk(this.cdPk);
		fam001Bean.setName(this.name);
		fam001Bean.setColumn1(this.column1);
		fam001Bean.setColumn2(this.column2);
		fam001Bean.setColumn3(this.column3);
		fam001Bean.setColumn4(this.column4);
		fam001Bean.setColumn5(this.column5);
		fam001Bean.setTime1(this.time1);
		fam001Bean.setUpdateUser(userInfo.getUserId());
		String timeZone = doGetTimeZoneSerVer();
		   String[] arrTimeZone = timeZone.split(":");
		   if (arrTimeZone != null) {
			   fam001Bean.setTimeZone(Integer.parseInt(arrTimeZone[0]));
		}
		Pam0011BL logic = new Pam0011BL();

		try {
			if(this.checkInsert == 1) {
				//update data
				logic.updateUnion1(fam001Bean);
			} else {
				if(logic.selectUnion1ById(fam001Bean) == null) {
					//insert data
					logic.insertUnion1(fam001Bean);
				}
			}
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
			e.printStackTrace();
			LOG.info("*************Do Event02 *************", "");
		}
		fam001List = logic.getListUnion1();
		
		LOG.info("*************doEvent02 End*************", "");
		return SUCCESS;
	}

	/**
	 * validate of action doEvent02
	 */
	public void validateDoEvent02() {
		LOG.info("*************Validate doEvent02 Start*************", "");
		Pam0011Bean fam001Bean = new Pam0011Bean();
		//set data for bean to check
		fam001Bean.setCategory(this.category);
		fam001Bean.setClassMst(this.classMst);
		fam001Bean.setCdPk(this.cdPk);

		Pam0011BL logic = new Pam0011BL();
		if(this.checkInsert != 1) {
			// check exists
			try {
				if(logic.selectUnion1ById(fam001Bean) != null) {
					messageId = "EA-0002";
					LOG.info("***********Duplication Check False***********");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				LOG.info("***********Validate doEvent02***********");
			}
		}
		LOG.info("*************Validate doEvent02 End*************", "");
	}

	/**
	 * Action Check Data In Process
	 * @return
	 */
	public String doEvent03() {
		LOG.info("*************doEvent03 Start*************", "");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		Pam0011Bean fam001Bean = new Pam0011Bean();
		//set data for bean to check
		fam001Bean.setCategory(this.category);
		fam001Bean.setClassMst(this.classMst);
		fam001Bean.setCdPk(this.cdPk);

		Pam0011BL logic = new Pam0011BL();
		try {
			Pam0011Bean fam001Bean2 = logic.selectUnion1ById(fam001Bean);
			if(fam001Bean2 != null) {
				String exclusiveFg = fam001Bean2.getExclusiveFg();
				if(exclusiveFg != null && exclusiveFg.equals("1")) {
					messageId = "EA-00015";
				} else {
					fam001Bean2.setExclusiveFg("1");
					logic.updateExclusiveFg(fam001Bean2);
				}
			}
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
			e.printStackTrace();
			LOG.info("*********** Do Event 02***********");
		}
		LOG.info("*************doEvent03 End*************", "");
		return SUCCESS;
	}

	/**
	 * action set ExclusiveFg to 0
	 * @return
	 */
	public String doEvent04() {
		LOG.info("*************doEvent04 Start*************", "");
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		Pam0011Bean fam001Bean = new Pam0011Bean();
		//set data for bean to check
		fam001Bean.setCategory(this.category);
		fam001Bean.setClassMst(this.classMst);
		fam001Bean.setCdPk(this.cdPk);
		fam001Bean.setExclusiveFg("0");

		Pam0011BL logic = new Pam0011BL();
		try {
			logic.updateExclusiveFg(fam001Bean);
			LOG.info("*************doEvent04 End*************", "");
			transactionManager.commit(transactionStatus);
		} catch (Exception e) {
			// TODO: handle exception
			transactionManager.rollback(transactionStatus);
			e.printStackTrace();
			LOG.info("*********** Do Event 04***********");
		}
		
		return SUCCESS;
	}

	public List<Pam0011Bean> getFam001List() {
		return fam001List;
	}

	public void setFam001List(List<Pam0011Bean> fam001List) {
		this.fam001List = fam001List;
	}

	public Pam0011Bean getFam001Bean() {
		return fam001Bean;
	}

	public void setFam001Bean(Pam0011Bean fam001Bean) {
		this.fam001Bean = fam001Bean;
	}

	public List<String> getListError() {
		return listError;
	}

	public void setListError(List<String> listError) {
		this.listError = listError;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}


}
