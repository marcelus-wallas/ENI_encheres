package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.eni.encheres.bll.Encheres_creationBLL;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Enchere;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dto.Encheres_creationDTO;

@Path("/encheres_creation")
public class Encheres_creation {

	public Encheres_creation() {
		super();
	}

	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void encheres_creation(Encheres_creationDTO encheres_creationDTO) {
		ArticleVendu article_vendu = new ArticleVendu();
		Enchere enchere = new Enchere();
		Utilisateur utilisateur = new Utilisateur();
		Retrait retrait = new Retrait();
		// transformation BO en DTO (façon manuelle)
		Encheres_creationBLL traitement = new Encheres_creationBLL();

		utilisateur.setNo_utilisateur(encheres_creationDTO.getNo_utilisateur());
		enchere.setNo_utilisateur(encheres_creationDTO.getNo_utilisateur());
		enchere.setDate_enchere(encheres_creationDTO.getDate_debut_encheres());
		//articles vendus
		article_vendu.setNo_utilisateur(encheres_creationDTO.getNo_utilisateur());
		article_vendu.setNom_article(encheres_creationDTO.getNom_article());
		article_vendu.setDescription(encheres_creationDTO.getDescription());
		article_vendu.setNo_categorie(encheres_creationDTO.getNo_categorie());
		article_vendu.setPrix_initial(encheres_creationDTO.getPrix_initial());
		article_vendu.setDate_debut_encheres(encheres_creationDTO.getDate_debut_encheres());
		article_vendu.setDate_fin_encheres(encheres_creationDTO.getDate_fin_encheres());
		ArticleVendu article = traitement.newArticle(article_vendu);
		int idArticle = article.getNo_article();
		System.out.println(idArticle);
		// lieu de retrait		
		retrait.setNo_article(idArticle);
		retrait.setRue(encheres_creationDTO.getRue());
		retrait.setCode_postal(encheres_creationDTO.getCode_postal());
		retrait.setVille(encheres_creationDTO.getVille());		
		traitement.newRetrait(retrait);

		
		System.out.println(article_vendu);
		System.out.println(enchere);
		System.out.println(utilisateur);
		System.out.println(retrait);
	}
}