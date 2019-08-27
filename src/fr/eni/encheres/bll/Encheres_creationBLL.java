package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;

public class Encheres_creationBLL {

	private static IarticleVendu articleVenduDAL;

	public Encheres_creationBLL() {
		this.articleVenduDAL = Factory.getArticleVendu();
	}

	public void newArticle(ArticleVendu article) {
		articleVenduDAL.create(article);
	}
}
