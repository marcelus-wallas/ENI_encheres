package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dal.Iretrait;

public class Encheres_creationBLL {

	private IarticleVendu articleVenduDAL;
	private Iretrait retraitDAL;

	public Encheres_creationBLL() {
		this.articleVenduDAL = Factory.getArticleVendu();
		this.retraitDAL = Factory.getRetrait();
	}

	public ArticleVendu newArticle(ArticleVendu i) {
		return articleVenduDAL.create(i);
	}

	public void newRetrait(Retrait retrait) {
		this.retraitDAL.create(retrait);
	}
}
