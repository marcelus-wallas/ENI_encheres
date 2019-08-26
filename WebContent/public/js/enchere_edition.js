

var jsonResponce1 = {
                    "article": "fauteuil",
                    "description": "fauteuil en cuir",
                    "categorie": "maison",
                    "mise_a_prix": "310",
                    "dateDebut": "2018-08-10",
                    "dateFin": "2018-09-01",
                    "rue": "rue du pulpe",
                    "code_postal": "01000",
                    "ville": "Hollywood"
                  }

function htmlInputArticle() {
  // appel API
  console.log("htmlInputArticle")
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce1.article+'">'
  return html
}

function htmlInputDescription() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce1.description+'">'
  return html
}

function htmlInputCategorie() {
  // appel API
  var html = '<select class="form-control" id="exampleFormControlSelect1">'
  html += '<option>'+jsonResponce1.categorie+'</option>'
  html += '<option>cat 2</option>'
  html += '<option>cat 3</option>'
  html += '<option>cat 4</option>'
  html += '<option>cat 5</option>'
  html += '</select>'
  return html
}

function htmlInputMise_a_prix() {
  // appel API
  var html = '<input type="number" class="form-control" placeholder="'+jsonResponce1.mise_a_prix+'">'
  return html
}

function htmlInputDateDebut() {
  // appel API
  var html = '<input type="date" class="form-control" value="'+jsonResponce1.dateDebut+'">'
  return html
}

function htmlInputDateFin() {
  // appel API
  var html = '<input type="date" class="form-control" value="'+jsonResponce1.dateFin+'">'
  return html
}

function htmlInputRue() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce1.rue+'">'
  return html
}

function htmlInputCode_postal() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce1.code_postal+'">'
  return html
}

function htmlInputVille() {
  // appel API
  var html = '<input type="text" class="form-control" placeholder="'+jsonResponce1.ville+'">'
  return html
}

function main() {
  $('#inputArticle').replaceWith(htmlInputArticle())
  $('#inputDescription').replaceWith(htmlInputDescription())
  $('#inputCategorie').replaceWith(htmlInputCategorie())
  $('#inputMiseAPrix').replaceWith(htmlInputMise_a_prix())
  $('#inputDateDebut').replaceWith(htmlInputDateDebut())
  $('#inputDateFin').replaceWith(htmlInputDateFin())
  $('#inputRue').replaceWith(htmlInputRue())
  $('#inputCodePostal').replaceWith(htmlInputCode_postal())
  $('#inputVille').replaceWith(htmlInputVille())
}

main()
