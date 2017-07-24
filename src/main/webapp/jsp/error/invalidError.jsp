<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Authority failed</title>
<%-- <%@ include file="../include/htmlheader.inc"%> --%>
</head>
<body>
<h2>ERR page</h2>
	<%-- <div id="page">
		<%@ include file="../include/header.inc"%>
		<div id="content">
			<table class="main-table">
				<tr>
					<td id="left" valign="top"><%@ include
							file="../include/menu.inc"%></td>
					<td id="gap-div"></td>
					<td id="right" valign="top">
						<table border="0" cellspacing="1" cellpadding="0">
							<tr height="50">
								<td class="label"></td>
								<td class="content" valign="middle"><img
									src="../style/images/exception.png" width="20"> <b
									style="color: red; font-size: 20px"><s:property
											value="label.exception_1" /></b></td>
							</tr>
							<tr height="30">
								<td class="label"><s:property value="label.exception_3"
										escape="false" /></td>
								<td class="content"><s:property value="exception.message" /></td>
							</tr>
							<tr style="display:none;">
								<td class="label" valign="top"><br>
								<s:property value="label.exception_4" escape="false" /></td>
								<td class="content" valign="top"><br>
									<div
										style="height: 400px; width: 500px; overflow: scroll; white-space: nowrap;">
										<s:property value="exception" />
										<br>
										<s:iterator value="exception.stackTrace" var="trace">
											<s:property value="#trace.className" />.<s:property
												value="#trace.methodName" />(<s:property
												value="#trace.fileName" />:<s:property
												value="#trace.lineNumber" />)
                <br>
										</s:iterator>
									</div></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
		<%@ include file="../include/footer.inc"%>
	</div> --%>
</body>
</html>
