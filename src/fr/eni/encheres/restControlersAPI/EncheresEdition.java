package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.eni.encheres.bll.EncheresAffichageBLL;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Enchere;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.EncheresAffichageDTO;

@Path("/encheres_edition")
public class EncheresEdition {

	public EncheresEdition() {
		super();
	}

	@GET()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EncheresAffichageDTO affichageEncheres(EncheresAffichageDTO encheresAffichageDTO) {
		EncheresAffichageBLL traitement = new EncheresAffichageBLL();
		ArticleVendu dtoToBo = new ArticleVendu(encheresAffichageDTO.getNo_article(),
				encheresAffichageDTO.getNom_article(), encheresAffichageDTO.getDescription(),
				encheresAffichageDTO.getNo_categorie(), encheresAffichageDTO.getPrix_initial(),
				encheresAffichageDTO.getDate_debut_encheres(), encheresAffichageDTO.getDate_fin_encheres());
		ArticleVendu articleDetail = traitement.tryToView(dtoToBo);

		if (articleDetail != null) {
			EncheresAffichageDTO res = new EncheresAffichageDTO(articleDetail.getNom_article(),
					articleDetail.getDescription(), articleDetail.getNo_categorie(), articleDetail.getPrix_initial(),
					articleDetail.getDate_debut_encheres(), articleDetail.getDate_fin_encheres());
			return res;
		} else {
			return null;
		}
	}

	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void encheres_creation(EncheresAffichageDTO encheresAffichageDTO) {
		ArticleVendu article_vendu = new ArticleVendu();
		Enchere enchere = new Enchere();
		Utilisateur utilisateur = new Utilisateur();
		Retrait retrait = new Retrait();
		// transformation BO en DTO (façon manuelle)
		EncheresAffichageBLL traitement = new EncheresAffichageBLL();

		utilisateur.setNo_utilisateur(encheresAffichageDTO.getNo_utilisateur());
		enchere.setNo_utilisateur(encheresAffichageDTO.getNo_utilisateur());
		enchere.setDate_enchere(encheresAffichageDTO.getDate_debut_encheres());

		// articles vendus
		article_vendu.setNo_article(encheresAffichageDTO.getNo_article());
		article_vendu.setNo_utilisateur(encheresAffichageDTO.getNo_utilisateur());
		article_vendu.setNom_article(encheresAffichageDTO.getNom_article());
		article_vendu.setDescription(encheresAffichageDTO.getDescription());
		article_vendu.setNo_categorie(encheresAffichageDTO.getNo_categorie());
		article_vendu.setPrix_initial(encheresAffichageDTO.getPrix_initial());
		article_vendu.setDate_debut_encheres(encheresAffichageDTO.getDate_debut_encheres());
		article_vendu.setDate_fin_encheres(encheresAffichageDTO.getDate_fin_encheres());
		traitement.updateArticle(article_vendu);

		// lieu de retrait
		retrait.setNo_article(encheresAffichageDTO.getNo_article());
		retrait.setRue(encheresAffichageDTO.getRue());
		retrait.setCode_postal(encheresAffichageDTO.getCode_postal());
		retrait.setVille(encheresAffichageDTO.getVille());
		traitement.updateRetrait(retrait, utilisateur);

		System.out.println(article_vendu);
		System.out.println(enchere);
		System.out.println(utilisateur);
		System.out.println(retrait);
	}
}