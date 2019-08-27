package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

public class AffichageProfilBll {

	private Iutilisateur UtilisateurDAL;
	
	public AffichageProfilBll(){
		this.UtilisateurDAL = Factory.getUtilisateur();
	}
	
	public Utilisateur tryToView(Utilisateur user)
	{	
		Utilisateur userAfficher =UtilisateurDAL.readUser(user.getNo_utilisateur());
		return userAfficher;
	}
	
}
