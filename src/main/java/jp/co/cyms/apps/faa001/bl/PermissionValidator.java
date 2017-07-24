package jp.co.cyms.apps.faa001.bl;

import jp.co.cyms.apps.faa001.bean.MenuQueryParam;
import jp.co.cyms.apps.faa001.bean.UserBean;
import jp.co.cyms.common.Constant;

/**
 * Created by luanvv on 06/02/2017.
 */
public class PermissionValidator {
    private UserBean userBean;
    private MenuQueryParam menuParam;
    private MenuQueryParam rawMenuParam;

    public PermissionValidator(UserBean userBean, MenuQueryParam rawMenuParam) {
        this.userBean = userBean;
        this.rawMenuParam = rawMenuParam;
        this.menuParam = rawMenuParam;
        menuParam = parseRawValue();
    }

    private MenuQueryParam parseRawValue(){
        if(isVehicleRouteHistory()){
            return new MenuQueryParam("fad006", "sad0061");
        }
        return rawMenuParam;
    }
    private boolean isVehicleRouteHistory(){
        return "fad004".equals(rawMenuParam.getFunctionId()) && "sad0041".equals(rawMenuParam.getScreenId());
    }
    public boolean check() throws Exception {
        return new Paa0011BL().hasPermissionScreen(userBean, menuParam);
    }
    public boolean checkRouteView() throws Exception {
        return Constant.FUNCTION_ID_FAC005S.equals(menuParam.getFunctionId()) && Constant.SCREEN_ID_SAC0051S.equals(menuParam.getScreenId()) && !Constant.AUTHORIZATION_GENERAL.equals(userBean.getUserAuthorityCd());
    }
}
