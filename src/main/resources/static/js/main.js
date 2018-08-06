/**
 * 
 */

$(document).ready(function(){
	
	$('.addbtn').on('click', function(event){
		event.preventDefault();
		
		var text = $(this).text();
		if(text=='Add'){
			
			$('.modalForm #part').val('');
			$('.modalForm #Name').val('');
			$('.modalForm #Location').val('');
			$('.modalForm #Description').val('');
			$('.modalForm #exampleModal').modal();
			
			
		}
		
		
	});
	
});