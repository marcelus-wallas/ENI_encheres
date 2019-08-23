package fr.eni.encheres.restControlersAPI;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

import fr.eni.encheres.dto.InscriptionDTO;

@Path("/inscription")
public class Inscription {

	private Iutilisateur connexionBdd;

	public Inscription(){
		this.connexionBdd = Factory.getUtilisateur();
	}
	
	String etat;
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inscription(InscriptionDTO inscriptionDTO) {
		
		Response response = null;
		
		Utilisateur temp = new Utilisateur(inscriptionDTO.getPseudo(),
											inscriptionDTO.getNom(),
											inscriptionDTO.getPrenom(),
											inscriptionDTO.getEmail(),
											inscriptionDTO.getTelephone(),
											inscriptionDTO.getRue(),
											inscriptionDTO.getCode_postal(),
											inscriptionDTO.getVille(),
											inscriptionDTO.getMot_de_passe(),
											200,
											false);
//		if(temp.getMot_de_passe() != inscriptionDTO.getConfirmation())
//		{
//			//Mot de passe != Confirmation
//			etat = "Password KO";
//			System.out.println(etat);
//			return Response.status(Status.BAD_REQUEST).build();
//		}
		
		 ArrayList<Utilisateur> listeUtilisateurs = connexionBdd.read();
		 for(Utilisateur user : listeUtilisateurs)
		 {
			 if(user.getPseudo() == temp.getPseudo())
			 {
				 //Pseudo existant
				 etat = "Pseudo KO";
				 System.out.println(etat);
				 response = Response.status(Status.CONFLICT).build();
			 }
			 if(user.getEmail() == temp.getEmail())
			 {
				 //Email existant
				 etat = "Email KO";
				 System.out.println(etat);
				 response = Response.status(Status.CONFLICT).build();
			 }
			 if(user.getPseudo() != temp.getPseudo() && user.getEmail() != temp.getEmail())
			 {
				 //Création de l'utilisateur
				 etat = "Création OK";
				 System.out.println(etat);
				 connexionBdd.create(temp);	
				 response =  Response.ok().build();
			 }
		 }
		 
		 return response;
		
	}		
}
