
// compte edition
function compteEditionInputPseudo(jsonCompteEdition) {
  debbug('compteEditionInputPseudo')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.pseudo+'">'
  return html
}

function compteEditionInputNom(jsonCompteEdition) {
  debbug('compteEditionInputNom')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.nom+'">'
  return html
}

function compteEditionInputPrenom(jsonCompteEdition) {
  debbug('compteEditionInputPrenom')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.prenom+'">'
  return html
}

function compteEditionInputEmail(jsonCompteEdition) {
  debbug('compteEditionInputEmail')
  var html = '<input type="email" class="form-control" placeholder="'+jsonCompteEdition.email+'">'
  return html
}

function compteEditionInputTelephone(jsonCompteEdition) {
  debbug('compteEditionInputTelephone')
  var html = '<input type="tel" class="form-control" placeholder="'+jsonCompteEdition.telephone+'">'
  return html
}

function compteEditionInputRue(jsonCompteEdition) {
  debbug('compteEditionInputRue')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.rue+'">'
  return html
}

function compteEditionInputCodePostal(jsonCompteEdition) {
  debbug('compteEditionInputCodePostal')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.code_postal+'">'
  return html
}

function compteEditionInputVille(jsonCompteEdition) {
  debbug('compteEditionInputVille')
  var html = '<input type="text" class="form-control" placeholder="'+jsonCompteEdition.ville+'">'
  return html
}

function compteEditionInputMotDePasse(jsonCompteEdition) {
  debbug('compteEditionInputMotDePasse')
  var html = '<input type="password" class="form-control" placeholder="'+jsonCompteEdition.mot_de_passe+'">'
  return html
}

function compteEditionCredit(jsonCompteEdition) {
  debbug('compteEditionCredit')
  var html = '<h6>'+jsonCompteEdition.credit+'</h6>'
  return html
}
// TODO arg
function compteEditionSetUpHtml(jsonCompteEdition) {
  debbug("jsonCompteEdition: "+JSON.stringify(jsonCompteEdition))
  $("#compteEditionInputPseudo").replaceWith(compteEditionInputPseudo(jsonCompteEdition))
  $("#compteEditionInputNom").replaceWith(compteEditionInputNom(jsonCompteEdition))
  $("#compteEditionInputPrenom").replaceWith(compteEditionInputPrenom(jsonCompteEdition))
  $("#compteEditionInputEmail").replaceWith(compteEditionInputEmail(jsonCompteEdition))
  $("#compteEditionInputTelephone").replaceWith(compteEditionInputTelephone(jsonCompteEdition))
  $("#compteEditionInputRue").replaceWith(compteEditionInputRue(jsonCompteEdition))
  $("#compteEditionInputCodePostal").replaceWith(compteEditionInputCodePostal(jsonCompteEdition))
  $("#compteEditionInputVille").replaceWith(compteEditionInputVille(jsonCompteEdition))
  $("#compteEditionInputMotDePasse").replaceWith(compteEditionInputMotDePasse(jsonCompteEdition))
  $("#compteEditionCredit").replaceWith(compteEditionCredit(jsonCompteEdition))
}

// compt mon profil
function compteMonProfilPseudo(jsonCompteMonProfil) {
  debbug('compgteMonProfilPseudo')
  var html = "<h6>"+jsonCompteMonProfil.pseudo+"</h6>"
  return html
}

function compteMonProfilNom(jsonCompteMonProfil) {
  debbug('compteMonProfilNom')
  var html = "<h6>"+jsonCompteMonProfil.nom+"</h6>"
  return html
}

function compteMonProfilPrenom(jsonCompteMonProfil) {
  debbug('compteMonProfilPrenom')
  var html = "<h6>"+jsonCompteMonProfil.prenom+"</h6>"
  return html
}

function compteMonProfilemail(jsonCompteMonProfil) {
  debbug('compteMonProfilemail')
  var html = "<h6>"+jsonCompteMonProfil.email+"</h6>"
  return html
}

function compteMonProfilTelephone(jsonCompteMonProfil) {
  debbug('compteMonProfilTelephone')
  var html = "<h6>"+jsonCompteMonProfil.telephone+"</h6>"
  return html
}

function compteMonProfilRue(jsonCompteMonProfil) {
  debbug('compteMonProfilRue')
  var html = "<h6>"+jsonCompteMonProfil.rue+"</h6>"
  return html
}

function compteMonProfilCodePostal(jsonCompteMonProfil) {
  debbug('compteMonProCodePostal')
  var html = "<h6>"+jsonCompteMonProfil.code_postal+"</h6>"
  return html
}

function compteMonProfilVille(jsonCompteMonProfil) {
  debbug('compteMonProVille')
  var html = "<h6>"+jsonCompteMonProfil.ville+"</h6>"
  return html
}

function compteMonProfilSetUpHtml(jsonCompteMonProfil) {
  debbug("jsonCompteMonProfil: "+JSON.stringify(jsonCompteMonProfil))
  $("#compteMonProfilPseudo").replaceWith(compteMonProfilPseudo(jsonCompteMonProfil))
  $("#compteMonProfilNom").replaceWith(compteMonProfilNom(jsonCompteMonProfil))
  $("#compteMonProfilPrenom").replaceWith(compteMonProfilPrenom(jsonCompteMonProfil))
  $("#compteMonProfilEmail").replaceWith(compteMonProfilemail(jsonCompteMonProfil))
  $("#compteMonProfilTelephone").replaceWith(compteMonProfilTelephone(jsonCompteMonProfil))
  $("#compteMonProfilRue").replaceWith(compteMonProfilRue(jsonCompteMonProfil))
  $("#compteMonProfilCodePostal").replaceWith(compteMonProfilCodePostal(jsonCompteMonProfil))
  $("#compteMonProfilVille").replaceWith(compteMonProfilVille(jsonCompteMonProfil))
}

// compte profil
function compteProfilPseudo(jsonCompteProfil) {
  debbug('compteProfilPseudo')
  var html = "<h6>"+jsonCompteProfil.pseudo+"</h6>"
  return html
}

function compteProfilNom(jsonCompteProfil) {
  debbug('compteProfilNom')
  var html = "<h6>"+jsonCompteProfil.nom+"</h6>"
  return html
}

function compteProfilPrenom(jsonCompteProfil) {
  debbug('compteProfilPrenom')
  var html = "<h6>"+jsonCompteProfil.prenom+"</h6>"
  return html
}

function compteProfilEmail(jsonCompteProfil) {
  debbug('compteProfilEmail')
  var html = "<h6>"+jsonCompteProfil.email+"</h6>"
  return html
}

function compteProfilTelephone(jsonCompteProfil) {
  debbug('compteProfilTelephone')
  var html = "<h6>"+jsonCompteProfil.telephone+"</h6>"
  return html
}

function compteProfilRue(jsonCompteProfil) {
  debbug('compteProfilRue')
  var html = "<h6>"+jsonCompteProfil.rue+"</h6>"
  return html
}

function compteProfilCodePostal(jsonCompteProfil) {
  debbug('compteProfilCodePostal')
  var html = "<h6>"+jsonCompteProfil.code_postal+"</h6>"
  return html
}

function compteProfilVille(jsonCompteProfil) {
  debbug('compteProfilVille')
  var html = "<h6>"+jsonCompteProfil.ville+"</h6>"
  return html
}

function compteProfilSetUpHtml(jsonCompteProfil) {
  debbug("jsonCompteProfil: "+JSON.stringify(jsonCompteProfil))
  $("#compteProfilPseudo").replaceWith(compteProfilPseudo(jsonCompteProfil))
  $("#compteProfilNom").replaceWith(compteProfilNom(jsonCompteProfil))
  $("#compteProfilPrenom").replaceWith(compteProfilPrenom(jsonCompteProfil))
  $("#compteProfilEmail").replaceWith(compteProfilEmail(jsonCompteProfil))
  $("#compteProfilTelephone").replaceWith(compteProfilTelephone(jsonCompteProfil))
  $("#compteProfilRue").replaceWith(compteProfilRue(jsonCompteProfil))
  $("#compteProfilCodePostal").replaceWith(compteProfilCodePostal(jsonCompteProfil))
  $("#compteProfilVille").replaceWith(compteProfilVille(jsonCompteProfil))
}

// enchere details
function EchereDetailArticle(jsonEchereDetails) {
  debbug('EchereDetailArticle')
  var html = '<h5>'+jsonEchereDetails.article+'</h5>'
  return html
}

function EchereDetailDescription(jsonEchereDetails) {
  debbug('EchereDetailDescription')
  var html = '<h6>'+jsonEchereDetails.description+'</h6>'
  return html
}

function EchereDetailCategorie(jsonEchereDetails) {
  debbug('EchereDetailCategorie')
  var html = '<h6>'+jsonEchereDetails.categorie+'</h6>'
  return html
}

function EchereDetailMeilleurOffre(jsonEchereDetails) {
  debbug('EchereDetailMeilleurOffre')
  var html = '<h6>'+jsonEchereDetails.prixMeuilleurOffre+'pts par '+jsonEchereDetails.utilisateurMeilleurOffre+'</h6>'
  return html
}

function EchereDetailMiseAPrix(jsonEchereDetails) {
  debbug('EchereDetailMise_a_prix')
  var html = '<h6>'+jsonEchereDetails.mise_a_prix+'</h6>'
  return html
}

function EchereDetailDateFin(jsonEchereDetails) {
  debbug('EchereDetailDateFin')
    var html = '<h6>'+jsonEchereDetails.dateFin+'</h6>'
  return html
}

function EchereDetailRetrait(jsonEchereDetails) {
  debbug('EchereDetailRetrait')
  var html = '<h6>'+jsonEchereDetails.rue+'</h6></br>'
  html += '<h6>'+jsonEchereDetails.code_postal+' '+jsonResponce1.ville+'</h6>'
  return html
}

function EchereDetailVendeur(jsonEchereDetails) {
  debbug('EchereDetailArticle')
  var html = '<h6>'+jsonEchereDetails.vendeur+'</h6>'
  return html
}

function echereDetailsSetUpHtml(jsonEchereDetails) {
  debbug("jsonCompteMonProfil: "+JSON.stringify(jsonEchereDetails))
  $("#echereDetailsArticle").replaceWith(EchereDetailArticle(jsonEchereDetails))
  $("#echereDetailsDescription").replaceWith(EchereDetailDescription(jsonEchereDetails))
  $("#echereDetailsCategorie").replaceWith(EchereDetailCategorie(jsonEchereDetails))
  $("#echereDetailsMeilleurOffre").replaceWith(EchereDetailMeilleurOffre(jsonEchereDetails))
  $("#echereDetailsMiseAPrix").replaceWith(EchereDetailMiseAPrix(jsonEchereDetails))
  $("#echereDetailsDateFin").replaceWith(EchereDetailDateFin(jsonEchereDetails))
  $("#echereDetailsRetrait").replaceWith(EchereDetailRetrait(jsonEchereDetails))
  $("#echereDetailsVendeur").replaceWith(EchereDetailVendeur(jsonEchereDetails))
}

// enchere edition
function enchereEditionArticle(jsonEchereEdition) {
  debbug('enchereEditionArticle')
  var html = '<input type="text" class="form-control" placeholder="'+jsonEchereEdition.article+'">'
  return html
}

function enchereEditionDescription(jsonEchereEdition) {
  debbug('enchereEditionDescription')
  var html = '<input type="text" class="form-control" placeholder="'+jsonEchereEdition.description+'">'
  return html
}

function enchereEditionCategorie(jsonEchereEdition) {
  debbug('enchereEditionCategorie')
  var html = '<select class="form-control" id="exampleFormControlSelect1">'
  html += '<option>'+jsonEchereEdition.categorie+'</option>'
  html += '<option>cat 2</option>'
  html += '<option>cat 3</option>'
  html += '<option>cat 4</option>'
  html += '<option>cat 5</option>'
  html += '</select>'
  return html
}

function enchereEditionMiseAPrix(jsonEchereEdition) {
  debbug('enchereEditionMiseAPrix')
  var html = '<input type="number" class="form-control" placeholder="'+jsonEchereEdition.mise_a_prix+'">'
  return html
}

function enchereEditionDateDebut(jsonEchereEdition) {
  debbug('enchereEditionDateDebut')
  var html = '<input type="date" class="form-control" value="'+jsonEchereEdition.dateDebut+'">'
  return html
}

function enchereEditionDateFin(jsonEchereEdition) {
  debbug('enchereEditionDateFin')
  var html = '<input type="date" class="form-control" value="'+jsonEchereEdition.dateFin+'">'
  return html
}

function enchereEditionRue(jsonEchereEdition) {
  debbug('enchereEditionRue')
  var html = '<input type="text" class="form-control" placeholder="'+jsonEchereEdition.rue+'">'
  return html
}

function enchereEditionCodePostal(jsonEchereEdition) {
  debbug('enchereEditionCodePostal')
  var html = '<input type="text" class="form-control" placeholder="'+jsonEchereEdition.code_postal+'">'
  return html
}

function enchereEditionVille(jsonEchereEdition) {
  debbug('enchereEditionVille')
  var html = '<input type="text" class="form-control" placeholder="'+jsonEchereEdition.ville+'">'
  return html
}

function echereDetailsSetUpHtml(jsonEchereEdition) {
  debbug("jsonCompteMonProfil: "+JSON.stringify(jsonEchereEdition))
  $("#echereDetailsArticle").replaceWith(enchereEditionArticle(jsonEchereEdition))
  $("#echereDetailsDescription").replaceWith(enchereEditionDescription(jsonEchereEdition))
  $("#echereDetailsCategorie").replaceWith(enchereEditionCategorie(jsonEchereEdition))
  $("#echereDetailsMiseAPrix").replaceWith(enchereEditionMiseAPrix(jsonEchereEdition))
  $("#echereDetailsDateDebut").replaceWith(enchereEditionDateDebut(jsonEchereEdition))
  $("#echereDetailsDateFin").replaceWith(enchereEditionDateFin(jsonEchereEdition))
  $("#echereDetailsRue").replaceWith(enchereEditionRue(jsonEchereEdition))
  $("#echereDetailsCodePostal").replaceWith(enchereEditionCodePostal(jsonEchereEdition))
  $("#echereDetailsVille").replaceWith(enchereEditionVille(jsonEchereEdition))
}

// enchere resultat gagant
function enchereResGagantArticle() {
  debbug('enchereResGagantArticle')
  var html = '<h5>'+jsonResponce1.article+'</h5>'
  return html
}

function enchereResGagantDescription() {
  debbug('enchereResGagantDescription')
  var html = '<h6>'+jsonResponce1.description+'</h6>'
  return html
}

function enchereResGagantMeilleurOffre() {
  debbug('enchereResGagantMeilleurOffre')
  var html = '<h6>'+jsonResponce1.prixMeuilleurOffre+'</h6>'
  return html
}

function enchereResGagantMiseAPrix() {
  debbug('enchereResGagantMiseAPrix')
  var html = '<h6>'+jsonResponce1.mise_a_prix+'</h6>'
  return html
}

function enchereResGagantDateFin() {
  debbug('enchereResGagantDateFin')
    var html = '<h6>'+jsonResponce1.dateFin+'</h6>'
  return html
}

function enchereResGagantRetrait() {
  debbug('enchereResGagantRetrait')
  var html = '<h6>'+jsonResponce1.rue+'</h6></br>'
  html += '<h6>'+jsonResponce1.code_postal+' '+jsonResponce1.ville+'</h6>'
  return html
}

function enchereResGagantVendeur() {
  debbug('enchereResGagantVendeur')
  var html = '<h6>'+jsonResponce1.vendeur+'</h6>'
  return html
}

function enchereResGagantTelephoneVendeur() {
  debbug('enchereResGagantTelephoneVendeur')
  var html = jsonResponce1.telephoneVendeur
  return html
}

function echereResGagantSetUpHtml(jsonEchereResGagant) {
  debbug("jsonEchereResGagant: "+JSON.stringify(jsonEchereResGagant))
  $("#enchereResGagantArticle").replaceWith(enchereResGagantArticle(jsonEchereResGagant))
  $("#enchereResGagantDescription").replaceWith(enchereResGagantDescription(jsonEchereResGagant))
  $("#enchereResGagantMeilleurOffre").replaceWith(enchereResGagantMeilleurOffre(jsonEchereResGagant))
  $("#enchereResGagantMiseAPrix").replaceWith(enchereResGagantMiseAPrix(jsonEchereResGagant))
  $("#enchereResGagantDateFin").replaceWith(enchereResGagantDateFin(jsonEchereResGagant))
  $("#enchereResGagantRetrait").replaceWith(enchereResGagantRetrait(jsonEchereResGagant))
  $("#enchereResGagantVendeur").replaceWith(enchereResGagantVendeur(jsonEchereResGagant))
  $("#enchereResGagantTelephoneVendeur").replaceWith(enchereResGagantTelephoneVendeur(jsonEchereResGagant))
}

// enchere resultat perdu
function enchereResPerdantGagnant(jsonEchereResPerdant) {
  debbug('enchereResPerdantGagnant')
  var html = jsonEchereResPerdant.gagnant
  return html
}

function enchereResPerdantArticle(jsonEchereResPerdant) {
  debbug('enchereResPerdantArticle')
  var html = '<h5>'+jsonEchereResPerdant.article+'</h5>'
  return html
}

function enchereResPerdantDescription(jsonEchereResPerdant) {
  debbug('enchereResPerdantDescription')
  var html = '<h6>'+jsonEchereResPerdant.description+'</h6>'
  return html
}

function enchereResPerdantMeilleurOffre(jsonEchereResPerdant) {
  debbug('enchereResPerdantMeilleurOffre')
  var html = '<h6>'+jsonEchereResPerdant.prixMeuilleurOffre+'</h6>'
  return html
}

function enchereResPerdantMiseAPrix(jsonEchereResPerdant) {
  debbug('enchereResPerdantMiseAPprix')
  var html = '<h6>'+jsonEchereResPerdant.mise_a_prix+'</h6>'
  return html
}

function enchereResPerdantDateFin(jsonEchereResPerdant) {
  debbug('enchereResPerdantDateFin')
    var html = '<h6>'+jsonEchereResPerdant.dateFin+'</h6>'
  return html
}

function enchereResPerdantRetrait(jsonEchereResPerdant) {
  debbug('enchereResPerdantRetrait')
  var html = '<h6>'+jsonEchereResPerdant.rue+'</h6></br>'
  html += '<h6>'+jsonEchereResPerdant.code_postal+' '+jsonEchereResPerdant.ville+'</h6>'
  return html
}

function enchereResPerdantVendeur(jsonEchereResPerdant) {
  debbug('enchereResPerdantVendeur')
  var html = '<h6>'+jsonEchereResPerdant.vendeur+'</h6>'
  return html
}

function echereResPerdantSetUpHtml(jsonEchereResPerdant) {
  debbug("jsonEchereResPerdant: "+JSON.stringify(jsonEchereResPerdant))
  $("#enchereResPerdantGagnant").replaceWith(enchereResPerdantGagnant(jsonEchereResPerdant))
  $("#enchereResPerdantArticle").replaceWith(enchereResPerdantArticle(jsonEchereResPerdant))
  $("#enchereResPerdantDescription").replaceWith(enchereResPerdantDescription(jsonEchereResPerdant))
  $("#enchereResPerdantMeilleurOffre").replaceWith(enchereResPerdantMeilleurOffre(jsonEchereResPerdant))
  $("#enchereResPerdantMiseAPrix").replaceWith(enchereResPerdantMiseAPrix(jsonEchereResPerdant))
  $("#enchereResPerdantDateFin").replaceWith(enchereResPerdantDateFin(jsonEchereResPerdant))
  $("#enchereResPerdantRetrait").replaceWith(enchereResPerdantRetrait(jsonEchereResPerdant))
  $("#enchereResPerdantVendeur").replaceWith(enchereResPerdantVendeur(jsonEchereResPerdant))
}

// index

function buildCol(jsonEnchereArray, indexEnchereArray) {
  debbug("buildCol")
  var htmlCard = ''
  if (indexEnchereArray<jsonEnchereArray.length) {
    htmlCard += '<div class="card" style="width: auto;">'
    htmlCard += '<div class="card-body">'
    htmlCard += '<div class="row">'
    htmlCard += '<div class="col-4">'
    htmlCard += '<img src="'+ jsonEnchereArray[indexEnchereArray].imgPath +'">'
    htmlCard += '</div>'
    htmlCard += '<div class="col-8">'
    htmlCard += '<a href="'+ jsonEnchereArray[indexEnchereArray].idEnchere +'" class="card-link">'
    htmlCard += '<h5 class="card-title">'+ jsonEnchereArray[indexEnchereArray].article +'</h5>'
    htmlCard += '</a>'
    htmlCard += '<p class="card-text">Prix : '+ jsonEnchereArray[indexEnchereArray].derniereEnchere +' points</p>'
    htmlCard += '<p class="card-text">Fin de l\'enchère : '+ jsonEnchereArray[indexEnchereArray].dateFin +'</p>'
    htmlCard += '<p class="card-text">Vendeur : '+ jsonEnchereArray[indexEnchereArray].vendeur +'</p>'
    htmlCard += '</div>'
    htmlCard += '</div>'
    htmlCard += '</div>'
    htmlCard += '</div>'
    return htmlCard
  } else {
    return ''
  }

}

function buildRow(jsonEnchereArray) {
  debbug("buildRow")
  var html = ""
  for (var i = 0; i<jsonEnchereArray.length; i++) {
    html += '<div class="row justify-content-md-center" style="margin-top:2rem;">'
    html += '<div class="col-4">'
    html += buildCol(jsonEnchereArray, i)
    i++
    html += '</div>'
    html += '<div class="col-4">'
    html += buildCol(jsonEnchereArray, i)
    i++
    html += '</div>'
    html += '<div class="col-4">'
    html += buildCol(jsonEnchereArray, i)
    html += '</div>'
    html += '</div>'
  }
  return html
}

function buildEnchereArray(jsonEnchereArray) {
  debbug("buildEnchereArray")
  var html = '<div class="container" style="max-width:100%;">'
  html += buildRow(jsonEnchereArray)
  html += '</div>'
  return html
}

function makeSelectCategorie(arrayCategories) {
	debbug("makeSelectCategorie")
	var html = '<select class="form-control" id="selectCategories">'
	html += '<option id="0">toutes</option>'
    for (var i = 0; i<arrayCategories.length; i++) {
    	html += '<option id="'+arrayCategories[i].no_categorie+'">'+arrayCategories[i].libelle+'</option>'
    }
    html += '</select>'
    return html
}

function makeSelectCategorieNouvreau(arrayCategories) {
	debbug("makeSelectCategorieNouveau")
	var html = '<select class="form-control" id="selectCategoriesNouveau">'
	html += '<option id="0"></option>'
    for (var i = 0; i<arrayCategories.length; i++) {
    	html += '<option value="'+arrayCategories[i].no_categorie+'">'+arrayCategories[i].libelle+'</option>'
    }
    html += '</select>'
    return html
}

function setupEnchereNouveau(arrayCategories) {
	  $('#selectCategoriesNouveau').replaceWith(makeSelectCategorieNouvreau(arrayCategories))
}

function indexSetUpHtml(jsonEnchereArray, arrayCategories) {
  debbug("jsonEnchereArray: "+JSON.stringify(jsonEnchereArray))
  debbug("arrayCategories: "+arrayCategories.length)
  $('#enchereToPrint').replaceWith(buildEnchereArray(jsonEnchereArray))
  $('#selectCategories').replaceWith(makeSelectCategorie(arrayCategories))
}

function accueilSetUpHtml(jsonEnchereArray, arrayCategories) {
  debbug("jsonEnchereArray: "+JSON.stringify(jsonEnchereArray, arrayCategories))
  $('#enchereToPrint').replaceWith(buildEnchereArray(jsonEnchereArray))
  $('#selectCategories').replaceWith(makeSelectCategorie(arrayCategories))
}
