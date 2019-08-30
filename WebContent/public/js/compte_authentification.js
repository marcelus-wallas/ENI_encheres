

function prepareRequest() {
	var jsonRequest = {}
	if ($('#login').val().includes("@")) {
		jsonRequest.email = $('#login').val()
	} else {
		jsonRequest.pseudo = $('#login').val()
	}
	
	jsonRequest.mot_de_passe = $('#password').val()
	
	console.log("jsonRequest: "+JSON.stringify(jsonRequest))
	return JSON.stringify(jsonRequest)
	
}

function tryToAuth() {
	if ($('#login').val() != "" && $('#password').val() != ""){
		$.ajax({
			  type: "POST",
			  url: "http://localhost:8080/ENI_encheres/rest/authentification",
			  data: prepareRequest(),
			  success: function (xhr, status) {
				  if (xhr.no_utilisateur == 0) {
					  $('#modal').modal('show')
				  } else {
					  createCookie('IdUser',xhr.no_utilisateur,0)
					  window.location.replace("accueil.html")					  
				  }
	          },
			  contentType: "application/json; charset=utf-8",
	          dataType: "json",
			  error: function (xhr, status) {
				  console.error("POST /ENI_encheres/rest/authentification error")
	          }
		})
	} else {
		$('#modal').modal('show')
		console.log("champs pas rempli")
	}
}

function deconnexion()
{
	eraseCookie('IdUser')
	window.location.replace("accueil.html")
}