package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Utilisateur;

public interface Iutilisateur {

	public Utilisateur create(Utilisateur utilisateur);

	public ArrayList<Utilisateur> read();

	public void update(Utilisateur utilisateur);

	public void delete(Utilisateur utilisateur);

	public Utilisateur authentificationEmail(String login, String motDePasse);

	public Utilisateur authentificationPseudo(String login, String motDePasse);
	
	public Utilisateur verificationEmail(String email);
	
	public Utilisateur verificationPseudo(String pseudo);
	
	public void modificationProfil(Utilisateur utilisateur);
	
	public Utilisateur verificationEmailModif(String email, int no_utilisateur);
	
	public Utilisateur verificationPseudoModif(String pseudo, int no_utilisateur);
	
	public Utilisateur readUser(int no_utilisateur);
}
