$(document).ready(function() {
	if($('#userId').val() == "") {
		$('input[name=userId]').focus();
	} else {
		$('input[name=userPassword]').focus();
	}

	$(this).keypress(function(event) {
	    if (event.which == 13) {
	        event.preventDefault();
	        $("form").submit();
	    }
	});

	 $(window).resize(function(){
	  $('.className').css({
	   position:'absolute',
	   left: ($(window).width()
	     - $('.className').outerWidth())/2,
	   top: ($(window).height()
	     - $('.className').outerHeight())/2
	  });

	 });

	 // To initially run the function:
	 $(window).resize();

	// Set again first focus depend on last focus
	$('.login-form').keydown(function(e){
		if($('#btn-submit').is(":focus") && (e.which || e.keyCode) == 9) {
			e.preventDefault();
			$('.select-login').focus();
		}
	});
	
	$('#listSystemGroup').select2({
		  dropdownAutoWidth : true,
		  minimumResultsForSearch: Infinity
	});
})
