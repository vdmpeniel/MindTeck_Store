// User interface Constructor
function UserInterface(){
	// EVENTS
	this.eventHandlers = function(){ 
		eventHandlers(this);
	};

	this.registrationForm = new RegistrationForm();
	this.registrationForm.createForm("Registration");
}





// Event Handlers 
function eventHandlers(){ 
		var submited = false;
			window.onload = function(){						
		};

		window.onresize = function(){
			var dialog = document.getElementById("Registration");				
			centerDialog(dialog);
		};

		// Registration Submit Event
		var form = document.getElementById("RegistrationForm");
		form.addEventListener("submit", function(event){
			handleFormSubmit(event);
			submited = true;
		});

		// Form onchange
		form.onchange = function(){
			if(submited){ submitValidation(); }
		};

		//Sign Up event
		var signUp = document.getElementById("SignUp");
		signUp.addEventListener("click", function(){
			//ajaxLoad(getForm);
			var dialog = document.getElementById("Registration");	
			makeVisible(dialog);	
			centerDialog(dialog);
		});

		// Close event
		var closeDialog = document.getElementById("CloseDialog");
		closeDialog.addEventListener("click", function(){
			makeInvisible("Registration");
		});
}


