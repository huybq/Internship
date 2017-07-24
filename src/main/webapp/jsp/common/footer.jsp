<%@ taglib uri="/struts-tags" prefix="s"%>
<%-- <div id="footer">
	<div class="footer-wrapper container-fluid">
		<h4>
			Copyright 2016 by <span>Sankyu</span> All rights reserved
		</h4>
	</div>
</div> --%>
	<!-- Modal confirm -->
	<div class="modal fade" id="modalConfirm" role="dialog" data-keyboard="false" data-backdrop="static">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content" style="margin-right: 50px;  margin-left: 70px;">
	        <div class="modal-header" style="padding:0px 10px;">
	          <button type="button" class="close" onclick="doCloseConfirm();">&times;</button>
	          <h4><span class="glyphicon glyphicon-question-sign"></span>    Confirmation</h4>
	        </div>
	        <div class="modal-body" >
	          <form role="form">
	            <div class="row">
	            	<div class="col-md-12 text-right form-group required no-padding-right">
	              		<p style="float:left"><img src="<s:url value="/"/>style/imgs/confirm.png" width="30" height="30"><span id="contentConfirm" style="margin-left: 15px;"></span></p>
	              	</div>
	            </div>
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block" id="buttonYes" data-toggle="modal" data-dismiss="modal">Proceed</button>
					</div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block btn-grey" id="buttonNo" onclick="doCloseConfirm();">Return</button>
					</div>
				</div>
	          </form>
	        </div>
	      </div>
	    </div>
	</div>
<!-- Modal confirm end-->

<!-- Modal confirm customerCd-->
	<div class="modal fade" id="modalConfirmCustomerCd" role="dialog" data-keyboard="false" data-backdrop="static">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content" style="margin-right: 50px;  margin-left: 70px;">
	        <div class="modal-header" style="padding:0px 10px;">
	          <button type="button" class="close" onclick="doCloseConfirmCustomerCd();">&times;</button>
	          <h4><span class="glyphicon glyphicon-question-sign"></span>    Confirmation</h4>
	        </div>
	        <div class="modal-body" >
	          <form role="form">
	            <div class="row">
	            	<div class="col-md-12 text-right form-group required no-padding-right">
	              		<p style="float:left"><img src="<s:url value="/"/>style/imgs/confirm.png" width="30" height="30"><span id="contentConfirmCustomerCd" style="margin-left: 15px;"></span></p>
	              	</div>
	            </div>
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block" id="buttonYes1" data-toggle="modal" data-dismiss="modal">Proceed</button>
					</div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block btn-grey" id="buttonNo1" onclick="doCloseConfirmCustomerCd();">Return</button>
					</div>
				</div>
	          </form>
	        </div>
	      </div>
	    </div>
	</div>
<!-- Modal confirm customerCd end-->

<!-- Modal error -->
	<div class="modal fade" id="modalInfo" role="dialog" data-keyboard="false" data-backdrop="static">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content" style="margin-right: 100px;  margin-left: 100px;">
	        <div class="modal-header" style="padding:0px 10px;">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4 id="titleModal"></h4>
	          <%-- <h4><span class="glyphicon glyphicon-remove-circle"></span>  Error</h4> --%>
	        </div>
	        <div class="modal-body" >
	          <form role="form">
	            <div class="row">
	            	<div class="col-md-12 form-group required no-padding-right">
	              		<p style="float:left"><img id="modalInfo_image" width="30" height="30"><span id="contentMessage" style="margin-left: 15px;"></span></p>
	              	</div>
	            </div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-3">
						<button type="button" class="btn btn-primary center-block btn-block" id="btnOk" data-dismiss="modal">OK</button>
					</div>
				</div>
	          </form>
	        </div>
	      </div>
	    </div>
	</div>
<!-- Modal error end-->

<!-- Modal warning -->
	<div class="modal fade" id="modalWarning" role="dialog" data-keyboard="false" data-backdrop="static">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content" style="margin-right: 15px;  margin-left: 15px;">
	        <div class="modal-header" style="padding:0px 10px;">
	          <button type="button" class="close" onclick="doCloseWarning()">&times;</button>
	          <h4><span class="glyphicon glyphicon-warning-sign"></span>    Warning</h4>
	        </div>
	        <div class="modal-body" >
	          <form role="form">
	            <div class="row">
	            	<div class="col-md-12 text-right form-group required no-padding-right">
	              		<p style="float:left"><img src="<s:url value="/"/>style/imgs/warning.png" width="30" height="30"><span id="contentWarning" style="margin-left: 15px;"></span></p>
	              	</div>
	            </div>
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block" id="buttonYesWar" data-toggle="modal" data-dismiss="modal">Proceed</button>
					</div>
					<div class="col-md-4">
						<button type="button" class="btn btn-primary center-block btn-block btn-grey" id="buttonNoWar" onclick="doCloseWarning()">Return</button>
					</div>
				</div>
	          </form>
	        </div>
	      </div>
	    </div>
	</div>
<!-- Modal warning end-->