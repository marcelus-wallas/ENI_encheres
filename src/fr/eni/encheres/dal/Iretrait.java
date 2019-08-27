package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;

public interface Iretrait {

	public void create(Retrait retrait);

	public ArrayList<Retrait> read();

	public void update(Retrait retrait);

	public void delete(Retrait retrait);
	
	public void deleteAllByUserId(Utilisateur user);
	
}
