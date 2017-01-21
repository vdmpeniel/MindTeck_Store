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


registerUser= function(xhttp){
	//document.getElementById("RegistrationForm").innerHTML = xhttp.responseText;
	console.log("Registerin new User!");	
}


/*
	 JQuery get example
	 $("button").click(function(){
	    $.get("demo_test.asp", function(data, status){
	        alert("Data: " + data + "\nStatus: " + status);
	    });
	 });
	 
	 JQuery post example
	 $("button").click(function(){
	    $.post("demo_test_post.asp",
	    {
	        name: "Donald Duck",
	        city: "Duckburg"
	    },
	    function(data, status){
	        alert("Data: " + data + "\nStatus: " + status);
	    });
	 });
 
 */