package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Utilisateur;

public interface Iutilisateur {

	public void create(Utilisateur utilisateur);

	public ArrayList<Utilisateur> read();

	public void update(Utilisateur utilisateur);

	public void delete(Utilisateur utilisateur);

	public Utilisateur authentificationEmail(String login, String motDePasse);

	public Utilisateur authentificationPseudo(String login, String motDePasse);
	
}
