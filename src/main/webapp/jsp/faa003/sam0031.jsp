<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../common/common.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="../style/fam003/sam0031.css" />
<link rel="stylesheet" type="text/css" href="../style/datatable/css/perfect-scrollbar.min.css" />
<script src="../style/datatable/js/perfect-scrollbar.jquery.min.js" type="text/javascript"></script>
<script src="../js/fam003/sam0031.js" type="text/javascript"></script>
<title>Union_3 Master</title>
</head>
<style>
.m-cell span{
  border-bottom : solid 1px black;
}
</style>
<body>
<s:hidden name="data"></s:hidden>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="content">
			<table class="order-column row-border hover data-table" id="union-table">
				<thead>
					<tr>
						<th rowspan="2">S</th>
						<th rowspan="2">No.</th>
						<th rowspan="2">Category</th>
						<th rowspan="2">Class</th>
						<th rowspan="2">CD_PK</th>
						<th rowspan="2">Name</th>
						<th rowspan="2">Column_1</th>
						<th rowspan="2">Column_2</th>
						<th rowspan="2">Column_3</th>
						<th rowspan="2">Column_4</th>
						<th rowspan="2">Column_5</th>
					</tr>
				</thead>
				
			</table>
		</div>
	</div>
</body>
</html>