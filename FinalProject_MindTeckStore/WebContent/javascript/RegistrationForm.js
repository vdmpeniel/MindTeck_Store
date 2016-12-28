// RegistrationForm Contructor
function RegistrationForm(title){
	Form.call(this, title); 	// calling the superclass constructor
	// Properties
	this.inputStub = [];	

	// Methods
	this.createInputStub = function(){
		var input = {}
		input.name = "name";
		input.defaultValue = "Enter name here.";
		input.errorMessage = "Name must be 5 characters long or more!";
		input.validation = function(name){
			return name.length > 5;
		};
		this.inputStub[0] = input;

		input = {}
		input.name = "lastName";
		input.defaultValue = "Enter last name here.";
		input.errorMessage = "Last name must be 5 characters long or more!";
		input.validation = function(lastName){
			return lastName.length > 5;
		};
		this.inputStub[1] = input;

		input = {}
		input.name = "email";
		input.defaultValue = "Email goes here.";
		input.errorMessage = "Enter a valid email!";
		input.validation = function(email){
			var regex = /^\w+([\.-]?\ w+)*@\w+([\.-]?\ w+)*(\.\w{2,3})+$/i;
			return regex.test(email);
		};
		this.inputStub[2] = input;

		input = {}
		input.name = "phone";
		input.defaultValue = "(000)-000-0000";
		input.errorMessage = "Enter a valid phone number!";
		input.validation = function(phone){
			var regex = /^(\()?(\d{3})(\))?(-|\s)*(\d{3})(-|\s)*(\d{4})$/;
			return regex.test(phone);
		};
		this.inputStub[3] = input;

		input = {}
		input.name = "password";
		input.defaultValue = "";
		input.errorMessage = "Password must be 8 characters or more!";
		input.validation = function(password){
			return password.length > 8;
		};
		this.inputStub[4] = input;

		input = {}
		input.name = "passwordRetype";
		input.defaultValue = "";
		input.errorMessage = "Both passwords have to be identical!";
		input.validation = function(password2){
			return password2 === $("#PasswordInput").val();
		};
		this.inputStub[5] = input;
	};

	
	this.submitValidation = function(){
		// Initialization
		var formDialog = $("#" + this.title + "Dialog");
		var warningsElement = $("#" + this.title + "Warnings");
		warningsElement.find("ul").html(""); 	
		warningsElement.css("display", "none"); 	// Make Warnings disappear (Try makeInvisible)
		this.isValid = true;

		var formThis = this;
		// LOOP through all inputs in the form		
		formDialog.find("form").find("input").each(function(index, input){ 
			var inputElement = $(input); // Converting input in a jquery object 
			var value = inputElement.val();			
			var inputObject = formThis.inputStub[index];			

			if(inputObject.validation(value)){
				// Update responseObject
				formThis.responseObject[inputObject.name] = value;

				// Change classes to OK!
				inputElement.parent().parent().attr("class", "form-group has-success has-feedback");
				inputElement.next().attr("class", "glyphicon glyphicon-ok form-control-feedback");
			} else{ 

				// Change classes to ERROR!
				inputElement.parent().parent().attr("class", "form-group row has-error has-feedback");
				inputElement.next().attr("class", "glyphicon glyphicon-remove form-control-feedback");	

				// Append warning to warnings
				warningsElement.find("ul").append("<li>" + inputObject.errorMessage + "</li>");
					
				// Form input is not valid
				formThis.isValid = false;
			}
		});

		// If form is not valid then show warnings
		if(!this.isValid){ 
			warningsElement.css("display", "block"); 	// Make it appear (Try makeVisible)
		}				
	};

	this.eventHandlers = function(){
		var formThis = this;

		// Dialog's events
		$("#" + this.title + "Dialog").on({			
			click: function(event){
				event.stopPropagation();	// So it does not close all dialogs
			}
		});

		// Events for this form
		$("#" + this.title + "Form").on({
			submit: function(event){
				// Stop default behavior
				event.preventDefault(); 

				// Validation
				formThis.submitValidation();
				if(formThis.isValid){

				}

				// Center Dialog in case the warning section changes 
				new UserInterface().centerDialog($(this));

				// Mark this form as submited at least once
				formThis.submited = true;
			},

			change: function(){
				if(formThis.submited){ formThis.submitValidation(); }
			}
					
		});


		// Events for all inputs in this form
		$("#" + this.title + "Form").find("input").on({
			focus: function(){				
				var index = $(this).parent().parent().index();		// Get index of the div containing the input from DOM

				// If value of input is not the default then clear it up
				if($(this).val() === formThis.inputStub[index].defaultValue){
					$(this).val("");
				}
			},

			blur: function(){
				var index = $(this).parent().parent().index();	   // Get index of the div containing the input from DOM	

				// If input is empty the put default back in it
				if($(this).val() === ""){
					$(this).val(formThis.inputStub[index].defaultValue);	// Reseting the value to the default
				}
			}
		});
	};


	// Inicialization calls
	this.createInputStub();
	this.eventHandlers();

}	
// RegistrationForm extends Form
RegistrationForm.prototype = Object.create(Form.prototype);
RegistrationForm.prototype.constructor = RegistrationForm;