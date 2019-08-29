package fr.eni.encheres.restControlersAPI;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import fr.eni.encheres.bll.EncheresListBLL;
import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dto.EncheresAffichageDTO;

public class EncheresList {
	@Path("/encheres_liste")
	public class EncheresEdition {

		public EncheresEdition() {
			super();
		}

		@GET()
		@Produces(MediaType.APPLICATION_JSON)
		public ArrayList<EncheresAffichageDTO> affichageEncheres(EncheresAffichageDTO encheresAffichageDTO) {
			EncheresListBLL traitement = new EncheresListBLL();
			ArrayList<ArticleVendu> encheres = new ArrayList<ArticleVendu>(encheresAffichageDTO.getNo_)
			ArrayList<ArticleVendu> encheres = traitement.getAllArticle();
			System.out.println(encheres);
			return encheres;
		}
	}
}