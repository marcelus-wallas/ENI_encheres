

var jsonEnchereArrayTest = [
  {
    "no_article": "id1",
    "imgPath": "../testDev/img/chat.jpeg",
    "nom_article": "PC gamer pour travailler",
    "prix_vente": 210,
    "date_fin_encheres": "2018-08-10",
    "nom_article": "jojo44"
  },
  {
    "idEnchere": "id2",
    "imgPath": "../testDev/img/chat.jpeg",
    "article": "PC gamer pas pour travailler",
    "derniereEnchere": 1000,
    "dateFin": "2019-08-10",
    "vendeur": "jojo42"
  },
  {
    "idEnchere": "id3",
    "imgPath": "../testDev/img/chat.jpeg",
    "article": "fauteuil",
    "derniereEnchere": 350,
    "dateFin": "2018-08-01",
    "vendeur": "Wolf"
  },
  {
    "idEnchere": "id4",
    "imgPath": "../testDev/img/chat.jpeg",
    "article": "Chat egyptien",
    "derniereEnchere": 1,
    "dateFin": "2018-10-10",
    "vendeur": "Tristan"
  }
  ,
  {
    "idEnchere": "id5",
    "imgPath": "../testDev/img/chat.jpeg",
    "article": "autre chat egyptien",
    "derniereEnchere": 2,
    "dateFin": "2018-08-08",
    "vendeur": "Maxime"
  }
]

function main() {
	$.get("/ENI_encheres/rest/categories", function(arrayCategories, status){
		accueilSetUpHtml(jsonEnchereArrayTest, arrayCategories.categoriesDTO)
	})
}

main()
