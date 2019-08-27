package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.SuppressionProfilBll;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.UtilisateurDTO;

@Path("/supprimer_profil")
public class SuppressionProfil {

	public SuppressionProfil(){
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void suppression(UtilisateurDTO utilisateurDTO) {
		SuppressionProfilBll traitement = new SuppressionProfilBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		traitement.tryToSuppression(dtoToBo);
	}	
}
