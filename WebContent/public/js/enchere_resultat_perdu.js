var jsonResponce1 = {
                    "gagnant": "Mia Wallace",
                    "article": "PC gamer",
                    "description": "Pour TRAVAILLER !!!",
                    "prixMeuilleurOffre": "210",
                    "utilisateurMeilleurOffre": "Bob",
                    "mise_a_prix": "185",
                    "dateFin": "2018-10-09",
                    "rue": "10 rue du pulpe",
                    "code_postal": "01000",
                    "ville": "Hollywood",
                    "vendeur": "Vincent Vega"
                  }

function htmlGagnant() {
  // appel API
  var html = jsonResponce1.gagnant
  return html
}

function htmlInputArticle() {
  // appel API
  var html = '<h5>'+jsonResponce1.article+'</h5>'
  return html
}

function htmlInputDescription() {
  // appel API
  var html = '<h6>'+jsonResponce1.description+'</h6>'
  return html
}

function htmlInputMeilleurOffre() {
  // appel API
  var html = '<h6>'+jsonResponce1.prixMeuilleurOffre+'</h6>'
  return html
}

function htmlInputMise_a_prix() {
  // appel API
  var html = '<h6>'+jsonResponce1.mise_a_prix+'</h6>'
  return html
}

function htmlInputDateFin() {
  // appel API
    var html = '<h6>'+jsonResponce1.dateFin+'</h6>'
  return html
}

function htmlInputRetrait() {
  // appel API
  var html = '<h6>'+jsonResponce1.rue+'</h6></br>'
  html += '<h6>'+jsonResponce1.code_postal+' '+jsonResponce1.ville+'</h6>'
  return html
}

function htmlInputVendeur() {
  // appel API
  var html = '<h6>'+jsonResponce1.vendeur+'</h6>'
  return html
}

function main() {
  $('#gagant').replaceWith(htmlGagnant())
  $('#inputArticle').replaceWith(htmlInputArticle())
  $('#inputDescription').replaceWith(htmlInputDescription())
  $('#inputMeilleurOffre').replaceWith(htmlInputMeilleurOffre())
  $('#inputMiseAPrix').replaceWith(htmlInputMise_a_prix())
  $('#inputDateFin').replaceWith(htmlInputDateFin())
  $('#inputRetrait').replaceWith(htmlInputRetrait())
  $('#inputVendeur').replaceWith(htmlInputVendeur())
}

main()
