package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dal.Iretrait;
import fr.eni.encheres.dal.Iutilisateur;

public class EncheresAffichageBLL {

	private IarticleVendu articleVenduDAL;
	private Iutilisateur utilisateurDAL;
	private Iretrait retraitDAL;

	public EncheresAffichageBLL() {
		this.articleVenduDAL = Factory.getArticleVendu();
		this.utilisateurDAL = Factory.getUtilisateur();
		this.retraitDAL = Factory.getRetrait();
	}

	public ArticleVendu tryToView(ArticleVendu article) {
		ArticleVendu articleAfficher = articleVenduDAL.readArticle(article.getNo_article());
		return articleAfficher;
	}

	public ArticleVendu updateArticle(ArticleVendu temp) {
		articleVenduDAL.update(temp);
		return temp;
	}

	public void updateRetrait(Retrait retrait, Utilisateur utilisateur) {

		Retrait retraitTemp = null;
		if (retrait.getRue() == null || retrait.getCode_postal() == null || retrait.getVille() == null) {
			Utilisateur user = utilisateurDAL.readUser(utilisateur.getNo_utilisateur());
			retraitTemp = new Retrait(retrait.getNo_article(), user.getRue(), user.getCode_postal(), user.getVille());
			System.out.println("nom" + retraitTemp);
		} else {
			retraitTemp = new Retrait(retrait.getNo_article(), retrait.getRue(), retrait.getCode_postal(),
					retrait.getVille());
		}
		this.retraitDAL.update(retraitTemp);
	}

}
