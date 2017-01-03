// LoginForm Contructor
function LoginForm(title){
	RegistrationForm.call(this,title); 	// calling the superclass constructor
	
	// Methods
	this.createInputStub = function(){
		var input = {}		
		input.name = "email";
		input.defaultValue = "Email goes here.";
		input.errorMessage = "Enter a valid email!";
		input.validation = function(email){
			var regex = /^\w+([\.-]?\ w+)*@\w+([\.-]?\ w+)*(\.\w{2,3})+$/i;
			return regex.test(email);
		};
		this.inputStub[0] = input;		

		input = {}
		input.name = "password";
		input.defaultValue = "";
		input.errorMessage = "Password must be 8 characters or more!";
		input.validation = function(password){
			return password.length > 8;
		};
		this.inputStub[1] = input;
	};
	
	this.submitValidation = function(){				
	};	




	// Inicialization calls
	this.createInputStub();
	this.eventHandlers();

}	


// *** RegistrationForm extends RegistrationForm ***
LoginForm.prototype = Object.create(RegistrationForm.prototype);
LoginForm.prototype.constructor = LoginForm;