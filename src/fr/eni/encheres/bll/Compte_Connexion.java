package fr.eni.encheres.bll;

import java.io.IOException;
import java.util.ArrayList;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

/**
 * Servlet implementation class Compte_Connexion
 */
@WebServlet("/Compte_Connexion")
public class Compte_Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */	
	private Iutilisateur connexionBdd;

	public Compte_Connexion(){
		this.connexionBdd = Factory.getUtilisateur();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Gson gson = new Gson();
		boolean connexion = false;

		//JSON de test
		JsonObject tentativeConnexion = Json.createObjectBuilder()
				.add("login", "MiaMiam")
				.add("mot_de_passe", "password")
				.build();

		String login = tentativeConnexion.getJsonObject("login").values().toString();
		String motDePasse = tentativeConnexion.getJsonObject("mot_de_passe").values().toString();

		//Renvoit true si le login est un email et false si c'est un pseudo
		boolean typeLogin = tentativeConnexion.getJsonObject("login").values().contains("@");

		if(typeLogin)
		{
			//email
			Utilisateur user = connexionBdd.authentificationEmail(login, motDePasse);	

			if(user != null)
			{
				connexion = true;
			}

		}else {
			//pseudo
			Utilisateur user = connexionBdd.authentificationPseudo(login, motDePasse);	

			if(user != null)
			{
				connexion = true;
			}
		}
		System.out.println(connexion);
		//String connexionJsonString = new Gson().toJson(connexion);
		//doGet(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
