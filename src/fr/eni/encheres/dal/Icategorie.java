package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Categorie;

public interface Icategorie {
	
	public void create(Categorie categorie);

	public ArrayList<Categorie> read();

	public void update(Categorie categorie);

	public void delete(Categorie categorie);

}
