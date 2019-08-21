

var jsonResponce1 = {
                    "nom": "test1",
                    "prix": 200
                  }
var jsonResponce2 = {
                    "nom": "test2",
                    "prix": 500
                  }

console.log("before")

function htmlBuilder() {
  // appel API

  console.log("in function")
  var html = "<p>nom : "+jsonResponce1.nom+"</p></br><p>prix : "+jsonResponce1.prix+"</p>"

  return html

}

console.log("after")

$("#test").replaceWith(htmlBuilder())

console.log("end js")
