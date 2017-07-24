<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="container">
	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog" data-keyboard="false" data-backdrop="static">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header" style="padding: 0px 10px;">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4>
						<span class="glyphicon"></span>Data Entry
					</h4>
				</div>
				<div class="modal-body">
					<!-- <form role="form"> -->
					<s:form role="form" action="sam0011_02" namespace="/fam001" method="post">
					<s:include value="/jsp/common/message.jsp" />
						<input type="hidden" value="" id="checkInsert" name="checkInsert" />
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control no-border-form-control textbox-height control-label">Category<span class="sp-required">*</span></label>
							</div>
							<div class="col-xs-6 no-padding-left">
								<!-- <s:textfield cssClass="form-control" tabindex="1" name="category" id="category" validate="true" validate_length="3" validate_required="true" maxlength="3"></s:textfield> -->
								<s:textfield cssClass="form-control textbox-height" name="category" id="category" validate="true" validate_length="3" validate_required="true" validate_special_character="true" validate_key="true" maxlength="3"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control control-label">Class<span class="sp-required">*</span></label>
							</div>
							<div class="col-xs-6 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="classMst" id="classMst" validate="true" validate_length="2" validate_required="true" validate_special_character="true" validate_key="true" maxlength="2"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control control-label">CD_PK<span class="sp-required">*</span></label>
							</div>
							<div class="col-xs-6 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="cdPk" id="cdPk" validate="true" validate_length="10" validate_required="true" validate_special_character="true" validate_key="true" maxlength="10"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Name</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="name" id="name" validate="true" validate_length="30" maxlength="30"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Column_1</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="column1" id="column1" validate="true" validate_length="100" maxlength="100"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Column_2</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="column2" id="column2" validate="true" validate_length="100" maxlength="100"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Column_3</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="column3" id="column3" validate="true" validate_length="100" maxlength="100"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Column_4</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="column4" id="column4" validate="true" validate_length="100" maxlength="100"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Column_5</label>
							</div>
							<div class="col-xs-8 no-padding-left">
								<s:textfield cssClass="form-control textbox-height" name="column5" id="column5" validate="true" validate_length="100" maxlength="100"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-3 text-right form-group no-padding-right">
								<label class="form-control textbox-height no-border-form-control">Time_1</label>
							</div>
							<div class="col-xs-3 no-padding-left">
								<!-- <input type="text" class="form-control" name="time1" id="time1" maxlength="10"> -->
								<s:textfield cssClass="form-control textbox-height" name="time1" id="time1" validate="true" validate_length="6" validate_time1_format="true" maxlength="6" onkeypress="return isNumber(event)"></s:textfield>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-4"></div>
							<div class="col-xs-2 no-padding-right">
								<button type="button" class="btn btn-primary center-block btn-save btn-block" id="btn-Update-insert" onclick="doSave();">Save</button>
							</div>
							<div class="col-xs-2 no-padding-left">
								<button type="button" class="btn btn-primary center-block btn-cancel btn-block btn-grey" data-dismiss="modal">Cancel</button><!-- data-dismiss="modal" -->
							</div>
						</div>
					<!-- </form> -->
					</s:form>
				</div>
			</div>

		</div>
	</div>
</div>