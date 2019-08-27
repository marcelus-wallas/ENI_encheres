package fr.eni.encheres.bll;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dal.Iretrait;
import fr.eni.encheres.dal.Iutilisateur;

public class Encheres_creationBLL {

	private IarticleVendu articleVenduDAL;
	private Iretrait retraitDAL;
	private Iutilisateur utilisateurDAL;

	public Encheres_creationBLL() {
		this.articleVenduDAL = Factory.getArticleVendu();
		this.retraitDAL = Factory.getRetrait();
		this.utilisateurDAL =  Factory.getUtilisateur();
	}

	
	
	public ArticleVendu newArticle(ArticleVendu i) {
		return articleVenduDAL.create(i);
	}

	public void newRetrait(Retrait retrait, Utilisateur utilisateur) {
		/*Retrait retraitTemp = null;
		if (retrait.getRue() == null ) {
			
			utilisateurDAL.readUser(utilisateur.getNo_utilisateur());
			retraitTemp = new Retrait(utilisateur.getRue(), utilisateur.getCode_postal(), utilisateur.getVille());
		} else {
			retraitTemp = new Retrait(retrait.getRue(), retrait.getCode_postal(), retrait.getVille());
		}
		this.retraitDAL.create(retraitTemp);
		*/
		this.retraitDAL.create(retrait);
	}	
}
