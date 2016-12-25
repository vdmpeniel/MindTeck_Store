// IMPLEMENTATIONS

function centerDialog(element){	

	// Find Window Center	
	var horizontalCenter = Math.floor(window.innerWidth / 2);
	var verticalCener = Math.floor(window.innerHeight / 2);

	// Get Dialog box 
	var dialogBox = element;

	// Calculate dialogBox center
	var boxHorizontalCenter = dialogBox.innerWidth() / 2;
	var boxVerticalCenter = dialogBox.innerHeight() / 2;

	// Center dialogBox
	if(verticalCener - boxVerticalCenter > 10 ){ dialogBox.css("top", verticalCener - boxVerticalCenter + "px"); } 
	else { dialogBox.css("top", "20px"); }

	dialogBox.css("left", horizontalCenter - boxHorizontalCenter + "px");		
}


function makeVisible(element){	
	element.css("top", "50px");
	element.css("opacity","1");
}


function makeInvisible(element){
	element.css("top", "-500px");
	element.css("opacity", "0");
}







