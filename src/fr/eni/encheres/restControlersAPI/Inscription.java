package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.InscriptionBll;
import fr.eni.encheres.bo.Utilisateur;

import fr.eni.encheres.dto.UtilisateurDTO;

@Path("/inscription")
public class Inscription {

	public Inscription(){
	}
	
	String etat;
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UtilisateurDTO inscription(UtilisateurDTO utilisateurDTO) {
		InscriptionBll traitement = new InscriptionBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		Utilisateur connectedUser = traitement.tryToInscription(dtoToBo, utilisateurDTO.getConfirmation());
		if(connectedUser != null)
		{
			UtilisateurDTO res = new UtilisateurDTO(connectedUser.getNo_utilisateur(), connectedUser.getPseudo(), connectedUser.getNom(), connectedUser.getPrenom(), connectedUser.getEmail(), connectedUser.getTelephone(),
					connectedUser.getRue(), connectedUser.getCode_postal(), connectedUser.getVille(), connectedUser.getMot_de_passe(), connectedUser.getCredit(), connectedUser.isAdministrateur());
			return res;
		}else {
			return null;
		}
		
	}		
}
