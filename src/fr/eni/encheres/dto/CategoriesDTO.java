package fr.eni.encheres.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CategoriesDTO {

	private int no_categorie;
	private String libelle;

	public CategoriesDTO(int no_categorie, String libelle) {
		super();
		this.no_categorie = no_categorie;
		this.libelle = libelle;
	}

	public CategoriesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo_categorie() {
		return no_categorie;
	}

	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [no_categorie=" + no_categorie + ", libelle=" + libelle + "]";
	}
	
}
