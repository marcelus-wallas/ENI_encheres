package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Utilisateur;

public interface IarticleVendu {

	public ArticleVendu create(ArticleVendu article_vendu);

	public ArrayList<ArticleVendu> read();

	public void update(ArticleVendu article_vendu);

	public void delete(ArticleVendu article_vendu);
	
	public void deleteAllByUserId(Utilisateur user);

	public ArticleVendu readArticle(int no_article);

}
