package jp.co.cyms.apps.faa001.bl;

import jp.co.cyms.apps.faa001.bean.*;
import jp.co.cyms.apps.faa001.dao.Paa001Dao;
import jp.co.cyms.base.BaseLogic;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AuthorityBL
 *
 * @author tichnv
 *
 */
@Service
public class Paa0011BL extends BaseLogic {
	/**
	 * Login system
	 *
	 * @param bean
	 * @return UserBean
	 * @throws Exception
	 */
	public UserBean login(UserBean bean) throws Exception {
		Paa001Dao dao = new Paa001Dao();
		UserBean userInfo = dao.authorityUser(bean);
		return userInfo;
	}

	/**
	 * Get all system group
	 *
	 * @return List<SystemGroupBean>
	 * @throws Exception
	 */
	public List<SystemGroupBean> getAllSystemGroup() throws Exception {
		Paa001Dao dao = new Paa001Dao();
		List<SystemGroupBean> listSystemGroup = dao.getAllSystemGroup();
		return listSystemGroup;
	}

	/**
	 * Get menu info
	 *
	 * @param bean
	 * @return UserBean
	 * @throws Exception
	 */
	public List<MenuBean> getMenuInfo(UserBean bean) throws Exception {
		Paa001Dao dao = new Paa001Dao();
		List<MenuBean> menuInfo = dao.getMenuInfo(bean);
		return menuInfo;
	}

	/**
	 * Check permission action
	 *
	 * @param bean userInfo
	 * @param param actionName
	 * @return true: has permission, false, hasn't permission
	 * @throws Exception
	 */
	public boolean hasPermissionScreen(UserBean userInfo, MenuQueryParam menuParam) throws Exception {
		Paa001Dao dao = new Paa001Dao();
		return dao.hasPermissionScreen(userInfo, menuParam);
	}

	/**
	 * Get Un1mst Data
	 *
	 * @param un1MstBean
	 *            condition
	 * @return Un1mst Data
	 * @throws Exception
	 */
	public Un1MstBean getUn1MstData(Un1MstBean un1MstBean) throws Exception {
		Paa001Dao dao = new Paa001Dao();
		return dao.getUn1MstData(un1MstBean);
	}

}
