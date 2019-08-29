package fr.eni.encheres.bll;

import java.util.ArrayList;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;

public class EncheresListBLL {

	private static IarticleVendu articleVenduDAL;

	public EncheresListBLL() {
		EncheresListBLL.articleVenduDAL = Factory.getArticleVendu();
	}

	public ArrayList<ArticleVendu> getAllArticle() {
		return articleVenduDAL.read();
	}
}
