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
	
	$('.dropdown-toggle').dropdown();

	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();




	
	
});



/**
*
* header tap panel
*/
function openCity(cityName, elmnt, color) {
    // Hide all elements with class="tabcontent" by default */
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Remove the background color of all tablinks/buttons
    tablinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].style.backgroundColor = "";
    }

    // Show the specific tab content
    document.getElementById(cityName).style.display = "block";

    // Add the specific color to the button used to open the tab content
    elmnt.style.backgroundColor = color;
    
}



/* Set the width of the side navigation to 250px and the left margin of the page content to 250px */
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
}















