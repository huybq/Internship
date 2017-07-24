/*
 * CLASS   : MasterCommon
 * PACKAGE : jp.co.cyms.common
 * VERSION : 1.0
 * HISTORY : 2014-11-26　LSC　LI CREATE
 */
package jp.co.cyms.common;

import jp.co.cyms.apps.fam001.bean.Pam0011Bean;
import jp.co.cyms.apps.fam001.bl.Pam0011BL;



/**
 * 
 * @author LSC LI
 * @since 2014/11/26
 */
public class MasterCommon {

	/**
	 * MasterCommon's constructor
	 */
	public MasterCommon() {
	}

	/**
	 * getGenByCd
	 * 
	 * @param category String
	 * @param classCd String
	 * @param cd String
	 * @return GenMstBean
	 */
	/*public GenMstBean getGenByCd(String category, String classCd, String cd) {
		GenMstDao dao = new GenMstDao();
		GenMstBean param = new GenMstBean();
		param.setCategory(category);
		param.setClassCd(classCd);
		param.setCd(cd);

		return dao.getGenMst(param);
	}*/

	/**
	 * getDcpMstByDate
	 * 
	 * @param truckOutDate String
	 * @return List<DcpMstBean>
	 */
	/*public static List<DcpMstBean> getDcpMstByDate(String truckOutDate) {
		DcpMstDao dao = new DcpMstDao();
		List<DcpMstBean> list = dao.getDcpMstListByDate(truckOutDate);
		return list;
	}*/

	/**
	 * getDcpMstByNm
	 * 
	 * @param shpNm shipping line name
	 * @param eaDt Estimate Arrival Date
	 * @return List DcpMstBean
	 */
	/*public static List<DcpMstBean> getDcpMstByName(String shpNm, Date eaDt) {
		DcpMstDao dao = new DcpMstDao();
		Map<String, String> param = new HashMap<String, String>();
		param.put("shpNm", shpNm);
		param.put("eaDt", DateUtil.formatDate(eaDt, DateFormat.DDMMYYYY));

		return dao.getDcpMstByName(param);

	}*/

	/**
	 * get all shipping line
	 * 
	 * @return List DcpMstBean
	 */
	/*public List<DcpMstBean> getAllShippingLine() {
		DcpMstDao dao = new DcpMstDao();
		return dao.getAllShippingLine();

	}
*/
	/**
	 * get location zone
	 * 
	 * @param area String
	 * @return List LocMstBean
	 */
	/*public List<LocMstBean> getZoneList(String area) {

		LocMstBean param = new LocMstBean();
		param.setArea(area);
		LocMstDao dao = new LocMstDao();

		return dao.getZoneList(param);
	}*/

	/**
	 * get location row
	 * 
	 * @param area String
	 * @param zone String
	 * @return List LocMstBean
	 */
/*	public List<LocMstBean> getRowList(String area, String zone) {

		LocMstBean param = new LocMstBean();
		param.setArea(area);
		param.setZone(zone);
		LocMstDao dao = new LocMstDao();

		return dao.getRowList(param);
	}*/

	/**
	 * get location depth
	 * 
	 * @param area String
	 * @param zone String
	 * @return List LocMstBean
	 */
	/*public List<LocMstBean> getDepthList(String area, String zone) {

		LocMstBean param = new LocMstBean();
		param.setArea(area);
		param.setZone(zone);
		LocMstDao dao = new LocMstDao();

		return dao.getDepthList(param);
	}*/

	/**
	 * get location level
	 * 
	 * @param area String
	 * @param zone String
	 * @return List LocMstBean
	 */
	/*public List<LocMstBean> getLevelList(String area, String zone) {

		LocMstBean param = new LocMstBean();
		param.setArea(area);
		param.setZone(zone);
		LocMstDao dao = new LocMstDao();

		return dao.getLevelList(param);
	}*/
}
