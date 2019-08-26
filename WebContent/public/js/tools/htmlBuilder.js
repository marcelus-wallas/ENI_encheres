
// Reponse Serveur
// compte edition
var json_compte_edition1 = {
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

var json_compte_edition2 = {
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
// compt profil
var json_compte_profil1 = {
                    "pseudo": "Miamiam",
                    "nom": "Wallace",
                    "prenom": "Mia",
                    "email": "mWallace@yopmail.com",
                    "telephone": "0102030405",
                    "rue": "rue du pulpe",
                    "code_postal": "01000",
                    "ville": "Hollywood"
                  }
var json_compte_profil2 = {
                    "pseudo": "Vince",
                    "nom": "Vega",
                    "prenom": "Vincent",
                    "email": "travolta@pulpFiction.com",
                    "telephone": "0606060606",
                    "rue": "rue de la Fiction",
                    "code_postal": "02650",
                    "ville": "Los Angles"
                  }

// Traitement Html
// compte edition
function compteEditionInputPseudo() {
  debbug('compteEditionInputPseudo')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.pseudo+'">'
  return html
}

function compteEditionInputNom() {
  debbug('compteEditionInputNom')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.nom+'">'
  return html
}

function compteEditionInputPrenom() {
  debbug('compteEditionInputPrenom')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.prenom+'">'
  return html
}

function compteEditionInputEmail() {
  debbug('compteEditionInputEmail')
  var html = '<input type="email" class="form-control" placeholder="'+json_compte_edition1.email+'">'
  return html
}

function compteEditionInputTelephone() {
  debbug('compteEditionInputTelephone')
  var html = '<input type="tel" class="form-control" placeholder="'+json_compte_edition1.telephone+'">'
  return html
}

function compteEditionInputRue() {
  debbug('compteEditionInputRue')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.rue+'">'
  return html
}

function compteEditionInputCodePostal() {
  debbug('compteEditionInputCodePostal')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.code_postal+'">'
  return html
}

function compteEditionInputVille() {
  debbug('compteEditionInputVille')
  var html = '<input type="text" class="form-control" placeholder="'+json_compte_edition1.ville+'">'
  return html
}

function compteEditionInputMotDePasse() {
  debbug('compteEditionInputMotDePasse')
  var html = '<input type="password" class="form-control" placeholder="'+json_compte_edition1.mot_de_passe+'">'
  return html
}

function compteEditionCredit() {
  debbug('compteEditionCredit')
  var html = '<h6>'+json_compte_edition1.credit+'</h6>'
  return html
}

function compteEditionSetUpHtmll() {
  compteEditionInputPseudo()
  compteEditionInputNom()
  compteEditionInputPrenom()
  compteEditionInputEmail()
  compteEditionInputTelephone()
  compteEditionInputRue()
  compteEditionInputCodePostal()
  compteEditionInputVille()
  compteEditionInputMotDePasse()
  compteEditionCredit()
}

// compt profil
function compgteProfilPseudo() {
  debbug('compgteProfilPseudo')
  var html = "<h6>"+json_compte_profil.pseudo+"</h6>"
  return html
}

function compteProfilNom() {
  debbug('compteProfilNom')
  var html = "<h6>"+json_compte_profil.nom+"</h6>"
  return html
}

function compteProfilPrenom() {
  debbug('compteProfilPrenom')
  var html = "<h6>"+json_compte_profil.prenom+"</h6>"
  return html
}

function compteProfilemail() {
  debbug('compteProfilemail')
  var html = "<h6>"+json_compte_profil.email+"</h6>"
  return html
}

function compteProfilTelephone() {
  debbug('compteProfilTelephone')
  var html = "<h6>"+json_compte_profil.telephone+"</h6>"
  return html
}

function compteProfilRue() {
  debbug('compteProfilRue')
  var html = "<h6>"+json_compte_profil.rue+"</h6>"
  return html
}

function compteProCodePostal() {
  debbug('compteProCodePostal')
  var html = "<h6>"+json_compte_profil.code_postal+"</h6>"
  return html
}

function compteProVille() {
  debbug('compteProVille')
  var html = "<h6>"+json_compte_profil.ville+"</h6>"
  return html
}


//qskjfgjqgfqjz
