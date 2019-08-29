function formatDate(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    return [year, month, day].join('-');
}

function validation() {
	var isValid = true
	var jsonRequest = {}

	jsonRequest.no_utilisateur = readCookie("IdUser")

	if ($('#nom_article').val() != "") {
		jsonRequest.nom_article = $('#nom_article').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Nom de l\'article invalide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#description').val() != "") {
		jsonRequest.description = $('#description').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Description invalide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#selectCategoriesNouveau').val() != "") {
		jsonRequest.no_categorie = $('#selectCategoriesNouveau').val()
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Categorie invalide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#prixInitial').val() != "") {
		if (parseInt($('#prixInitial').val()) >= 0) {
			jsonRequest.prix_initial = parseInt($('#prixInitial').val())
		} else {
			$('#messageError').replaceWith('<h6 id="messageError">Prix initial negatif ou nul</h6>')
			$('#modal').modal('show')	
			return null
		}
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Prix initial invalide</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#date_debut_encheres').val() != "" && $('#date_fin_encheres').val() != "") {
		if ($('#date_debut_encheres').val() < $('#date_fin_encheres').val()){
			if ($('#date_debut_encheres').val() > formatDate(Date.now())) {
				if ($('#date_fin_encheres').val() > formatDate(Date.now())) {
					jsonRequest.date_debut_encheres = $('#date_debut_encheres').val()
					jsonRequest.date_fin_encheres = $('#date_fin_encheres').val()
				} else {
					$('#messageError').replaceWith('<h6 id="messageError">Date de fin deja passée</h6>')
					$('#modal').modal('show')
					return null			
				}
			} else {
				$('#messageError').replaceWith('<h6 id="messageError">Date de debut deja passée</h6>')
				$('#modal').modal('show')	
				return null		
			}
		} else {
			$('#messageError').replaceWith('<h6 id="messageError">Date de debut apres date de fin</h6>')
			$('#modal').modal('show')	
			return null		
		}
	} else {
		$('#messageError').replaceWith('<h6 id="messageError">Champs dates non remplis</h6>')
		$('#modal').modal('show')
		return null
	}
	if ($('#rue').val() == "" && $('#code_postal').val() == "" && $('#ville').val() == "") {
		
	} else {
		if ($('#rue').val() != "" && $('#code_postal').val() != "" && $('#ville').val() != "") {
			jsonRequest.rue = $('#rue').val()
			jsonRequest.code_postal = $('#code_postal').val()
			jsonRequest.ville = $('#ville').val()
		} else {
			$('#messageError').replaceWith('<h6 id="messageError">Veuillez remplir tous les champs de retrait ou aucun</h6>')
			$('#modal').modal('show')
			return null
		}
	}
	
	console.log("JSON: "+JSON.stringify(jsonRequest))
	return jsonRequest
}

function prepareRequest() {
	var jsontosend = {}
	jsontosend.pseudo = "MiaMiam"
	jsontosend.email = ""
	jsontosend.mot_de_passe = "password"
	console.log("jsontosend: "+JSON.stringify(jsontosend))
	return jsontosend
}

function sendNewEnchere() {
	var jsonToSend = validation()
	if (validation() != null){
		console.log("JSON: "+JSON.stringify(jsonToSend))
		
		$.ajax({
			  type: "POST",
			  url: "http://localhost:8080/ENI_encheres/rest/authentification",
			  data: prepareRequest(),
			  success: function (xhr, status) {
				  console.log("j'ai reussi")
				  window.location.replace("accueil.html")
	          },
			  contentType: "application/json; charset=utf-8",
	          dataType: "json",
			  error: function (xhr, status) {
				  console.error("POST /ENI_encheres/rest/authentification error")
				  console.error("xhr: "+JSON.stringify(xhr))
	          }
		})
		
//		$.ajax({
//			type: "POST",
//			url: "http://localhost:8080/ENI_encheres/rest/encheres_creation",
//			data: jsonToSend,
//			success: function (xhr, status) {
//				console.log("xhr: "+JSON.stringify(xhr))
//				$('#messageError').replaceWith('<h6 id="messageError">Votre enchere a été enregistrée</h6>')
//				$('#modal').modal('show')
//				setTimeout(function(){ window.location.replace("accueil.html") }, 2000)
//			},
//			contentType: "application/json",
//			dataType: "json",
//			error: function (xhr, status) {
//				console.error("POST /ENI_encheres/rest/encheres_creation error")
//				console.error("xhr: "+JSON.stringify(xhr))
//			}
//		})
	}
}

function main() {
	$.get("/ENI_encheres/rest/categories", function(arrayCategories, status){
		setupEnchereNouveau(arrayCategories.categoriesDTO)
	})
}

main()