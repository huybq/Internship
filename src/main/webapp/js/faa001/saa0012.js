$(document).ready(function() {
	setTabIndex();

	// Set again first focus for menu screen
	   $('.header').keydown(function(e){
	     if($('.btn-logout').is(":focus") && (e.which || e.keyCode) == 9) {
	       e.preventDefault();
	       $(".menu_link_2").first().focus();
	     }

	     if($('.btn-logout').is(":focus") && (e.which || e.keyCode) == 13) {
		       e.preventDefault();
		       $(".btn-logout").click();
		    }
	   });

	//set action when keycode = 13 (Enter)
	   $('.cl-body').keydown(function(e){
		    if($('.menu_link_2').is(":focus") && (e.which || e.keyCode) == 13) {
		       e.preventDefault();
		       $('.menu_link_2').click();
		    }
		    if($('.menu_link_3').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_3').click();
			    }
		    if($('.menu_link_5').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_5').click();
			    }
		    if($('.menu_link_6').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_6').click();
			    }
		    if($('.menu_link_8').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_8').click();
			    }
		    if($('.menu_link_9').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_9').click();
			    }
		    if($('.menu_link_10').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_10').click();
			    }
		    if($('.menu_link_11').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_11').click();
			    }
		    if($('.menu_link_13').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_13').click();
			    }
		    if($('.menu_link_15').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_15').click();
			    }
		    if($('.menu_link_16').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_16').click();
			    }
		    if($('.menu_link_17').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_17').click();
			    }
		    if($('.menu_link_18').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_18').click();
			    }
		    if($('.menu_link_19').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_19').click();
			    }
		    if($('.menu_link_20').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_20').click();
			    }
		    if($('.menu_link_21').is(":focus") && (e.which || e.keyCode) == 13) {
			       e.preventDefault();
			       $('.menu_link_21').click();
			    }
		});
})

/**
 * Set tabindex
 */
function setTabIndex() {
	$("th, input, select, a").attr('tabindex','-1');
	$(".menu_link_2").attr('tabindex','1');
	$(".menu_link_3").attr('tabindex','2');
	$(".menu_link_5").attr('tabindex','3');
	$(".menu_link_6").attr('tabindex','4');
	$(".menu_link_8").attr('tabindex','5');
	$(".menu_link_9").attr('tabindex','6');
	$(".menu_link_10").attr('tabindex','7');
	$(".menu_link_11").attr('tabindex','8');
	$(".menu_link_13").attr('tabindex','9');
	$(".menu_link_15").attr('tabindex','10');
	$(".menu_link_16").attr('tabindex','11');
	$(".menu_link_17").attr('tabindex','12');
	$(".menu_link_18").attr('tabindex','13');
	$(".menu_link_19").attr('tabindex','14');
	$(".menu_link_20").attr('tabindex','15');
	$(".menu_link_21").attr('tabindex','16');
	$(".btn-logout").attr('tabindex','17');

	$(".menu_link_2").first().focus();
}