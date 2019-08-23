package fr.eni.encheres.restControlersAPI;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;
import fr.eni.encheres.dto.AuthentificationDTO;

@Path("/authentification")
public class Authentification {

	private Iutilisateur connexionBdd;

	public Authentification(){
		this.connexionBdd = Factory.getUtilisateur();
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authentification(AuthentificationDTO authentificationDTO) {
		System.out.println(authentificationDTO);
		
		boolean connexion = false;
		String etat;
		
		if(authentificationDTO.getEmail() != null)
		{
			//email
			Utilisateur user = connexionBdd.authentificationEmail(authentificationDTO.getEmail(), authentificationDTO.getmot_de_passe());	

//			System.out.println("######EMAIL######"+authentificationDTO.getEmail());
//			System.out.println("######MP######"+authentificationDTO.getmot_de_passe());
//			System.out.println("######Utilisateur######"+user);
			
			if(user.getNom() != null)
			{
				etat = "Email OK";
				System.out.println(etat);
				connexion = true;
				return Response.ok().build();
			}else {
				etat = "Email KO";
				System.out.println(etat);
				connexion = false;
				return Response.status(Status.BAD_REQUEST).build();
			}

		}else {
			//pseudo
			Utilisateur user = connexionBdd.authentificationPseudo(authentificationDTO.getPseudo(), authentificationDTO.getmot_de_passe());	

//			System.out.println("######PSEUDO######"+authentificationDTO.getPseudo());
//			System.out.println("######MP######"+authentificationDTO.getmot_de_passe());
//			System.out.println("######Utilisateur######"+user);
			
			if(user.getNom() != null)
			{
				etat = "Pseudo OK";
				System.out.println(etat);
				connexion = true;
				return Response.ok().build();
			}else {
				etat = "Pseudo KO";
				System.out.println(etat);
				connexion = false;
				return Response.status(Status.BAD_REQUEST).build();
			}
		}
			
	}
	
}
