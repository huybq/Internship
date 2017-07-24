<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<input type="hidden" id="contextPath" value="<s:url value="/"/>" />
<input type="hidden" id="confirmRedirectMenu" value="" />
<%-- <input type="hidden" id="customerCdSelected" value='<s:property value="userInfo.customerCd" />' /> --%>
<div class="container-fluid header">
	<div class="row">
		<div class="col-xs-12 banner">
			<div class="row">
				<div class="sysIdCss">
					<span style="color: blue;">SYSTEM_ID: </span>
					<s:property value="userInfo.systemId" />
				</div>

				<%-- <div class="form-inline cusIdCss">
					<span style="color: blue;">CUSTOMER_CD : </span>
					<s:select name="customerCd" value='userInfo.customerCd' list="userInfo.listCustomerCdBean" listKey="customerCd" listValue="customerName" cssClass="form-control customerList"
						id="listCustomerCd"></s:select>
				</div> --%>

				<div class="form-inline logOutCss">
					<a href="#" style="float: right; margin-right: 15px;width: 80px;height: 27px;padding-left: 22px;" class="btn-logout btn-new btn-function-square btn-block">Logout</a>
				</div>
				<div class="form-inline businessDateCss businessDate" style="padding-right: 4px;">
					<p style="color: white; margin-left: 40%; float: right;"><s:property value="businessDate" /></p>
				</div>
			</div>
			<div class="row">
				<div class="user-loginCss">
					<span style="color: blue;">Logged as</span>
					<s:property value="userInfo.userId" />:
					<s:property value="userInfo.userName" />
					(
					<s:if test="%{userInfo.userCompanyName != null && userInfo.userCompanyName != ''}">
						<s:property value="userInfo.userCompanyName" />, </s:if>
					<s:property value="userInfo.userAuthorityName" />
					)
				</div>
			</div>
		</div>
	</div>
</div>