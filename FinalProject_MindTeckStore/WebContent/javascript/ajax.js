function ajaxLoad(callBackfunction){
	var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
    	if (this.readyState == 4 && this.status == 200) {
	    	console.log("Asking info to server");
	        callBackfunction(this);
	    }
   };
   xhttp.open("POST", "registrationForm", true);
   xhttp.send();
}


getForm = function(xhttp){
	document.getElementById("RegistrationForm").innerHTML = xhttp.responseText;	   
}