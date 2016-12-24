// Input Prototype Constructor
function Input(id, name, errorMessage, label, value){
	// Properties
	this.id = id;
	this.name = name;
	this.errorMessage = errorMessage;
	this.label = label;
	this.value = value;
}


//  Form Prototype Contructor
function Form(title, submit, cancel){
	// Properties
	this.inputList = [];
	this.title = title;
	this.submit = submit;
	this.cancel = cancel;	

	// Methods
	this.createForm = function(){	
		console.log("Creating base HTML Form...");
		return "Nothing here!";
	};

	this.createForm = function(divId){
		console.log("Creating registration HTML Form...");	
		console.log(this.inputList[0].id);
		// Container div Creation
		var formDialog = document.createElement('div');
		formDialog.id = divId;
		formDialog.className = "dialogBox";


		var html;
		html =  "<h2>" + this.title + "</h2>";
		html += "<a class=\"closeDialog\" id=\"CloseDialog\" href=# ><span class=\"glyphicon glyphicon-remove-circle\"></span></a>"
		html +=	"<form class=\"form-horizontal\" id=\"" + divId + "Form\" action=\"\">";


		for (var i = 0; i < this.inputList.length; ++i){
			html += "<div class=\"form-group\">";
			html += "	<label class=\"col-sm-3 control-label\" for=\"" + this.inputList[i].id + "\" >" + this.inputList[i].label + "</label>";
			html += "	<div class=\"col-sm-7\">";
			html += "		<input class=\"form-control\" id=\"" + this.inputList[i].id + "\" type=\"text\" name=\"" 
				    		+ this.inputList[i].name + "\" value=\"" + this.inputList[i].value + "\">";
			html += "		<span></span>";
			html += "	</div>";
			html += "</div>";
		}

		// Add Submit button
		if(this.submit){
			html += "<div class=\"form-group\">";
			html += "	<div class=\"col-sm-3\"></div>";
			html += "		<div class=\"col-sm-3\">";
			html += "			<button class=\"btn btn-block btn-primary\" id=\"Submit\" type=\"submit\" name=\"submit\" >Submit</button>";
			html += "		</div>";
			html += "	</div>";
			html +=	"</form>";
		}

		// Add warnings
		html += "<div id=\"Warnings\" class=\"warning\">";
		html +=	"<h3><span class=\"glyphicon glyphicon-exclamation-sign\"></span>  Ups! Something went wrong.</h3>";
		html +=	"<ul></ul>";
		html += "</div>";

		formDialog.innerHTML = html;		
		document.getElementById('Dialogs').appendChild(formDialog);	// append div to Dialogs
	};
}


// Registration Form Contructor
function RegistrationForm(){
	Form.call(this,"User Registration", true, false);	
	
	// Methods
	// Add all inputs to inputList	
	this.createInputsStub = function(){	// This could come from a service but that is out of scope now	
		var input = new Input();
		input.id = "NameInput";
		input.name = "name";
		input.errorMessage = "Name has to be 5 characters or more!";
		input.label = "Name:";
		input.value = "Enter name here";
		this.inputList.push(input);

		input = new Input();
		input.id = "LastNameInput";
		input.name = "lastName";
		input.errorMessage = "Last name has to be 5 characters or more!";
		input.label = "Last name:";
		input.value = "Enter last name here";
		this.inputList.push(input);

		input = new Input();
		input.id = "PhoneNumberInput";
		input.name = "phoneNumber";
		input.errorMessage = "Phone number has to be 12 characters or more!";
		input.label = "Phone number:";
		input.value = "000-000-0000";
		this.inputList.push(input);

		input = new Input();
		input.id = "PasswordInput";
		input.name = "password";
		input.errorMessage = "Password must be 8 characters or more!";
		input.label = "Password:";
		input.value = "";
		this.inputList.push(input);
	};
	

	// Initialization calls
	this.createInputsStub();
}
// RegistrationForm extends Form
RegistrationForm.prototype = Object.create(Form.prototype);
RegistrationForm.prototype.constructor = RegistrationForm;


