package jp.co.cyms.apps.fam004.bl;

import java.util.List;
import java.util.Map;

import jp.co.cyms.apps.fam004.bean.Pam0041Bean;
import jp.co.cyms.apps.fam004.dao.Pam0041Dao;
import jp.co.cyms.base.BaseLogic;

/**
 * Pam0041BL class
 * @author namnv
 *
 */
public class Pam0041BL extends BaseLogic{

	/** Initial Pam0041Dao */
	Pam0041Dao pam0041Dao = new Pam0041Dao();

	/**
	 * Get list union 4 master
	 * 
	 * @return the list union 4 master
	 */
	public List<Pam0041Bean> listgetListUnion4(Pam0041Bean param){
		return this.pam0041Dao.getListUnion4(param);
	}

	/**
	 * Get a data Union 4 Master
	 * 
	 * @param param
	 * 
	 * @return A data union 4 master
	 */
	public Pam0041Bean getUnion4(Pam0041Bean param) {
		return (Pam0041Bean) this.pam0041Dao.getUnion4(param);
	}
	
	/**
	 * Get a data UN5_MST
	 * 
	 * @param param
	 * 
	 * @return A data UN5_MST
	 */
	public Pam0041Bean getUnion5(Pam0041Bean param) {
		return (Pam0041Bean) this.pam0041Dao.getUnion5(param);
	}

	/**
	 * Update union 4 master
	 * @param param
	 * @return int
	 * @throws Exception 
	 */
	public int updateUnion4(Pam0041Bean param) throws Exception {
		return this.pam0041Dao.updateUnion4(param);
	}

	/**
	 * Insert a new union 4 master
	 * @param param
	 * @return int
	 * @throws Exception 
	 */
	public int insertUnion4(Pam0041Bean param) throws Exception {
		return this.pam0041Dao.insertUnion4(param);
	}

	/**
	 * Delete union 4 master
	 * @param param
	 * @return int 
	 * @throws Exception 
	 */
	public int deleteUnion4(List<Pam0041Bean> params) throws Exception{
		return this.pam0041Dao.deleteUnion4(params);
	}

	/**
	 * Get all message for validate form
	 * 
	 * @param systemId
	 * 
	 * @return A List contain all message.
	 */
	public List<Map<String,Object>> getAllMessage( String systemId) {
		return this.pam0041Dao.getAllMessage(systemId);
	}

	/**
	 * Count union 4 master where primary key
	 * @param param
	 * @return int
	 */
	public int countUnion4(Pam0041Bean param){
		return this.pam0041Dao.countUnion4(param);
	}

	/**
	 * updateExclusiveFg
	 * @param pam0041
	 */
	public void updateExclusiveFg(Pam0041Bean pam0041) throws Exception{
		pam0041Dao.updateExclusiveFg(pam0041);
	}

}
