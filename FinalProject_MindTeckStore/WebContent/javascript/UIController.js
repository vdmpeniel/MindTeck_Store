// IMPLEMENTATIONS

function centerDialog(elem){	

	// Find Window Center	
	var horizontalCenter = Math.floor(window.innerWidth / 2);
	var verticalCener = Math.floor(window.innerHeight / 2);

	// Get Dialog box 
	var dialogBox = elem;

	// Calculate dialogBox center
	var boxStyle = getComputedStyle(dialogBox);
	var boxHorizontalCenter = parseInt(boxStyle.getPropertyValue("width")) / 2;
	var boxVerticalCenter = parseInt(boxStyle.getPropertyValue("height")) / 2;		
	
	// Center dialogBox
	if(verticalCener - boxVerticalCenter > 10 ){
		dialogBox.style.top = verticalCener - boxVerticalCenter + "px";
	} else {
		dialogBox.style.top = "20px";
	}
	dialogBox.style.left = horizontalCenter - boxHorizontalCenter + "px";	
	
}


function submitValidation(){
	// Get input fields
	var nameInput = document.getElementById("NameInput");
	var lastNameInput = document.getElementById("LastNameInput");
	var phoneNumberInput = document.getElementById("PhoneNumberInput");
	var passwordInput = document.getElementById("PasswordInput");

	// Get input fields values
	var name = nameInput.value;		
	var lastName = lastNameInput.value;		
	var phoneNumber = phoneNumberInput.value;	
	var password = passwordInput.value;

	// Set validations	
	var validationList = [];
	validationList[0] = name.length < 5 || name === "Enter name here";
	validationList[1] = lastName.length < 5 || lastName === "Enter last name here";
	validationList[2] = phoneNumber.length < 12 || phoneNumber === "000-000-0000";	
	validationList[3] = password.length < 8 || password === "Password";

	// Set error messages
	var errorMessages = ["Name have to be at least 5 characters",
						 "Last name can't be empty",
						 "Enter a valid phone number",
						 "Password needs to be 8 characters or more"];

	// Validation
	var form = document.getElementById("RegistrationForm");
	var divList = form.children;
	var isValidForm = true;	
	var warnings = document.getElementById("Warnings");	
	warnings.lastElementChild.innerHTML = ""
		
	for(var i = 0; i < divList.length - 1; i++){
		// Select items to change
		var div = divList[i];
		var span = div.lastElementChild.lastElementChild;
		
		if(validationList[i]){	
			// Change classes		
			div.className = "form-group row has-error has-feedback";		
			span.className = "glyphicon glyphicon-remove form-control-feedback";

			// Append warning			
			var node = document.createElement("LI");
			var text = document.createTextNode(errorMessages[i]);
			node.appendChild(text);
			warnings.lastElementChild.appendChild(node);

			isValidForm = false;			
		} else{
			div.className = "form-group has-success has-feedback";
			span.className = "glyphicon glyphicon-ok form-control-feedback";
		}
		
	}
	// Showing warnings
	warnings.style.display = (!isValidForm)? "block" : "none";
}


function handleFormSubmit(event){
	event.preventDefault();
	submitValidation();
	centerDialog("Registration");
}


function makeVisible(elem){
	var element = elem;
	console.log(element.className);	
	element.style.top = "50px";
	element.style.opacity = "1";
}


function makeInvisible(iD){
	var element = document.getElementById(iD);
	element.style.top = "-500px";
	element.style.opacity = "0";
}







