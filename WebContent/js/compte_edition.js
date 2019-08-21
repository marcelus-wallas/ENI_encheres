

var jsonResponce1 = {
                    "pseudo": "Miamiam",
                    "nom": "Wallace",
                    "prenom": "Mia",
                    "email": "mWallace@yopmail.com",
                    "telephone": "0102030405",
                    "rue": "rue du pulpe",
                    "code_postal": "01000",
                    "ville": "Hollywood",
                    "mot_de_passe": "12345678",
                    "credit": 600
                  }
var jsonResponce2 = {
                    "pseudo": "Vince",
                    "nom": "Vega",
                    "prenom": "Vincent",
                    "email": "travolta@pulpFiction.com",
                    "telephone": "0606060606",
                    "rue": "rue de la Fiction",
                    "code_postal": "02650",
                    "ville": "Los Angles",
                    "mot_de_passe": "12345678",
                    "credit": 50
                  }

function htmlInputPseudo() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.pseudo+'">'
  return html
}

function htmlInputNom() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.nom+'">'
  return html
}

function htmlInputPrenom() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.prenom+'">'
  return html
}

function htmlInputEmail() {
  // appel API
  var html = '<input type="email" class="form-control" placeholder="'+jsonResponce2.email+'">'
  return html
}

function htmlInputTelephone() {
  // appel API
  var html = '<input type="tel" class="form-control" placeholder="'+jsonResponce2.telephone+'">'
  return html
}

function htmlInputRue() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.rue+'">'
  return html
}

function htmlInputCodePostal() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.code_postal+'">'
  return html
}

function htmlInputVille() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce2.ville+'">'
  return html
}

function htmlInputMotDePasse() {
  // appel API
  var html = '<input type="password" class="form-control" placeholder="'+jsonResponce2.mot_de_passe+'">'
  return html
}

function htmlCredit() {
  // appel API
  var html = '<h6>'+jsonResponce2.credit+'</h6>'
  return html
}

$("#inputPseudo").replaceWith(htmlInputPseudo())
$("#inputNom").replaceWith(htmlInputNom())
$("#inputPrenom").replaceWith(htmlInputPrenom())
$("#inputEmail").replaceWith(htmlInputEmail())
$("#inputTelephone").replaceWith(htmlInputTelephone())
$("#inputRue").replaceWith(htmlInputRue())
$("#inputCodePostal").replaceWith(htmlInputCodePostal())
$("#inputVille").replaceWith(htmlInputVille())
$("#inputMotDePasse").replaceWith(htmlInputMotDePasse())
$("#id_credit").replaceWith(htmlCredit())
