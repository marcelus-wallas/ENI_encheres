package fr.eni.encheres.bll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.bo.MessageErreur;
import fr.eni.encheres.bo.Pair;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Iutilisateur;

public class InscriptionBll {

	private Iutilisateur utilisateurDAL;

	public InscriptionBll(){
		this.utilisateurDAL = Factory.getUtilisateur();
	}
	
	public Pair<Utilisateur, MessageErreur> tryToInscription(Utilisateur user, String confirmation)
	{
		MessageErreur messageErreur = new MessageErreur();

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
		
		Pair<Utilisateur, MessageErreur> result = new Pair<Utilisateur, MessageErreur>();
		result.first = user;
		result.second = messageErreur;
		
		String mp= user.getMot_de_passe();
				
		if(mp.equals(confirmation) == false)
		{
			//Mot de passe != Confirmation
			messageErreur.setMesssage_erreur("Votre Confirmation est différente de votre mot de passe.");
			user = null;
		}

		 Utilisateur verifEmail = utilisateurDAL.verificationEmail(temp.getEmail());
		 
		 if(verifEmail.getNom() != null)
		 {
			 //Email existant
			 messageErreur.setMesssage_erreur("Email déja existant.");
			 user = null;
		 }
			
		 Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); 
		 Matcher matcher = pattern.matcher(temp.getPseudo());
		 if(matcher.matches() == false)
		 {
			//Pseudo caractères incorrects
			 messageErreur.setMesssage_erreur("Le Pseudo ne doit contenir que des caractères alphanumériques");
			 user = null;
		 } 
		 
		Utilisateur verifPseudo = utilisateurDAL.verificationPseudo(temp.getPseudo()); 
		 if(verifPseudo.getNom() != null)
		 {
			 //Pseudo existant
			 messageErreur.setMesssage_erreur("Pseudo déja existant.");
			 user = null;
		 }
			 
		 if(verifEmail.getNom() == null && verifPseudo.getNom() == null && matcher.matches() == true)
		 {
			 //Création de l'utilisateur 	
			 messageErreur.setMesssage_erreur("Inscription OK");
			 user = utilisateurDAL.create(temp);
		 }
		
		 return result;
		
	}
}
