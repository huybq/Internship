package jp.co.cyms.apps.fam001.dao;

import java.util.List;

import jp.co.cyms.apps.fam001.bean.Pam0011Bean;
import jp.co.cyms.base.BaseDao;

/**
 * Dao class use for communication database
 *
 * @author ninhnv
 * @since 2016/11/30
 */
public class Pam0011Dao extends BaseDao {

	public Pam0011Dao() {
		super();
	}

	/**
	 * get list Union 1
	 * @return List<FAM001Bean>
	 */
	@SuppressWarnings("unchecked")
	public List<Pam0011Bean> getListUnion1() throws Exception{
		List<Pam0011Bean> list = null;
		list = (List<Pam0011Bean>) this.queryList("FAM001.selectFAM001");
		return list;
	}

	/**
	 * delete Union 1 by Id
	 * @param fam001Bean
	 */
	public void deleteUnion1(Pam0011Bean fam001Bean) throws Exception{
		this.delete("FAM001.deleteFAM001",fam001Bean);
	}

	/**
	 * update Union 1
	 * @param fam001Bean
	 */
	public void updateUnion1(Pam0011Bean fam001Bean) throws Exception{
		this.delete("FAM001.updateFAM001",fam001Bean);
	}

	/**
	 * insert Union 1
	 * @param fam001Bean
	 */
	public void insertUnion1(Pam0011Bean fam001Bean) throws Exception{
		this.delete("FAM001.insertFAM001",fam001Bean);
	}

	/**
	 * select Union 1 by Id
	 * @param fam001Bean
	 * @return union1
	 */
	public Pam0011Bean selectUnion1ById(Pam0011Bean fam001Bean) {
		Pam0011Bean union1 = null;
		union1 = (Pam0011Bean) this.queryObject("FAM001.selectFAM001ById",fam001Bean);
		return union1;
	}

	/**
	 * update ExclusiveFg Union 1
	 * @param fam001Bean
	 */
	public void updateExclusiveFg(Pam0011Bean fam001Bean) throws Exception{
		this.delete("FAM001.updateExclusiveFg",fam001Bean);
	}

	public String selectScreenName(String screenId) {
		String name = (String) this.queryObject("FAM001.selectScreenName",screenId);
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String selectSessionTimeOut() {
		return (String) this.queryObject("FAM001.selectSessionTimeOut");
	}
}
