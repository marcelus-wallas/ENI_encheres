package fr.eni.encheres.restControlersAPI;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.eni.encheres.bll.EncheresListBLL;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dto.EncheresListDTO;

public class EncheresList {
	@Path("/encheres_liste")
	public class EncheresEdition {

		public EncheresEdition() {
			super();
		}

		@GET()
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<EncheresListDTO> listEncheres() {
			EncheresListBLL traitement = new EncheresListBLL();
			ArrayList<ArticleVendu> articles = traitement.getAllArticle();
			ArrayList<EncheresListDTO> encheresListDTO = new ArrayList<>();
			// transformation BO en DTO (façon manuelle)
			for (ArticleVendu article : articles) {
				encheresListDTO.add(new EncheresListDTO(article.getNo_utilisateur(), article.getNom_article(),
						article.getPrix_vente(), article.getDate_fin_encheres()));
				System.out.println(article);
			}
			System.out.println(articles);
			System.out.println(encheresListDTO);
			return encheresListDTO;
		}
	}

}