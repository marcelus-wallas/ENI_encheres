
function validation() {
	var jsonRequest = {}

	if ($('#pseudo').val() != "") {
		jsonRequest.pseudo = $('#pseudo').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ pseudo ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#nom').val() != "") {
		jsonRequest.nom = $('#nom').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ nom ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#prenom').val() != "") {
		jsonRequest.prenom = $('#prenom').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ prenom ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#email').val() != "") {
		jsonRequest.email = $('#email').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ email ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#telephone').val() != "") {
		jsonRequest.telephone = $('#telephone').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ telephone ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#rue').val() != "") {
		jsonRequest.rue = $('#rue').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ rue ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#code_postal').val() != "") {
		jsonRequest.code_postal = $('#code_postal').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ code postal ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#ville').val() != "") {
		jsonRequest.ville = $('#ville').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ ville ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#mot_de_passe').val() != "") {
		jsonRequest.mot_de_passe = $('#mot_de_passe').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ mot de passe ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#confirmation').val() != "") {
		jsonRequest.confirmation = $('#confirmation').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champ confirmation ne peut pas être vide</h6>')
		$('#modal').modal('show')
		return null
	}
	
	console.log("JSON: "+JSON.stringify(jsonRequest))
	return JSON.stringify(jsonRequest)
}

function tryToCreateUser() {
	var jsonToSend = validation()
	console.log("jsonToSend: "+jsonToSend)
	if (jsonToSend != null) {
		
		$.ajax({
			type: "POST",
			url: "http://localhost:8080/ENI_encheres/rest/inscription",
			data: jsonToSend,
			success: function (xhr, status) {
				console.log("xhr: "+JSON.stringify(xhr))
				if (xhr != undefined) {
					if (xhr.no_utilisateur != null || xhr.no_utilisateur != undefined || xhr.no_utilisateur != "") {
						createCookie('IdUser', xhr.no_utilisateur, 0)
						setTimeout(function(){ window.location.replace("accueil.html") }, 2000)	
					} else {
						console.error("POST /ENI_encheres/rest/inscription error: "+status)
					} 
				} else {
					console.error("POST /ENI_encheres/rest/inscription error: "+status)
				}
			},
			contentType: "application/json",
			dataType: "json",
			error: function (xhr, status) {
				if (xhr != undefined) {
					$('#messageError').replaceWith("Erreur: "+xhr.responseJSON.message_erreur)
					$('#modal').modal('show')
				}
			}
		})
	}
}