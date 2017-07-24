package jp.co.cyms.apps.fam001.bl;

import java.util.List;

import jp.co.cyms.apps.fam001.bean.Pam0011Bean;
import jp.co.cyms.apps.fam001.dao.Pam0011Dao;
import jp.co.cyms.base.BaseLogic;

/**
 * Business logic for action Pam0011Action
 *
 * @author ninhnv
 * @since 2016/11/30
 */
public class Pam0011BL extends BaseLogic {

	/**
	 * get list Union 1
	 * @return List<FAM001Bean>
	 */
	public List<Pam0011Bean> getListUnion1() throws Exception{
		Pam0011Dao dao = new Pam0011Dao();
		List<Pam0011Bean> list = dao.getListUnion1();
		if (list.size() > 0) {
			return list;
		}
		return null;
	}

	/**
	 * delete Union 1 by Id
	 * @param fam001Bean
	 */
	public void deleteUnion1(Pam0011Bean fam001Bean) throws Exception{
		Pam0011Dao dao = new Pam0011Dao();
		dao.deleteUnion1(fam001Bean);
	}

	/**
	 * update Union 1
	 * @param fam001Bean
	 */
	public void updateUnion1(Pam0011Bean fam001Bean) throws Exception{
		Pam0011Dao dao = new Pam0011Dao();
		dao.updateUnion1(fam001Bean);
	}

	/**
	 * insert Union 1
	 * @param fam001Bean
	 */
	public void insertUnion1(Pam0011Bean fam001Bean) throws Exception{
		Pam0011Dao dao = new Pam0011Dao();
		dao.insertUnion1(fam001Bean);
	}


	/**
	 * select Union 1 by Id
	 * @param fam001Bean
	 * @return union1
	 */
	public Pam0011Bean selectUnion1ById(Pam0011Bean fam001Bean){
		Pam0011Dao dao = new Pam0011Dao();
		Pam0011Bean union1 = dao.selectUnion1ById(fam001Bean);
		return union1;
	}

	/**
	 * update ExclusiveFg to 0
	 * @param fam001Bean
	 */
	public void updateExclusiveFg(Pam0011Bean fam001Bean) throws Exception{
		Pam0011Dao dao = new Pam0011Dao();
		dao.updateExclusiveFg(fam001Bean);
	}

	public String selectScreenName(String screenId) {
		Pam0011Dao dao = new Pam0011Dao();
		String name = dao.selectScreenName(screenId);
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String selectSessionTimeOut() {
		Pam0011Dao dao = new Pam0011Dao();
		return dao.selectSessionTimeOut();
	}
}
