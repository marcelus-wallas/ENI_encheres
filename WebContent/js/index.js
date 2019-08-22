

var jsonEnchereArray = [
  {
    "idEnchere": "id1",
    "imgPath": "../img/chat.jpeg",
    "article": "PC gamer pour travailler",
    "derniereEnchere": 210,
    "dateFin": "2018-08-10",
    "vendeur": "jojo44"
  },
  {
    "idEnchere": "id2",
    "imgPath": "../img/chat.jpeg",
    "article": "PC gamer pas pour travailler",
    "derniereEnchere": 1000,
    "dateFin": "2019-08-10",
    "vendeur": "jojo42"
  },
  {
    "idEnchere": "id3",
    "imgPath": "../img/chat.jpeg",
    "article": "fauteuil",
    "derniereEnchere": 350,
    "dateFin": "2018-08-01",
    "vendeur": "Wolf"
  },
  {
    "idEnchere": "id4",
    "imgPath": "../img/chat.jpeg",
    "article": "Chat egyptien",
    "derniereEnchere": 1,
    "dateFin": "2018-10-10",
    "vendeur": "Tristan"
  }
  ,
  {
    "idEnchere": "id5",
    "imgPath": "../img/chat.jpeg",
    "article": "autre chat egyptien",
    "derniereEnchere": 2,
    "dateFin": "2018-08-08",
    "vendeur": "Maxime"
  }
]

console.log("before")

function htmlBuildCol(indexEnchereArray) {
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

function htmlBuildRow(html) {
    for (var i = 0; i<jsonEnchereArray.length; i++) {
      html += '<div class="row justify-content-md-center" style="margin-top:2rem;">'
      html += '<div class="col-4">'
      html += htmlBuildCol(i)
      i++
      html += '</div>'
      html += '<div class="col-4">'
      html += htmlBuildCol(i)
      i++
      html += '</div>'
      html += '<div class="col-4">'
      html += htmlBuildCol(i)
      html += '</div>'
      html += '</div>'
    }

    return html

}

function htmlBuildEnchereArray() {
  var html = '<div class="container" style="max-width:100%;">'
  html = htmlBuildRow(html)
  html += '</div>'

  console.log("html: "+html)
  return html
}

function main() {
  $('#enchereToPrint').replaceWith(htmlBuildEnchereArray())
}

main()
