package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.eni.encheres.bll.EncheresAffichageBLL;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dto.EncheresAffichageDTO;

@Path("/encheres_affichage")
public class EncheresAffichage {

	public EncheresAffichage() {
		super();
	}

	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EncheresAffichageDTO affichageEncheres(EncheresAffichageDTO encheresAffichageDTO) {
		EncheresAffichageBLL traitement = new EncheresAffichageBLL();
		ArticleVendu dtoToBo = new ArticleVendu(encheresAffichageDTO.getNo_article(),
				encheresAffichageDTO.getNom_article(), encheresAffichageDTO.getDescription(),
				encheresAffichageDTO.getDate_fin_encheres(), encheresAffichageDTO.getPrix_vente(),
				encheresAffichageDTO.getPrix_initial(), encheresAffichageDTO.getNo_utilisateur(),
				encheresAffichageDTO.getNo_categorie());
		ArticleVendu articleDetail = traitement.tryToView(dtoToBo);

		if (articleDetail != null) {
			EncheresAffichageDTO res = new EncheresAffichageDTO(articleDetail.getNo_article(),
					articleDetail.getNom_article(), articleDetail.getDescription(),
					articleDetail.getDate_fin_encheres(), articleDetail.getPrix_vente(),
					articleDetail.getPrix_initial(), articleDetail.getNo_utilisateur(),
					articleDetail.getNo_categorie());
			return res;
		} else {
			return null;
		}
	}
}