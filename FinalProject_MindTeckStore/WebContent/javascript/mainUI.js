

function main(){
	var uI = new UserInterface();	
	uI.eventHandlers();	
}

// When page is loaded start presentation layer (  equivalent of $(document).ready(function(){ ... });  )
$(function(){
	console.log("Ready and starting...");
	main();
});