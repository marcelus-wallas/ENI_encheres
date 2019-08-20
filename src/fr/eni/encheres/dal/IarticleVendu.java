package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.ArticleVendu;

public interface IarticleVendu {

	public void create(ArticleVendu article_vendu);
	public ArrayList<ArticleVendu> read();
	public void update(ArticleVendu article_vendu);
	public void delete(ArticleVendu article_vendu);

	
}
