package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;

public class EncheresAffichageBLL {

	private IarticleVendu ArticleVenduDAL;

	public EncheresAffichageBLL() {
		this.ArticleVenduDAL = Factory.getArticleVendu();
	}

	public ArticleVendu tryToView(ArticleVendu article) {
		ArticleVendu articleAfficher = ArticleVenduDAL.readArticle(article.getNo_article());
		return articleAfficher;
	}

}
