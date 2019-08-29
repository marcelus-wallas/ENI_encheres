package fr.eni.encheres.restControlersAPI;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.AuthentificationBll;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.UtilisateurDTO;

@Path("/authentification")
public class Authentification {
	public Authentification(){
		super();
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UtilisateurDTO authentification(UtilisateurDTO utilisateurDTO) {	
		AuthentificationBll traitement = new AuthentificationBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getPseudo(), utilisateurDTO.getEmail(), utilisateurDTO.getMot_de_passe());
		Utilisateur connectedUser = traitement.tryToAuth(dtoToBo);
		UtilisateurDTO res = new UtilisateurDTO(connectedUser.getNo_utilisateur(), connectedUser.getPseudo(), connectedUser.getNom(), connectedUser.getPrenom(), connectedUser.getEmail(), connectedUser.getTelephone(),
				connectedUser.getRue(), connectedUser.getCode_postal(), connectedUser.getVille(), connectedUser.getMot_de_passe(), connectedUser.getCredit(), connectedUser.isAdministrateur());
		return res;
	}
	
}
