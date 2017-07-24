/*!
 * For Union 1 Master Screens ( list, new , update .etc)
 * @author ninhnv ()
 * @since 2016/12/08
 */

/**
 * Datatable variable
 */
var tableUnion1Master;

/**
 * execute when load page
 */
$(document).ready(function() {
	initDataTable();

	$('#confirmRedirectMenu').val(true);

	$("#btn-new").click(function(){
		$("#checkInsert").val(2);
		clearPopup();
		//remove error
		removeError();

		// show popup
    	$('#myModal').on('shown.bs.modal', function () {
    		$("#category").focus();
    		setTabIndexPopup(2);
    	});
    	$("#myModal").modal();
	});

	$(".btn-cancel").on('click', function() {
		$('#myModal').modal('hide');
		$("#checkInsert").val("");
		setTabIndex2();
	});

	setTabIndex();
	$(".btn-delete").attr('disabled','disabled');

	// Set again first focus depend on last focus
	$('#myModal').keydown(function(e){
		if($('.btn-cancel').is(":focus") && (e.which || e.keyCode) == 9) {
			e.preventDefault();
			if ($("#checkInsert").val() == 2) {
				$('#category').focus();
			} else {
				$('#name').focus();
			}
		}
	});

	// Set again first focus for list screen
	   $('.header').keydown(function(e){
	    if($('.btn-logout').is(":focus") && (e.which || e.keyCode) == 9) {
	     e.preventDefault();
	     $(".link-vehicle").first().focus();
	    }
	   });
});

/**
 * init datatable
 */
function initDataTable() {
	tableUnion1Master = $('#union1-table').DataTable({
		  "sScrollY" : calcDataTableHeight(1),
		  "lengthMenu" : [ 10, 25, 50, 100 ],
		  "scrollX" : true,
		  "bScrollCollapse": true,
		  "aaSorting": [],
		  "bAutoWidth" : true,
		  "fnInitComplete":function(){
			    $('.dataTables_scrollBody').perfectScrollbar();
			},
		  "iDisplayLength" :25,
		 // "order": [[ 2, "asc" ],[ 3, "asc" ],[ 4, "asc" ]],
		  "aoColumnDefs" : [ {
		      bSortable : false,
		      aTargets : [0,1, 5,6,7,8,9,10,11]
		  } ],
		  "bSort" : true,
		  "aoColumns" : [
				{"width" : "3%", "sClass" : "t-center" },
				{"width" : "3%", "sClass" : "t-right", },
				{"width" : "6%", "sClass" : "t-center", },
				{"width" : "4%", "sClass" : "t-center", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "27%", "sClass" : "t-left", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "9%", "sClass" : "t-left", },
				{"width" : "5%", "sClass" : "t-center", }
			],
			"dom": "<'row'<'col-xs-2'l><'col-xs-8'><'col-xs-2'f>>" +
			"<'row'<'col-xs-12'tr>>" +
			"<'row'<'col-xs-3'i><'col-xs-5'><'col-xs-4'p>>",
			"fnRowCallback" : function(nRow, aData, iDisplayIndex,
					iDisplayIndexFull) {
				var api = this.api();
				var needTooltipsArr = [6,7,8,9,10];
			    for (var i = 0; i < needTooltipsArr.length; i++) {
			     tooltipsForRow(api.$('td:eq(' + needTooltipsArr[i]+ ')', nRow));
			    }
			}
	 });

	//set No. when sort on datatable
	tableUnion1Master.on( 'order.dt search.dt', function () {
        tableUnion1Master.column(1, {search:'applied', order:'applied'}).nodes().each( function (cell, i) {
            cell.innerHTML = formatNuberic(i);
        } );
    } ).draw();
}

/**
 * wrap row & add tooltips for long items
 *
 * @params : element
 */
function tooltipsForRow(elem) {
	var $this = elem || null;
	if ($this != null && $this.text() != null && $this.text() != "") {
			 $this.css({
					'word-wrap' : 'normal',
					'white-space' : 'nowrap',
					'overflow-x' : 'hidden',
					'text-overflow' : 'ellipsis'
				});
			 if (isEllipsisActive2($this)){
				 $this.qtip({
						content : {
							text : convertXSS($this.text())
						},
						position : {
							my : 'top left',
							at : 'bottom left',
							target : $this
						},
						style : {
							classes : 'qtip-bootstrap'
						}
					});
			 }
			 //show 10 digit only
			 var textShow = $this.text();
			 $this.text(ellipsify(textShow));
	}
}

/**
 * check show tooltips
 */
function isEllipsisActive2(e) {
	if(e.text().length > 10) {
		if(e.text().length == 13 && e.text().substring(10, 13) == '...') {
			return 1 > 2;
		} else {
			return 1 < 2;
		}
	}
}

/**
 * convert string
 */
function ellipsify (str) {
    if (str.length > 10) {
        return (str.substring(0, 10) + "...");
    }
    else {
        return str;
    }
}

/**
 * remove error
 */
function removeError() {
	//remove error
	$(".cdms_ul_error").remove();
	$('#category').removeClass('cdms_error');
	$('#classMst').removeClass('cdms_error');
	$('#cdPk').removeClass('cdms_error');
	$('#name').removeClass('cdms_error');
	$('#column1').removeClass('cdms_error');
	$('#column2').removeClass('cdms_error');
	$('#column3').removeClass('cdms_error');
	$('#column4').removeClass('cdms_error');
	$('#column5').removeClass('cdms_error');
	$('#time1').removeClass('cdms_error');
	$('.message ul:last').remove();
}

/**
 * Call when click each checkbox on table
 * @param union1Key current checkbox
 */
function checkDelete(union1Key) {
	var value = union1Key.value;
	var oldValue = $("#listUnion1Delete").val();
	var newValue = '';
	if (union1Key.checked == true) { // if has check, add new value has checked
		newValue = oldValue + value + ',';
	} else {
		var temp = oldValue.substring(0, oldValue.length-1);
		var array = temp.split(',');
		var newString = '';
		for(var i = 0; i < array.length; i++) {
			if (array[i] != value) {
				newString += array[i] + ',';
			}
		}
		newValue = newString;
	}
	//add new value to hidden
	$("#listUnion1Delete").val(newValue);
	if ($("#listUnion1Delete").val() != '') {
		//$('#confirmRedirectMenu').val(true);
		$(".btn-delete").removeAttr('disabled');
		$(".div-delete").css('pointer-events','all');
		$(".btn-delete").css('background-color','rgba(0, 112, 191, 1)');
	} else {
		//$('#confirmRedirectMenu').val(false);
		$(".btn-delete").attr('disabled','disabled');
		$(".div-delete").css('pointer-events','none');
		$(".btn-delete").css('background-color','grey');
	}
}

/**
 * Call when delete button click
 * @param params data
 * @param actionName action name
 * @param methodType type
 */
function callAjaxDeleteData(params, actionName, methodType,page) {
	loading_ajax();
    $.ajax({
    		cache: false,
            url : actionName,
            type : methodType,
            data: params,
            dataType : "json",
            contentType: "application/json; charset=utf-8",
            success : function(response) {
            	close_loading_ajax();
					$("#listUnion1Delete").val("");
					//$('#confirmRedirectMenu').val(false);
					$(".btn-delete").attr('disabled','disabled');
					$(".div-delete").css('pointer-events','none');
					$(".btn-delete").css('background-color','grey');
					var fam001List = response.fam001List;
	            	drawData(fam001List,page);
	            	setTabIndex();
            },
            error:function(jqXhr, textStatus, errorThrown){
                alert(textStatus);
                close_loading_ajax();
            }
    });
}

/**
 * Call when update button click
 * @param params data
 * @param actionName action name
 * @param methodType type
 */
function callAjaxUpdateData(params, actionName, methodType,page) {
	loading_ajax();
    $.ajax({
    		cache: false,
            url : actionName,
            type : methodType,
            data: params,
            dataType : "json",
            contentType: "application/json; charset=utf-8",
            success : function(response) {
            	close_loading_ajax();
            	$('#myModal').modal('hide');
            	$("#checkInsert").val("");
            	var fam001List = response.fam001List;
            	drawData(fam001List,page);
            	setTabIndex();
            },
            error:function(jqXhr, textStatus, errorThrown){
            	if(checkLoginRequiredForAjax(jqXhr)){
            		alert(textStatus);
                    close_loading_ajax();
            	}
            }
    });
}

/**
 * Call when insert button click
 * @param params data
 * @param actionName action name
 * @param methodType type
 */
function callAjaxInsertData(params, actionName, methodType,page) {
	loading_ajax();
    $.ajax({
    		cache: false,
            url : actionName,
            type : methodType,
            data: params,
            dataType : "json",
            contentType: "application/json; charset=utf-8",
            success : function(response) {
            	close_loading_ajax();
            	var messageId = response.messageId;

            	if (messageId != null && messageId != "") {
            		showErrorDialog(messageId)
				} else {
					$('#myModal').modal('hide');
	            	$("#checkInsert").val("");
	            	var fam001List = response.fam001List;
	            	drawData(fam001List,page);
	            	setTabIndex();
				}
            },
            error:function(jqXhr, textStatus, errorThrown){
                alert(textStatus);
                close_loading_ajax();
            }
    });
}

/**
 * Draw table after save and edit
 */
function drawData(fam001List,page) {
	var dataSet =[];
	var length = fam001List.length;
	if (length > 0) {
		tableUnion1Master.clear();

		for(var i = 0 ; i < length; i++) {
			var index = i + 1;
        	var dataRow =[];
        	var checkbox = "<input class='checkbox_table' type='checkbox' onclick='checkDelete(this);' name='s' value='"+fam001List[i].category+":"+fam001List[i].classMst+":"+fam001List[i].cdPk+"'>";
        	var cdPk = "<a href='javascript:void(0)' class='link_update_table link-vehicle' id='uni1_cdpk_"+index+"' data-index='"+index+"' data-type = 'modal'>"+fam001List[i].cdPk+"</a>";
        	dataRow.push(checkbox, index, fam001List[i].category, fam001List[i].classMst, cdPk, fam001List[i].name, fam001List[i].column1, fam001List[i].column2, fam001List[i].column3, fam001List[i].column4, fam001List[i].column5, fam001List[i].time1);
        	dataSet.push(dataRow);
        }
		tableUnion1Master.rows.add(dataSet);
		tableUnion1Master.draw();
		$('#union1-table').dataTable().fnPageChange(page);
	}
}

/**
 * Call when check EXCLUSIVE_FG
 * @param params data
 * @param actionName action name
 * @param methodType type
 */
function callAjaxCheckExclusiveFg(params, actionName, methodType) {
	loading_ajax();
    $.ajax({
    		cache: false,
            url : actionName,
            type : methodType,
            data: params,
            dataType : "json",
            contentType: "application/json; charset=utf-8",
            success : function(response) {
            	var messageId = response.messageId;

            	if (messageId != null && messageId != "") {
            		showErrorDialog(messageId)
				} else {
					// show popup
					$('#myModal').on('shown.bs.modal', function () {
						$("#name").focus();
						setTabIndexPopup(1);
					});
					$("#myModal").modal();
	            	close_loading_ajax();
				}
            	close_loading_ajax();
            },
            error:function(jqXhr, textStatus, errorThrown){
                alert(textStatus);
                close_loading_ajax();
            }
    });
}

/**
 * Call when cancel button click
 * @param params data
 * @param actionName action name
 * @param methodType type
 */
function callAjaxUpdateExclusiveFg(params, actionName, methodType) {
    $.ajax({
    		cache: false,
            url : actionName,
            type : methodType,
            data: params,
            dataType : "json",
            contentType: "application/json; charset=utf-8",
            success : function(response) {
            	$('#myModal').modal('hide');
            	$("#checkInsert").val("");
            	//setTabIndex();
            },
            error:function(jqXhr, textStatus, errorThrown){
                alert(textStatus);
            }
    });
}

/**
 * clear popup
 */
function clearPopup(){
	$("#category").val("");
	$("#classMst").val("");
	$("#cdPk").val("");
	$("#name").val("");
	$("#column1").val("");
	$("#column2").val("");
	$("#column3").val("");
	$("#column4").val("");
	$("#column5").val("");
	$("#time1").val("");
	document.getElementById("category").removeAttribute("disabled");
	document.getElementById("classMst").removeAttribute("disabled");
	document.getElementById("cdPk").removeAttribute("disabled");
}

/**
 * call popup when edit data
 */
$(document).on('click', '#union1-table [data-type = "modal"]', function(event) {
	$("#row_id_selected").val($(this).attr("id"));
	$(this).closest("tr").toggleClass("selected");
	var values = [];
	values = tableUnion1Master.rows(".selected").data();
	var fam001bean = [];
	var fam001bean = values[0];

	var res = fam001bean[4].split(">");
	var res2 = res[1].split("<");
	var valuesCdPk = res2[0];

	$("#category").val(fam001bean[2]);
	$("#classMst").val(fam001bean[3]);
	$("#cdPk").val(valuesCdPk);
	$("#name").val(fam001bean[5]);
	$("#column1").val(fam001bean[6]);
	$("#column2").val(fam001bean[7]);
	$("#column3").val(fam001bean[8]);
	$("#column4").val(fam001bean[9]);
	$("#column5").val(fam001bean[10]);
	$("#time1").val(fam001bean[11]);
	$("#checkInsert").val(1);

	$(this).closest("tr").removeClass("selected");

	document.getElementById("category").setAttribute("disabled", "disabled");
    document.getElementById("classMst").setAttribute("disabled", "disabled");
    document.getElementById("cdPk").setAttribute("disabled", "disabled");

    //remove error
    removeError();

    // show popup
	$('#myModal').on('shown.bs.modal', function () {
		$("#name").focus();
		setTabIndexPopup(1);
	});
	$("#myModal").modal();

	//check EXCLUSIVE_FG
	var fam001bean2 = {};
	fam001bean2.category = fam001bean[2];
	fam001bean2.classMst = fam001bean[3];
	fam001bean2.cdPk = valuesCdPk;
	/*callAjaxCheckExclusiveFg(fam001bean2,'sam0011_03','GET');*/

});


/**
 * Call when click button Delete
 */
function doDelete() {
	showConfirmDialog("delete","","",{"position":"200"})
}

/**
 * Call when click button Save
 */
function doSave() {
	if (validateForm()) {
		showConfirmDialog("save","","",{"position":"200"})
	}
}

/**
 * Call when click button Cancel
 */
function doCancel() {
	var fam001bean = {};
	fam001bean.category = $("#category").val();
	fam001bean.classMst = $("#classMst").val();
	fam001bean.cdPk = $("#cdPk").val();

	callAjaxUpdateExclusiveFg(fam001bean,'sam0011_04','GET');
}

/**
 * Method will call when Click button yes on dialog confirm
 * @param idEvent Event Save/Delete
 * @param element Dialog confirm
 */
function doEventDialog01(idEvent, element){
	var info = tableUnion1Master.page.info();
	var page = info.page;
	// In case delete
	if(idEvent=="delete") {
		var values = [];
		var paramsForJava = {};
//		$("#union1-table").find("input[type='checkbox']:checked").each(function(){
//			values.push($(this).val());
//		});

		var values2 = $("#listUnion1Delete").val();

		var strValues = "";
		strValues = values.toString();
		paramsForJava.values = values2;
		callAjaxDeleteData(paramsForJava, 'sam0011_01', 'GET',page);
	}

	// In case save
	if(idEvent=="save") {
		var fam001bean = {};
		fam001bean.category = $("#category").val();
		fam001bean.classMst = $("#classMst").val();
		fam001bean.cdPk = $("#cdPk").val();
		fam001bean.name = $("#name").val();
		fam001bean.column1 = $("#column1").val();
		fam001bean.column2 = $("#column2").val();
		fam001bean.column3 = $("#column3").val();
		fam001bean.column4 = $("#column4").val();
		fam001bean.column5 = $("#column5").val();
		fam001bean.time1 = $("#time1").val();

		var paramsForJava = {};
		paramsForJava.fam001bean = fam001bean;

		var checkInsert = $("#checkInsert").val();
		if(checkInsert == 1) {
			fam001bean.checkInsert = checkInsert;
			callAjaxUpdateData(fam001bean,'sam0011_02','GET',page);
		} else {
			fam001bean.checkInsert = checkInsert;
			callAjaxInsertData(fam001bean,'sam0011_02','GET',page);
		}
	}
}


/**
 * Method check input charCode for 'Time_1'
 * @param evt
 * @returns {Boolean}
 */
function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57) && (charCode != 43) && (charCode != 45) && (charCode != 58)) {
        return false;
    }
    return true;
}

/**
 * Set tabindex when init screen and click button Cancel
 */
function setTabIndex() {
	$("th, input, select, a").attr('tabindex','-1');
	$(".link-vehicle").attr('tabindex','1');
	$(".btn-new").attr('tabindex','2');
	$(".btn-delete").attr('tabindex','3');
	$(".btn-logout").attr('tabindex','4');

	$(".link-vehicle").first().focus();
}

/**
 * Set tabindex when init screen and click button Cancel
 */
function setTabIndex2() {
	$("th, input, select, a").attr('tabindex','-1');
	var id = $("#row_id_selected").val();
	$(".link-vehicle").attr('tabindex','1');
	$(".btn-new").attr('tabindex','2');
	$(".btn-delete").attr('tabindex','3');
	$(".btn-logout").attr('tabindex','4');

	var id = $("#row_id_selected").val();
	$("#"+id).first().focus();
}

/**
 * Set tabindex when click button New, link Edit
 * @param mode New/Edit
 */
function setTabIndexPopup(mode) {
	$(".close").attr('tabindex','-1');
	$(".link-vehicle").attr('tabindex','-1');
	$(".btn-new").attr('tabindex','-1');
	$(".btn-delete").attr('tabindex','-1');
	$(".btn-logout").attr('tabindex','-1');

	if (mode == 2) {
		$("#category").first().focus();
		$("#category").attr('tabindex','1');
		$("#classMst").attr('tabindex','2');
		$("#cdPk").attr('tabindex','3');
		$("#name").attr('tabindex','4');
		$("#column1").attr('tabindex','5');
		$("#column2").attr('tabindex','6');
		$("#column3").attr('tabindex','7');
		$("#column4").attr('tabindex','8');
		$("#column5").attr('tabindex','9');
		$("#time1").attr('tabindex','10');
		$(".btn-save").attr('tabindex','11');
		$(".btn-cancel").attr('tabindex','12');
	} else {
		$("#category").attr('tabindex','-1');
		$("#classMst").attr('tabindex','-1')
		$("#cdPk").attr('tabindex','-1')
		$("#name").first().focus();
		$("#name").val($("#name").val());
		$("#name").attr('tabindex','1');
		$("#column1").attr('tabindex','2');
		$("#column2").attr('tabindex','3');
		$("#column3").attr('tabindex','4');
		$("#column4").attr('tabindex','5');
		$("#column5").attr('tabindex','6');
		$("#time1").attr('tabindex','7');
		$(".btn-save").attr('tabindex','8');
		$(".btn-cancel").attr('tabindex','9');
	}

}