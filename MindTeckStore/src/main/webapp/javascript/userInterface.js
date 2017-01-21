// User interface Constructor
function UserInterface(){

	// Methods
	this.makeVisible = function(element){	
		element.css("top", "50px");
		element.css("opacity","1");
	}

	this.makeInvisible = function(element){
		element.css("top", "-500px");
		element.css("opacity", "0");
	}

	this.centerDialog = function(element){	
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


	// Events

	this.eventHandlers = function(){ 
		var uIThis = this;		
		$(window).on({
			ready: function(){	

			},

			click: function(){
				// Close all dialogs
				uIThis.makeInvisible($("#Dialogs").children());
			}			
		});

		$(window).resize(function(){						
			uIThis.centerDialog($("#RegistrationDialog"));
			uIThis.centerDialog($("#LoginDialog"));
		});	
		
		// Sign Up event
		$("#SignUpLink").on("click", function(){
			event.stopPropagation();	// So it does no close all dialogs
			uIThis.makeInvisible($("#Dialogs").children());
			uIThis.makeVisible($("#RegistrationDialog"));	
			uIThis.centerDialog($("#RegistrationDialog"));
		});

		//Login Up event
		$("#LogInLink").on("click", function(){
			event.stopPropagation();	// So it does no close all dialogs
			uIThis.makeInvisible($("#Dialogs").children());
			uIThis.makeVisible($("#LoginDialog"));	
			uIThis.centerDialog($("#LoginDialog"));
		});


		// Close event
		$(".closeDialog").on("click", function(){
			uIThis.makeInvisible($(".closeDialog").parent());
		});		
	};

	


	this.registrationForm = new RegistrationForm("Registration");
	this.loginForm = new LoginForm("Login");	
	this.eventHandlers();
}



