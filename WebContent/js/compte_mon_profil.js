

var jsonResponce1 = {
                    "pseudo": "Miamiam",
                    "nom": "Wallace",
                    "prenom": "Mia",
                    "email": "mWallace@yopmail.com",
                    "telephone": "0102030405",
                    "rue": "rue du pulpe",
                    "code_postal": "01000",
                    "ville": "Hollywood"
                  }
var jsonResponce2 = {
                    "pseudo": "Vince",
                    "nom": "Vega",
                    "prenom": "Vincent",
                    "email": "travolta@pulpFiction.com",
                    "telephone": "0606060606",
                    "rue": "rue de la Fiction",
                    "code_postal": "02650",
                    "ville": "Los Angles"
                  }

function htmlPseudo() {
  // appel API
  var html = "<h6>"+jsonResponce2.pseudo+"</h6>"
  return html
}

function htmlNom() {
  // appel API
  var html = "<h6>"+jsonResponce2.nom+"</h6>"
  return html
}

function htmlPrenom() {
  // appel API
  var html = "<h6>"+jsonResponce2.prenom+"</h6>"
  return html
}

function htmlemail() {
  // appel API
  var html = "<h6>"+jsonResponce2.email+"</h6>"
  return html
}

function htmlTelephone() {
  // appel API
  var html = "<h6>"+jsonResponce2.telephone+"</h6>"
  return html
}

function htmlRue() {
  // appel API
  var html = "<h6>"+jsonResponce2.rue+"</h6>"
  return html
}

function htmlCodePostal() {
  // appel API
  var html = "<h6>"+jsonResponce2.code_postal+"</h6>"
  return html
}

function htmlVille() {
  // appel API
  var html = "<h6>"+jsonResponce2.ville+"</h6>"
  return html
}

$("#id_pseudo").replaceWith(htmlPseudo())
$("#id_nom").replaceWith(htmlNom())
$("#id_prenom").replaceWith(htmlPrenom())
$("#id_email").replaceWith(htmlemail())
$("#id_telephone").replaceWith(htmlTelephone())
$("#id_rue").replaceWith(htmlRue())
$("#id_code_postal").replaceWith(htmlCodePostal())
$("#id_ville").replaceWith(htmlVille())
