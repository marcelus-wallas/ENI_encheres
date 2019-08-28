package fr.eni.encheres.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

public class InscriptionBll {

	private Iutilisateur utilisateurDAL;

	public InscriptionBll(){
		this.utilisateurDAL = Factory.getUtilisateur();
	}
	
	public Utilisateur tryToInscription(Utilisateur user, String confirmation)
	{
	
		Utilisateur temp = new Utilisateur(user.getPseudo(),
											user.getNom(),
											user.getPrenom(),
											user.getEmail(),
											user.getTelephone(),
											user.getRue(),
											user.getCode_postal(),
											user.getVille(),
											user.getMot_de_passe(),
											200,
											false);
		
		String mp= user.getMot_de_passe();
				
		if(mp.equals(confirmation) == false)
		{
			//Mot de passe != Confirmation
			return null;
		}

		 Utilisateur verifEmail = utilisateurDAL.verificationEmail(temp.getEmail());
		 
		 if(verifEmail.getNom() != null)
		 {
			 //Pseudo existant
			 return null;
		 }
			
		 Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); 
		 Matcher matcher = pattern.matcher(temp.getPseudo());
		 if(matcher.matches() == false)
		 {
			//Pseudo caractères incorrects
			 return null;
		 } 
		 
		Utilisateur verifPseudo = utilisateurDAL.verificationPseudo(temp.getPseudo()); 
		 if(verifPseudo.getNom() != null)
		 {
			 //Email existant
			 return null;
		 }
			 
		 if(verifEmail.getNom() == null && verifPseudo.getNom() == null && matcher.matches() == true)
		 {
			 //Création de l'utilisateur
			 utilisateurDAL.create(temp);	
			 return user;
		 }
		return user;
		
	}
}
