

function prepareRequest() {
	var jsonRequest = {}
	
	if ($('#login').val().includes("@")) {
		jsonRequest.email = $('#login').val()
	} else {
		jsonRequest.pseudo = $('#login').val()
	}
	
	jsonRequest.mot_de_passe = $('#password').val()
	
	console.log("jsonRequest: "+JSON.stringify(jsonRequest))
	return jsonRequest
}

function serverResponce(data) {
	if (data) {
		window.location.replace("./acceuil.html")
	} else {
		console.log("responce false")
	}
}

function tryToAuth() {
	$.ajax({
		  type: "POST",
		  url: "http://10.41.102.6:8080/ENI_encheres/rest/authentification",
		  data: JSON.stringify(prepareRequest()),
		  success: function (xhr, status) {
			  console.log("ajax responce success");
			  console.log(status);
			  window.location.replace("./acceuil.html");
          },
		  contentType: "application/json; charset=utf-8",
          dataType: "application/json",
		  error: function (xhr, status) {
			  console.log("ajax responce error");
              console.log(xhr);
          }
		});
}

