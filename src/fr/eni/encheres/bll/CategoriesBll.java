package fr.eni.encheres.bll;

import java.util.ArrayList;

import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.dal.Factory;
import fr.eni.encheres.dal.Icategorie;

public class CategoriesBll {
	private static Icategorie categorieDAL;
	
	public CategoriesBll(){
		this.categorieDAL = Factory.getCategorie();
	}
	
	public ArrayList<Categorie> getAll() {
		return categorieDAL.read();		
	}
}
