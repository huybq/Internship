<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../common/common.jsp"></jsp:include>
<%-- <link rel="stylesheet" type="text/css" href='<s:url value="/"/>style/fam001/sam0011.css' /> --%>
<link rel="stylesheet" type="text/css" href='<s:property value="contextPath" />/style/fam001/sam0011.css' />
<script src="../js/fam001/sam0011.js" type="text/javascript"></script>
<title><s:property value='getText("common_title")' /></title>
</head>
<body>
	<div style="min-height: 620px;min-width: 1900px;">
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container-fluid wrapper main_center">
		<input type="hidden" id="listUnion1Delete" name="listUnion1Delete" />
		<input type="hidden" id="row_id_selected" name="row_id_selected" />
		<input type="hidden" id="confirmRedirectMenu" name="confirmRedirectMenu" />
		<div class="main_flex row">
			<div class="left left-side col-xs-2">
				<s:include value="/jsp/common/menu_left.jsp" />
			</div>
			<div class="center right-side col-xs-10" style="min-height: 600px">
				<div class="row title-row">
					<div class="container-fluid">
						<div class="icon-menu menu_top_text_left">
							<span class="span_icon_menu"><img alt="icon computer"
								src="<s:url value="/"/>images/icon_menu.png">
							</span><span class="span_text_menu"><s:property value="currentScreenName"/></span>
						</div>
						<div class="menu_top_buttom_right">
							<div class="btn-group div-delete"><!-- div-delete -->
								<a href="javascript:void(0)" id="btn-delete" class="btn-delete btn-function-square btn-block" onclick="doDelete();" >Delete</a>
							</div>
							<div class="btn-group">
								<a href="javascript:void(0)" id="btn-new" class="btn-new btn-function-square btn-block">New</a>
							</div>
						</div>
						<div style="clear:both">
						</div>
					</div>
					</div>
					<div class=content>
							<table class="order-column row-border hover data-table table-striped" id="union1-table">
								<thead>
									<tr>
										<th width="3%">S</th>
										<th width="3%">No.</th>
										<th width="6%">Category</th>
										<th width="4%">Class</th>
										<th width="9%">CD_PK</th>
										<th width="27%">Name</th>
										<th width="9%">Column_1</th>
										<th width="9%">Column_2</th>
										<th width="9%">Column_3</th>
										<th width="9%">Column_4</th>
										<th width="9%">Column_5</th>
										<th width="5%">Time_1</th>
									</tr>
								</thead>
								<tbody>
									<s:iterator value="fam001List" status="stat">
										<tr>
											<td width="3%" class="sorting_1"><input class="checkbox_table" type="checkbox" onclick="checkDelete(this);"
												name="s" value="<s:property value="category" />:<s:property value="classMst" />:<s:property value="cdPk" />"></td>
											<td width="3%"><s:property value="#stat.count" /></td>
											<td width="6%"><s:property value="category" /></td>
											<td width="4%"><s:property value="classMst" /></td>
											<td width="9%"><a href="javascript:void(0)" class="link_update_table link-vehicle" id="uni1_cdpk_<s:property value='#stat.count'/>" data-index="<s:property value='#stat.count'/>" data-type = "modal"><s:property value="cdPk"/></a></td>
											<td width="27%"><s:property value="name" /></td>
											<td width="9%"><s:property value="column1" /></td>
											<td width="9%"><s:property value="column2" /></td>
											<td width="9%"><s:property value="column3" /></td>
											<td width="9%"><s:property value="column4" /></td>
											<td width="9%"><s:property value="column5" /></td>
											<td width="5%"><s:property value="time1" /></td>
										</tr>
									</s:iterator>
								</tbody>
							</table>
					</div>
			</div>
		</div>
	</div>
	<!-- Model -->
	<jsp:include page="popupSam0011.jsp"></jsp:include>
	<!-- footer -->
	<jsp:include page="../common/footer.jsp"></jsp:include>
	</div>
</body>
</html>