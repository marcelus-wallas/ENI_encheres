package fr.eni.encheres.restControlersAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dto.Encheres_creationDTO;

@Path("/encheres_creation")
public class Encheres_creation {

	private IarticleVendu connexionBdd;

	public Encheres_creation(){
		this.connexionBdd = Factory.getArticleVendu();	
	}
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response encheres_creation(Encheres_creationDTO Encheres_creationDTO) {
		
		System.out.println(Encheres_creationDTO);
		System.out.println(Encheres_creationDTO.getNom_article());		
		
		ArticleVendu enchere = new ArticleVendu(Encheres_creationDTO.getNom_article(),
												Encheres_creationDTO.getDescription(),
												Encheres_creationDTO.getDate_debut_encheres(),
												Encheres_creationDTO.getDate_fin_encheres(),
												Encheres_creationDTO.getPrix_initial(),
												Encheres_creationDTO.getPrix_initial(),
												Encheres_creationDTO.getNo_utilisateur(),
												Encheres_creationDTO.getNo_categorie());	
		System.out.println(enchere);
		connexionBdd.create(enchere);	
		return Response.ok().build();
		
		
		//System.out.println(Encheres_creationDTO.getDate_fin_encheres().plusDays(30));
	}
	
}
