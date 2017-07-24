package jp.co.cyms.apps.fam004.dao;

import java.util.List;
import java.util.Map;

import jp.co.cyms.apps.fam004.bean.Pam0041Bean;
import jp.co.cyms.base.BaseDao;

/**
 * Pam0041Dao Class
 * @author namnv
 *
 */
public class Pam0041Dao extends BaseDao {

	/**
	 * Get list union 4 master
	 * @return the list union 4 master
	 */
	@SuppressWarnings("unchecked")
	public List<Pam0041Bean> getListUnion4(Pam0041Bean param){
		List<Pam0041Bean> list = null;
		list = (List<Pam0041Bean>) this.queryList("FAM004.getListUnion4", param);
		return list;
	}

	/**
	 * Get a data Union 4 Master
	 *
	 * @param param
	 *
	 * @return A data union 4 master
	 */
	public Pam0041Bean getUnion4(Pam0041Bean param) {
		return (Pam0041Bean) this.queryObject("FAM004.getUnion4", param);
	}

	/**
	 * Get a data UN5_MST
	 *
	 * @param param
	 *
	 * @return A data UN5_MST
	 */
	public Pam0041Bean getUnion5(Pam0041Bean param) {
		return (Pam0041Bean) this.queryObject("FAM004.getUnion5", param);
	}

	/**
	 * Count union 4 master where primary key
	 * @param param
	 * @return int
	 */
	public int countUnion4(Pam0041Bean param) {
		return (int) this.queryObject("FAM004.countUnion4", param);
	}

	/**
	 * update union 4 master
	 * @param param
	 * @return int
	 */
	public int updateUnion4(Pam0041Bean param) throws Exception{
		return this.update("FAM004.updateUnion4", param);
	}

	/**
	 * Insert a new union 4 master
	 * @param param
	 * @return int
	 */
	public int insertUnion4(Pam0041Bean param) throws Exception{
		return this.update("FAM004.insertUnion4", param);
	}

	/**
	 * Delete data union 4 master
	 * @param param
	 * @return int
	 */
	public int 	deleteUnion4(List<Pam0041Bean> params) throws Exception{
		int delCount = 0;

		for (Pam0041Bean pam0041Bean : params) {
			this.delete("FAM004.deleteUnion4", pam0041Bean);
			delCount ++;
		}
		return delCount;
	}

	/**
	 * Get all message for validate form
	 *
	 * @param systemId
	 *
	 * @return A data union 4 master
	 */
	@SuppressWarnings("unchecked")
	public List<Map<String,Object>> getAllMessage(String systemId) {
		Pam0041Bean params =  new Pam0041Bean();
		// Set data for bean
		params.setSystemId(systemId);
		params.setCategory("DAT");
		params.setClassUnion4("99");

		List<Map<String,Object>>  list= (List<Map<String,Object>>) this.queryList("FAM004.getUnion4Message", params);
		return list;
	}

	/**
	 * updateExclusiveFg
	 * @param pam0041
	 */
	public void updateExclusiveFg(Pam0041Bean pam0041) throws Exception{
		this.update("FAM004.updateExclusiveFg",pam0041);
	}
}
