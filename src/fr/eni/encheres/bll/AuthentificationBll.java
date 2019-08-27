package fr.eni.encheres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

public class AuthentificationBll {
	private Iutilisateur utilisateurDAL;

	public AuthentificationBll(){
		this.utilisateurDAL = Factory.getUtilisateur();
	}
	
	public Utilisateur tryToAuth(Utilisateur userAuth)
	{
		System.out.println("userAuth: "+userAuth);
		if(userAuth.getEmail() != null)
		{
			//email
			Utilisateur user = utilisateurDAL.authentificationEmail(userAuth.getEmail(), userAuth.getMot_de_passe());
			return user;
			
		}else {
			//pseudo
			Utilisateur user = utilisateurDAL.authentificationPseudo(userAuth.getPseudo(), userAuth.getMot_de_passe());
			return user;
		}
	}
}
