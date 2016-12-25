// Input Prototype Constructor
function Input(id, name, errorMessage, label, value, validation){
	// Properties
	this.id = id;
	this.name = name;
	this.errorMessage = errorMessage;
	this.label = label;
	this.value = value;
	this.validation = validation;
}


// Form Prototype Contructor
function Form( container, title, submit, cancel){
	// Properties
	this.inputList = [];
	this.title = title;
	this.submit = submit;
	this.cancel = cancel;	
	this.submited = false;
	this.formContainer = container;

	// Methods
	// Load inputs into inputList
	this.submitValidation = function(){
		var warningsElement = $("#" +  this.formContainer + "Warnings");
		var isInputValid = true;
		warningsElement.find("ul").html("");

		for(var i = 0; i < this.inputList.length; ++i){
			var inputElement = $("#" + this.inputList[i].id);
			var value = inputElement.val();
			console.log(value);

			// If input is valid save it into the list and mark input as OK
			var validation = this.inputList[i].validation;

			console.log(validation(value));
			if(validation(value)){
				//update inputList
				this.inputList[i].value = value;
				// Change classes to OK!
				inputElement.parent().parent().attr("class", "form-group has-success has-feedback");
				inputElement.next().attr("class", "glyphicon glyphicon-ok form-control-feedback");
			} else{ 
				// Change classes to ERROR!
				inputElement.parent().parent().attr("class", "form-group row has-error has-feedback");
				inputElement.next().attr("class", "glyphicon glyphicon-remove form-control-feedback");	

				// Append warning to warnings
				warningsElement.find("ul").append("<li>" + this.inputList[i].errorMessage + "</li>");
				
				isInputValid = false;
			}

			// If is not valid then show warnings
			if(isInputValid){ warningsElement.css("display", "block"); }
		}
		
	};


	this.createForm = function(){
		// Container div Creation
		var formDialog = $('<div></div>');
		formDialog.attr("id",this.formContainer);
		formDialog.addClass("dialogBox");
		var formId = this.formContainer + "Form";

		var html;
		html =  "<h2>" + this.title + "</h2>";
		html += "<a class=\"closeDialog\" id=\"CloseDialog\" href=# ><span class=\"glyphicon glyphicon-remove-circle\"></span></a>"
		html +=	"<form class=\"form-horizontal\" id=\"" + formId + "\" action=\"\">";


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

		// Add Submit and cancel buttons		
		html += "<div class=\"form-group\">";
		html += "	<div class=\"col-sm-3\"></div>";
		html += "		<div class=\"col-sm-3\">";
		if(this.submit){
			html += "			<button class=\"btn btn-block btn-primary\" type=\"submit\" name=\"submit\" >Submit</button>";	
		}		
		html += "		</div>";
		html += "	</div>";
		html +=	"</form>";
		

		// Add warnings
		html += "<div id=\"" + this.formContainer + "Warnings\" class=\"warning\">";
		html +=	"<h3><span class=\"glyphicon glyphicon-exclamation-sign\"></span>  Ups! Something went wrong.</h3>";
		html +=	"<ul></ul>";
		html += "</div>";

		formDialog.html(html);		
		$('#Dialogs').append(formDialog);	// append div to Dialogs


		// Form events
		var formThis = this;  // To be able to access this context inside the jquery function
		$("#" + formId).on({
			submit : function(event){
				event.preventDefault();
				formThis.submitValidation();
				centerDialog(formDialog);
				formThis.submited = true;
			},
			change : function(){
				if(this.submited){ submitValidation(); } 
			}
		});

	};

	

}






