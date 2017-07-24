package jp.co.cyms.apps.faa001.dao;

import jp.co.cyms.apps.faa001.bean.*;
import jp.co.cyms.base.BaseDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserDao extends BaseDao
 *
 * @author tichnv
 */
public class Paa001Dao extends BaseDao {
    /**
     *
     */
    public Paa001Dao() {
        super();
    }

    /**
     * Authority when login system
     *
     * @param bean
     * @return UserBean : information of user login
     */
    public UserBean authorityUser(UserBean bean) {
        return (UserBean) this.queryObject("FAA001.select01", bean);
    }

    /**
     * Get all system group
     *
     * @return List<SystemGroupBean>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<SystemGroupBean> getAllSystemGroup() {
        List<SystemGroupBean> queryList = (List<SystemGroupBean>) this.queryList("FAA001.select02");
        return queryList;
    }

    /**
     * Get menuInfo
     *
     * @return List<MenuBean>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<MenuBean> getMenuInfo(UserBean bean) {
        List<MenuBean> queryList = (List<MenuBean>) this.queryList("FAA001.select03", bean);
        return queryList;
    }

    /**
     * Check permission action
     *
     * @param userInfo
     * @param param
     * @return true: has permission, false, hasn't permission
     * @throws Exception
     */
    public boolean hasPermissionScreen(UserBean userInfo, MenuQueryParam param) throws Exception {
        Map<String, String> mapParam = new HashMap<>();
        mapParam.put("systemId", userInfo.getSystemId());
        mapParam.put("userAuthorityCd", userInfo.getUserAuthorityCd());
        mapParam.put("functionId", param.getFunctionId());
        mapParam.put("screenId", param.getScreenId());
//		mapParam.put("customerName", userInfo.getCustomerName());
        return this.queryCount("FAA001.select04", mapParam) > 0;
    }

    /**
     * Get Un1mst Data
     *
     * @param un1MstBean condition
     * @return Un1mst Data
     * @throws Exception
     */
    public Un1MstBean getUn1MstData(Un1MstBean un1MstBean) throws Exception {
        return (Un1MstBean) this.queryObject("FAA001.select05", un1MstBean);
    }

}
