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
import fr.eni.encheres.dto.ModificationProfilDTO;

@Path("/modifier_profil")
public class ModificationProfil {

	private Iutilisateur connexionBdd;

	public ModificationProfil(){
		this.connexionBdd = Factory.getUtilisateur();
	}
	
	String etat;
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificationProfil(ModificationProfilDTO modificationProfilDTO) {
		
		Response response = null; 
		Utilisateur modif= null;
		
		if(modificationProfilDTO.getNouveau_mot_de_passe() != null)
		{
			if(modificationProfilDTO.getNouveau_mot_de_passe().equals(modificationProfilDTO.getConfirmation()))
			{
				 modif = new Utilisateur (modificationProfilDTO.getNo_utilisateur(),
						 							modificationProfilDTO.getPseudo(),
													modificationProfilDTO.getNom(),
													modificationProfilDTO.getPrenom(),
													modificationProfilDTO.getEmail(),
													modificationProfilDTO.getTelephone(),
													modificationProfilDTO.getRue(),
													modificationProfilDTO.getCode_postal(),
													modificationProfilDTO.getVille(),
													modificationProfilDTO.getNouveau_mot_de_passe(),
													modificationProfilDTO.getCredit(),
													false);
			}else {
				//Nouveau_mot_de_passe != confirmation
				etat = "Password KO";
				System.out.println(etat);
				response =  Response.status(Status.BAD_REQUEST).build();			
			}
			
		}else {
			 modif = new Utilisateur (modificationProfilDTO.getNo_utilisateur(),
					 							modificationProfilDTO.getPseudo(),
												modificationProfilDTO.getNom(),
												modificationProfilDTO.getPrenom(),
												modificationProfilDTO.getEmail(),
												modificationProfilDTO.getTelephone(),
												modificationProfilDTO.getRue(),
												modificationProfilDTO.getCode_postal(),
												modificationProfilDTO.getVille(),
												modificationProfilDTO.getMot_de_passe_actuel(),
												modificationProfilDTO.getCredit(),
												false);
		}
		
		Utilisateur verifEmail = connexionBdd.verificationEmailModif(modif.getEmail(), modificationProfilDTO.getNo_utilisateur());
		 
		 if(verifEmail.getNom() != null)
		 {
			 //Pseudo existant
			 etat = "Email KO";
			 System.out.println(etat);
			 response = Response.status(Status.CONFLICT).build();
		 }
			
		 Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); 
		 Matcher matcher = pattern.matcher(modif.getPseudo());
		 if(matcher.matches() == false)
		 {
			//Email existant
			 etat = "Caractères Pseudo KO";
			 System.out.println(etat);
			 response = Response.status(Status.BAD_REQUEST).build();
		 } 
		 
		Utilisateur verifPseudo = connexionBdd.verificationPseudoModif(modif.getPseudo(), modificationProfilDTO.getNo_utilisateur()); 
		 if(verifPseudo.getNom() != null)
		 {
			 //Email existant
			 etat = "Pseudo KO";
			 System.out.println(etat);
			 response = Response.status(Status.CONFLICT).build();
		 }
			 
		 if(verifEmail.getNom() == null && verifPseudo.getNom() == null && matcher.matches() == true)
		 {
			 //Modification de l'utilisateur
			 etat = "Modification OK";
			 System.out.println(etat);
			 connexionBdd.modificationProfil(modif);	
			 response =  Response.ok().build();
		 }

		return response;
		
	}
}
