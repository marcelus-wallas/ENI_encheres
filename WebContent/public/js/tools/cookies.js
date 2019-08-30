//Créer un cookie name: nom du cookie, value: valeur du cookie, days: durée de validité du cookie
function createCookie(name,value,days) {
	if (days) {
		var date = new Date();
		date.setTime(date.getTime()+(days*24*60*60*1000))
		var expires = "; expires="+date.toGMTString();
	}
	else var expires = "";
	document.cookie = name+"="+value+expires+"; path=/"
}

//Lire un cookie
function readCookie(name) {
	var nameEQ = name + "=";
	var ca = document.cookie.split(';')
	for(var i=0;i < ca.length;i++) {
		var c = ca[i];
		while (c.charAt(0)==' ') c = c.substring(1,c.length);
		if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length)
	}
	return null;
}
 //Supprimer un cookie
function eraseCookie(name) {
	createCookie(name,"",-1)
}


function deconnexion()
{
	createCookie('IdUser',"",-1);
	window.location.replace("WebContent/index.html")
}
