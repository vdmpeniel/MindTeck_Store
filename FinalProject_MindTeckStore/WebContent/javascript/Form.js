

// Form Prototype Contructor
function Form(title){
	// Properties
	this.responseObject = {};
	this.title = title;
	this.isValid = true;
	this.submited = false;
	this.isOpen = false;	

	// Methods
	this.createInputStub = function(){};
	this.submitValidation = function(){};
	this.eventHandlers = function(){};

	// Inicialization calls
	this.createInputStub();
	this.eventHandlers();
}






