package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dal.Iretrait;
import fr.eni.encheres.dal.Iutilisateur;

public class EncheresCreationBLL {

	private IarticleVendu articleVenduDAL;
	private Iretrait retraitDAL;
	private Iutilisateur utilisateurDAL;

	public EncheresCreationBLL() {
		this.articleVenduDAL = Factory.getArticleVendu();
		this.retraitDAL = Factory.getRetrait();
		this.utilisateurDAL = Factory.getUtilisateur();
	}

	public ArticleVendu newArticle(ArticleVendu i) {
		return articleVenduDAL.create(i);
	}

	public void newRetrait(Retrait retrait, Utilisateur utilisateur) {

		Retrait retraitTemp = null;
		if (retrait.getRue() == null || retrait.getCode_postal() == null || retrait.getVille() == null) {
			Utilisateur user = utilisateurDAL.readUser(utilisateur.getNo_utilisateur());
			retraitTemp = new Retrait(retrait.getNo_article(), user.getRue(), user.getCode_postal(), user.getVille());
			System.out.println("nom" + retraitTemp);
		} else {
			retraitTemp = new Retrait(retrait.getNo_article(), retrait.getRue(), retrait.getCode_postal(),
					retrait.getVille());
		}
		this.retraitDAL.create(retraitTemp);
	}

}
