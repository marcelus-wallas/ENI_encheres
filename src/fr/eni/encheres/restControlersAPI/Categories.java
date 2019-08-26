package fr.eni.encheres.restControlersAPI;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import fr.eni.encheres.bll.CategoriesBll;
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.dto.CategoriesDTO;

@Path("/categories")
public class Categories {

	public Categories() {
		super();
	}

	@GET()
	@Produces(MediaType.APPLICATION_JSON)
	public List<CategoriesDTO> categories(@Context Request request) {
		CategoriesBll traitement = new CategoriesBll();
		List<Categorie> categories = traitement.getAll();
		List<CategoriesDTO> categoriesDTO = new ArrayList<>();
		// transformation BO en DTO (façon manuelle)
		for (Categorie categorie : categories) {
			categoriesDTO.add(new CategoriesDTO(categorie.getNo_categorie(), categorie.getLibelle()));
		}
		return categoriesDTO;
	}
}