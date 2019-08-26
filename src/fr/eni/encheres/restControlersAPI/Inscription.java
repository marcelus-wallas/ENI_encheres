package fr.eni.encheres.restControlersAPI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String mp= inscriptionDTO.getMot_de_passe();
		String confirmation = inscriptionDTO.getConfirmation().toString();
		
		
		if(mp.equals(confirmation) == false)
		{
			//Mot de passe != Confirmation
			etat = "Password KO";
			System.out.println(etat);
			response =  Response.status(Status.BAD_REQUEST).build();
		}

		 Utilisateur verifEmail = connexionBdd.verificationEmail(temp.getEmail());
		 
		 if(verifEmail.getNom() != null)
		 {
			 //Pseudo existant
			 etat = "Email KO";
			 System.out.println(etat);
			 response = Response.status(Status.CONFLICT).build();
		 }
			
		 Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); 
		 Matcher matcher = pattern.matcher(temp.getPseudo());
		 if(matcher.matches() == false)
		 {
			//Email existant
			 etat = "Caractères Pseudo KO";
			 System.out.println(etat);
			 response = Response.status(Status.BAD_REQUEST).build();
		 } 
		 
		Utilisateur verifPseudo = connexionBdd.verificationPseudo(temp.getPseudo()); 
		 if(verifPseudo.getNom() != null)
		 {
			 //Email existant
			 etat = "Pseudo KO";
			 System.out.println(etat);
			 response = Response.status(Status.CONFLICT).build();
		 }
			 
		 if(verifEmail.getNom() == null && verifPseudo.getNom() == null && matcher.matches() == true)
		 {
			 //Création de l'utilisateur
			 etat = "Création OK";
			 System.out.println(etat);
			 connexionBdd.create(temp);	
			 response =  Response.ok().build();
		 }
		 
		 
		 return response;
		
	}		
}
