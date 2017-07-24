/**
 * 指定された機能IDとイベントIDを利用してサブミットします。
 *
 * @param functionId
 *            機能ID
 * @param eventId
 *            イベントID
 * @return false : イベントキャンセル
 */
contextPath = $('#contextPath').val();
function submitForm(functionId, eventId) {

	// submitFormProc関数が指定されている場合は実行します。
	if ('function' === typeof submitFormProc) {
		submitFormProc(functionId, eventId);
	}

	if (0 < $("#ScreenItemChangeCheck").size()) {
		if (isConfirm) {
			// 確認モードの場合、値の変更をチェックしない。
		} else {
			// 確認モード以外の場合、画面入力値が変更されているかをチェックします。
			if (!isScreenItemChangeCheck()) {
				return false;
			}
		}
	}

	submitFormSkipConfirmChange(functionId, eventId);
}

/**
 * 指定された機能IDとイベントIDを利用してサブミットします。
 *
 * @param functionId
 *            機能ID
 * @param eventId
 *            イベントID
 */
function submitFormSkipConfirmChange(functionId, eventId) {

	// submitFormSkipConfirmChangeProc関数が指定されている場合は実行します。

	if ('function' === typeof submitFormSkipConfirmChangeProc) {
		submitFormSkipConfirmChangeProc(functionId, eventId);
	}

	$("form").attr("action",
			contextRootPath + "/" + functionId + "/" + eventId + ".action");
	$("form").submit();
}

function redirectMenu(functionId, screenId) {
	if ($("#confirmRedirectMenu").val() == "true") {
		showConfirmDialog("redirectMenu", "", [functionId,screenId]);
	} else {
		$("#redirectFunctionId").val(functionId);
		$("#redirectScreenId").val(screenId);
		$("form[id=form_menu]").submit();
	}
}

/*function showConfirmDialog(idEvent, listButton, param, paramSettingDialog) {
	var contentConfirm = "Are you sure?";
	if (idEvent == "delete") {
		contentConfirm = "Are you sure to delete the data?";
	} else if (idEvent == "logout") {
		contentConfirm = "Are you sure to log out from the system?";
	} else if (idEvent == "redirectMenu") {
		contentConfirm = "Are you sure to leave this menu?";
	} else if (idEvent == "save") {
		contentConfirm = "Are you sure to save the data?";
	}
	document.getElementById("contentConfirm").innerHTML = contentConfirm;
	if (listButton == undefined || listButton == "") {
		listButton = [ "Yes", "No" ]
	}
	if (listButton.length == 1) {
		$("#dialog-confirm").dialog(
				{
					resizable : false,
					height : "auto",
					width : paramSettingDialog == undefined
							|| paramSettingDialog.width == undefined
							|| paramSettingDialog.width == "" ? 400
							: paramSettingDialog.width,
					modal : true,
					buttons : [ {
						text : listButton[0],
						click : function() {
							if ('function' === typeof doEventDialog01) {
								doEventDialog01(idEvent, this, param);
							}
						}
					} ],
				});
	}
	if (listButton.length == 2) {
		$("#dialog-confirm").dialog(
				{
					resizable : false,
					height : "auto",
					width : paramSettingDialog == undefined
							|| paramSettingDialog.width == undefined
							|| paramSettingDialog.width == "" ? 400
							: paramSettingDialog.width,
					modal : true,
					buttons : [ {
						text : listButton[0],
						click : function() {
							if ('function' === typeof doEventDialog01) {
								doEventDialog01(idEvent, this, param);
							}
							doEventDialog01Default(idEvent, this, param);
						}
					}, {
						text : listButton[1],
						click : function() {
							if ('function' === typeof doEventDialog02) {
								doEventDialog02(idEvent, this, param);
							}
							doEventDialog02Default(idEvent, this, param);
						}
					} ],
				});
	}
	if (listButton.length == 3) {
		$("#dialog-confirm").dialog(
				{
					resizable : false,
					height : "auto",
					width : paramSettingDialog == undefined
							|| paramSettingDialog.width == undefined
							|| paramSettingDialog.width == "" ? 400
							: paramSettingDialog.width,
					modal : true,
					buttons : [ {
						text : listButton[0],
						click : function() {
							if ('function' === typeof doEventDialog01) {
								doEventDialog01(idEvent, this);
							}
							doEventDialog01Default(idEvent, this, param);
						}
					}, {
						text : listButton[1],
						click : function() {
							if ('function' === typeof doEventDialog02) {
								doEventDialog02(idEvent, this);
							}
							doEventDialog02Default(idEvent, this, param);
						}
					}, {
						text : listButton[2],
						click : function() {
							if ('function' === typeof doEventDialog03) {
								doEventDialog03(idEvent, this);
							}
							doEventDialog03Default(idEvent, this, param);
						}
					} ],
				});
	}
	if (paramSettingDialog != undefined
			&& paramSettingDialog.position != undefined) {
		$("div[aria-describedby=dialog-confirm]").css("top",
				paramSettingDialog.position + "px");
	}
	if (idEvent == "logout" || idEvent == "redirectMenu") {
		$("div[aria-describedby=dialog-confirm]").css("top", "45%");
	}
	$("div[aria-describedby=dialog-confirm]").css("z-index", "10000");
}*/
// FunctionId and ScreenId For Redirect Menu
var paramForRedirectMenu;

function doEventDialog01Default(idEvent) {
	if (idEvent == "logout") {
		location.href = $("#contextPath").val() + "faa001/saa0011_99.action";
	}
	if (idEvent == "redirectMenu") {
		$("#redirectFunctionId").val(paramForRedirectMenu[0]);
		$("#redirectScreenId").val(paramForRedirectMenu[1]);
		$("form[id=form_menu]").submit();
	}
}
function doEventDialog02Default(idEvent, element, param) {
	$(element).dialog("close");
}

// /////////////////////////////////////////////////////

function showConfirmDialog(idEvent, listButton, param, paramSettingDialog) {
	paramForRedirectMenu = param;
	var messageId = "";
	if (idEvent == "redirect") {
		messageId = "CA-0013";
	} else if (idEvent == "delete") {
		messageId = "CA-0007";
	} else if (idEvent == "logout") {
		messageId = "CA-0001";
	} else if (idEvent == "redirectMenu") {
		messageId = "CA-0002";
	} else if (idEvent == "save" || idEvent == "saveSubCon") {
		messageId = "CA-0004";
	} else if (idEvent == "saveReturn") {
		messageId = "CA-0004";
	} else if (idEvent == "download") {
		messageId = "CA-0008";
	} else if (idEvent == "print") {
		messageId = "CA-0009";
	} else if (idEvent == "copy") {
		messageId = "CA-0010";
	} else if (idEvent == "cancel") {
		messageId = "CA-0011";
	} else if (idEvent == "clear") {
		messageId = "CA-0019";
	} else if (idEvent == "selectCustomerCd") {
		messageId = "CA-0018";
	} else if (idEvent == "clearSchedule") {
		messageId = "CA-0017";
		overwriteAttr(true);
	} else if (idEvent == "changeStatus" || idEvent == "dropStatus" || idEvent == "resetStatus") {
		messageId = "CA-0012";
		overwriteAttr(false);
	} else if (idEvent == "changeCon") {
		messageId = "CA-0012";
	} else if (idEvent == "changeShipment") {
		messageId = "CA-0022";
	}
	
	var contentConfirm = getMessageWithParams(messageId,"");
	document.getElementById("contentConfirm").innerHTML = messageId+" : "+ contentConfirm;
	$('#buttonYes').attr('onclick', "doYes('"+idEvent+"')");
	$("#modalConfirm").modal("show");
}
/**
 * Show confirm dialog by messageId
 */
function showConfirmDialogById (idEvent , messageId, param) {
	var contentConfirm = getMessageWithParams(messageId,"");
	document.getElementById("contentConfirm").innerHTML = messageId+" : "+ contentConfirm;
	$('#buttonYes').attr('onclick', "doYes('"+idEvent+ "','','" + param + "')");
	$("#modalConfirm").modal("show");
}


function doYes(idEvent, element, param) {
	if (idEvent == "logout" || idEvent == "redirectMenu") {
		doEventDialog01Default(idEvent, param);
	}else {
		doEventDialog01(idEvent, this, param);
	}
}

/**
 * Close confirm dialog
 */
function doCloseConfirm() {
	$('#modalConfirm').modal('hide');
}

/**
 * Show customerCd confirm dialog by messageId
 */
function showCustomerCdConfirmDialogById (idEvent , messageId, param) {
	var contentConfirm = getMessageWithParams(messageId,"");
	document.getElementById("contentConfirmCustomerCd").innerHTML = messageId+" : "+ contentConfirm;
	$('#buttonYes1').attr('onclick', "doYes1('"+idEvent+ "','','" + param + "')");
	$("#modalConfirmCustomerCd").modal("show");
}

function doYes1(idEvent, element, param) {
	doEventDialog02(idEvent, this, param);
}

/**
 * Call when Yes1 button click
 *
 * @param idEvent
 *            idEvent
 * @param element
 *            element name
 */
function doEventDialog02(idEvent, element, param) {
	//
	var selectBean = {};
	if (idEvent == "selectCustomerCd") {
		selectBean.valueCustomerCd = param;
	}
}

/**
 * Close confirm customerCd dialog
 */
function doCloseConfirmCustomerCd() {
	$("#listCustomerCd").val($("#customerCdSelected").val());
	$('#modalConfirmCustomerCd').modal('hide');
}

/**
 * Close warning dialog
 */
function doCloseWarning() {
	$('#modalWarning').modal('hide');
}

/**
 * Overwrite attribute
 */
function overwriteAttr(flagClose) {
	if (flagClose === true) {
		$('#buttonNo').attr('onclick', "doNo()");
		$('.close').attr('onclick', "doNo()");
	} else {
		$('#buttonNo').attr('onclick', "doClosePopupConfirm()");
		$('.close').attr('onclick', "doClosePopupConfirm()");
	}
}

/**
 * Display warning popup
 * @param idEvent ID of event
 */
function showWarningDialog(messageId) {
	var contentConfirm = getMessageWithParams(messageId,"");
	document.getElementById("contentWarning").innerHTML = messageId+" : "+ contentConfirm;
	$('#buttonYesWar').attr('onclick', "doYes('"+messageId+"')");
	$("#modalWarning").modal("show");
}

function showErrorDialog(messageId,params) {
	var message = getMessageWithParams(messageId,params);
	var title = "<span class='glyphicon glyphicon-remove-circle'></span>  Error";
	document.getElementById("titleModal").innerHTML = title;
	document.getElementById("contentMessage").innerHTML = messageId+" : "+ message;
	$("#modalInfo_image").attr("src","../style/imgs/errorIcon.png");
	$("#modalInfo").modal("show");
}

function showSuccessDialog(idEvent) {
	$("#modalInfo_image").attr("src","../style/imgs/succsessIcon.png");
	var message = "Success";
	if (idEvent == "delete") {
		message = "Deleted Successfully.";
	} else if (idEvent == "save") {
		message = "Saved Successfully.";
	}
	var title = "<span class='glyphicon glyphicon-ok-circle'></span>  Success";
	document.getElementById("titleModal").innerHTML = title;
	document.getElementById("contentMessage").innerHTML = message;
	$("#modalInfo").modal("show");
}
/*
 * Open date picker(jquery-ui) when click button
 */
function openDatePicker(button){
	var input = $(button).parent().parent().find("input");
	if(typeof input === "undefined" || input == null){
		return;
	}
	$(input).datepicker( "show" );
}
function setDateChange(input, day){
	var date2 = $(input).datepicker('getDate');
	date2.setDate(date2.getDate()+day);
	$(input).datepicker('setDate', date2);
}

function checkLoginRequiredForAjax(jqXhr){
	if('login-required'===jqXhr.responseText){
		location.href= contextPath + 'faa001/saa0011.action'
		return false
	}
	return true
}

/**
 * Show dialog system error
 * @param message messeage content
 */
function showSystemErrorDialog(message) {
	var title = "<span class='glyphicon glyphicon-remove-circle'></span>  Error";
	document.getElementById("titleModal").innerHTML = title;
	document.getElementById("contentMessage").innerHTML = message;
	$("#modalInfo_image").attr("src","../style/imgs/errorIcon.png");
	$("#modalInfo").modal("show");
}

function setBlurTabIndex(selector){
	$(selector).attr('tabindex','-1')
}
function setBlurForNonTabIndexElement(){
	$('a[href],area[href],input:not([disabled]),select:not([disabled]),textarea:not([disabled]),button:not([disabled]),iframe,[tabindex],[contentEditable=true]')
		.each(function() {
			if($(this).attr('tabindex')){
				return
			}
			setBlurTabIndex(this)
		})
}
function isNotEmptyTxt(s){
    return typeof s !== 'undefined' && s!==null && s.trim() !== ""

}

function formatNuberic(index){
	var number = index +1;
		return number.toLocaleString('en');
}
