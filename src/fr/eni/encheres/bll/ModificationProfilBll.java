package fr.eni.encheres.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

public class ModificationProfilBll {

	private Iutilisateur UtilisateurDAL;

	public ModificationProfilBll(){
		this.UtilisateurDAL = Factory.getUtilisateur();
	}

	public Utilisateur tryToUpdate(Utilisateur user, String motDePassseActuel, String nouveauMotDePasse, String confirmation)
	{
		Utilisateur temp= null;

		if(nouveauMotDePasse != null)
		{
			if(nouveauMotDePasse.equals(confirmation) == true)
			{
				temp = new Utilisateur (user.getNo_utilisateur(),
						user.getPseudo(),
						user.getNom(),
						user.getPrenom(),
						user.getEmail(),
						user.getTelephone(),
						user.getRue(),
						user.getCode_postal(),
						user.getVille(),
						nouveauMotDePasse,
						user.getCredit(),
						false);
			}else {
				//Nouveau_mot_de_passe != confirmation
				return  null;
			}

		}else {
			temp = new Utilisateur (user.getNo_utilisateur(),
					user.getPseudo(),
					user.getNom(),
					user.getPrenom(),
					user.getEmail(),
					user.getTelephone(),
					user.getRue(),
					user.getCode_postal(),
					user.getVille(),
					motDePassseActuel,
					user.getCredit(),
					false);
		}

		Utilisateur verifEmail = UtilisateurDAL.verificationEmailModif(temp.getEmail(), user.getNo_utilisateur());

		if(verifEmail.getNom() != null)
		{
			//Pseudo existant
			return null;
		}

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); 
		Matcher matcher = pattern.matcher(temp.getPseudo());
		if(matcher.matches() == false)
		{
			//Caractère incorrect Pseudo
			return null;
		} 

		Utilisateur verifPseudo = UtilisateurDAL.verificationPseudoModif(temp.getPseudo(), user.getNo_utilisateur()); 
		if(verifPseudo.getNom() != null)
		{
			//Email existant
			return null;
		}

		if(verifEmail.getNom() == null && verifPseudo.getNom() == null && matcher.matches() == true)
		{
			//Modification de l'utilisateur
			UtilisateurDAL.modificationProfil(temp);	
			return user;
		}

		return null;
	}

}
