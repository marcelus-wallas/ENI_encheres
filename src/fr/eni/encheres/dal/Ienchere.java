package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Enchere;
import fr.eni.encheres.bo.Utilisateur;

public interface Ienchere {
	
	public void create(Enchere enchere);

	public ArrayList<Enchere> read();

	public void update(Enchere enchere);

	public void delete(Enchere enchere);
	
	public void deleteAllByUserId(Utilisateur user);

}
