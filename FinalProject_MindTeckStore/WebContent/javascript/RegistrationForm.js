// Registration Form Contructor
function RegistrationForm(){
	Form.call(this,"Registration", "User Registration", true, false); // calling the superclass constructor	
	
	// Methods
	// Add all inputs to inputList	
	this.createInputsStub = function(){	// This could come from a service but that is out of scope now	
		var input = new Input();
		input.id = "NameInput";
		input.name = "name";
		input.errorMessage = "Name has to be 5 characters or more!";
		input.label = "Name:";
		input.value = "Enter name here";
		input.validation = function(value){	return value.length > 5; };
		this.inputList.push(input);

		input = new Input();
		input.id = "LastNameInput";
		input.name = "lastName";
		input.errorMessage = "Last name has to be 5 characters or more!";
		input.label = "Last name:";
		input.value = "Enter last name here";
		input.validation = function(value){ return value.length >= 5; };
		this.inputList.push(input);

		input = new Input();
		input.id = "emailInput";
		input.name = "email";
		input.errorMessage = "Enter a valid email!";
		input.label = "Email:";
		input.value = "@";
		input.validation = function(value){ regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; return regex.test(value); };
		this.inputList.push(input);

		input = new Input();
		input.id = "PhoneNumberInput";
		input.name = "phoneNumber";
		input.errorMessage = "Phone number has to be 12 characters or more!";
		input.label = "Phone number:";
		input.value = "000-000-0000";
		input.validation = function(value){ return value.length >= 12; };
		this.inputList.push(input);

		input = new Input();
		input.id = "PasswordInput";
		input.name = "password";
		input.errorMessage = "Password must be 8 characters or more!";
		input.label = "Password:";
		input.value = "";
		input.validation = function(value){ return value.length >= 8; };	
		this.inputList.push(input);

		input = new Input();
		input.id = "RetypeInput";
		input.name = "retype";
		input.errorMessage = "Both passwords must be identical";
		input.label = "Retype password:";
		input.value = "";
		input.validation = function(value){ return value !== '' && value === this.inputList[i-1].value; };	
		this.inputList.push(input);
	};	

	// Initialization calls
	this.createInputsStub();
	this.createForm();
}
// RegistrationForm extends Form
RegistrationForm.prototype = Object.create(Form.prototype);
RegistrationForm.prototype.constructor = RegistrationForm;