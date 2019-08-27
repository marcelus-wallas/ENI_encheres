package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.ModificationProfilBll;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.UtilisateurDTO;

@Path("/modifier_profil")
public class ModificationProfil {

	public ModificationProfil(){
		super();
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	public UtilisateurDTO modificationProfil(UtilisateurDTO utilisateurDTO) {
		ModificationProfilBll traitement = new ModificationProfilBll();
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		Utilisateur connectedUser = traitement.tryToUpdate(dtoToBo, utilisateurDTO.getMot_de_passe_actuel(), utilisateurDTO.getNouveau_mot_de_passe(), utilisateurDTO.getConfirmation());
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
