package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.IarticleVendu;
import fr.eni.encheres.dal.Ienchere;
import fr.eni.encheres.dal.Iretrait;
import fr.eni.encheres.dal.Iutilisateur;

public class SuppressionProfilBll {

	private Iutilisateur utilisateurDAL;
	private Ienchere enchereDAL;
	private IarticleVendu articleVenduDAL;
	private Iretrait retraitDAL;

	public SuppressionProfilBll(){
		this.utilisateurDAL = Factory.getUtilisateur();
		this.enchereDAL = Factory.getEnchere();
		this.articleVenduDAL = Factory.getArticleVendu();
		this.retraitDAL = Factory.getRetrait();
	}
	
	public void tryToSuppression(Utilisateur user)
	{
		enchereDAL.deleteAllByUserId(user);
		retraitDAL.deleteAllByUserId(user);
		articleVenduDAL.deleteAllByUserId(user);
		utilisateurDAL.delete(user);	
	}
}
