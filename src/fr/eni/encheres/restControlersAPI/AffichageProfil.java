package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.AffichageProfilBll;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.UtilisateurDTO;

@Path("/afficher_profil")
public class AffichageProfil {

	public AffichageProfil(){
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UtilisateurDTO affichageProfil(UtilisateurDTO utilisateurDTO) {
		AffichageProfilBll traitement = new AffichageProfilBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		Utilisateur connectedUser = traitement.tryToView(dtoToBo);
		if(connectedUser != null)
		{
			UtilisateurDTO res = new UtilisateurDTO(connectedUser.getNo_utilisateur(), connectedUser.getPseudo(), connectedUser.getNom(), connectedUser.getPrenom(), connectedUser.getEmail(), connectedUser.getTelephone(),
					connectedUser.getRue(), connectedUser.getCode_postal(), connectedUser.getVille(), connectedUser.getMot_de_passe(), connectedUser.getCredit(), connectedUser.isAdministrateur());
			System.out.println(res);
			return res;
		}else {
			return null;
		}
	}
}
