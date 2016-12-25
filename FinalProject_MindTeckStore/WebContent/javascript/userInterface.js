// User interface Constructor
function UserInterface(){
	// EVENTS
	this.eventHandlers = function(){ 
		eventHandlers();
	};
	this.registrationForm = new RegistrationForm();	

	//console.log("regex:" + /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test("vdmpeniel@yahoo.es"));
}





// Event Handlers 
function eventHandlers(){ 
		
		$(window).ready(function(){	

		});

		$(window).resize(function(){						
			centerDialog($("#Registration"));
		});		

		//Sign Up event
		$("#SignUp").on("click", function(){
			makeVisible($("#Registration"));	
			centerDialog($("#Registration"));
		});


		// Close event
		$(".closeDialog").on("click", function(){
			makeInvisible($(".closeDialog").parent());
		});
}


