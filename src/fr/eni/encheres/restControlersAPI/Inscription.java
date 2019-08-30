package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.ClientResponse.Status;

import fr.eni.encheres.bll.InscriptionBll;
import fr.eni.encheres.bo.Utilisateur;

import fr.eni.encheres.dto.UtilisateurDTO;
import fr.eni.encheres.dto.MessageErreurDTO;

@Path("/inscription")
public class Inscription {

	public Inscription(){
		super();
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inscription(UtilisateurDTO utilisateurDTO) {
		System.out.println("utilisateurDTO: "+utilisateurDTO.toString());
		InscriptionBll traitement = new InscriptionBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		
		MessageErreurDTO err = new MessageErreurDTO();
		Response response = null;
		int resultatBLL =traitement.tryToInscription(dtoToBo, utilisateurDTO.getConfirmation());
		switch (resultatBLL){
			case -1: err.setMessage_erreur("Votre Confirmation est différente de votre mot de passe.");
				response = Response.status(Status.NOT_ACCEPTABLE).entity(inscriptionEchec(err)).build();
				break;
			case -2: err.setMessage_erreur("Email déja existant.");
				response = Response.status(Status.NOT_ACCEPTABLE).entity(inscriptionEchec(err)).build();
				break;
			case -3: err.setMessage_erreur("Le Pseudo ne doit contenir que des caractères alphanumériques");
				response = Response.status(Status.NOT_ACCEPTABLE).entity(inscriptionEchec(err)).build();
				break;
			case -4: err.setMessage_erreur("Pseudo déja existant.");
				response = Response.status(Status.NOT_ACCEPTABLE).entity(inscriptionEchec(err)).build();
				break;
			default: 
				response = Response.status(Status.ACCEPTED).entity(inscriptionSuccess(resultatBLL)).build();
				break;
		}
		System.out.println("response"+response);
		return response;
	}
	

	@Produces(MediaType.APPLICATION_JSON)
	private UtilisateurDTO inscriptionSuccess (int no_utilisateur) {
		UtilisateurDTO res = new UtilisateurDTO();
		res.setNo_utilisateur(no_utilisateur);
		return res;
	}
	
	@Produces(MediaType.APPLICATION_JSON)
	private MessageErreurDTO inscriptionEchec (MessageErreurDTO err) {
		System.out.println("err"+err.getMessage_erreur());
		return err;
	}
}
