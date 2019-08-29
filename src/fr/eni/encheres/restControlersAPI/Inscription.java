package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.eni.encheres.bll.InscriptionBll;
import fr.eni.encheres.bo.MessageErreur;
import fr.eni.encheres.bo.Pair;
import fr.eni.encheres.bo.Utilisateur;

import fr.eni.encheres.dto.UtilisateurDTO;
import fr.eni.encheres.dto.messageErreurDTO;

@Path("/inscription")
public class Inscription {

	public Inscription(){
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Pair<UtilisateurDTO, messageErreurDTO> inscription(UtilisateurDTO utilisateurDTO) {
		InscriptionBll traitement = new InscriptionBll();
		System.out.println("utilisateurDTO"+utilisateurDTO);
		Utilisateur dtoToBo = new Utilisateur(utilisateurDTO.getNo_utilisateur(), utilisateurDTO.getPseudo(), utilisateurDTO.getNom(), utilisateurDTO.getPrenom(), utilisateurDTO.getEmail(), utilisateurDTO.getTelephone(),
				utilisateurDTO.getRue(), utilisateurDTO.getCode_postal(), utilisateurDTO.getVille(), utilisateurDTO.getMot_de_passe());
		Pair<Utilisateur, MessageErreur> response = traitement.tryToInscription(dtoToBo, utilisateurDTO.getConfirmation());
		System.out.println("dtoToBo"+dtoToBo);
		System.out.println("response"+response);
			UtilisateurDTO connectedUser = new UtilisateurDTO(response.first.getNo_utilisateur(), response.first.getPseudo(), response.first.getNom(), response.first.getPrenom(), response.first.getEmail(), response.first.getTelephone(),
					response.first.getRue(), response.first.getCode_postal(), response.first.getVille(), response.first.getMot_de_passe(), response.first.getCredit(), response.first.isAdministrateur());
	
			messageErreurDTO error = new messageErreurDTO(response.second.getMesssage_erreur());
			System.out.println("connectedUser"+connectedUser);
			System.out.println("error"+error);
			Pair<UtilisateurDTO, messageErreurDTO> responseDTO = new Pair<UtilisateurDTO, messageErreurDTO>();
			responseDTO.first = connectedUser;
			responseDTO.second = error;
			System.out.println(responseDTO);
			return responseDTO;
	}		
}
