package fr.eni.encheres.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.eni.encheres.tools.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Encheres_creationDTO {

	// numero utilisateur -> vendeur
	private int no_utilisateur;

	private String nom_article;
	private String description;
	private int no_categorie;
	// photo encheres
	private int prix_initial;	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate date_debut_encheres = LocalDate.now();
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate date_fin_encheres = LocalDate.now();

	// retrait ----
	private String rue;
	private String code_postal;
	private String ville;

	public Encheres_creationDTO() {
		super();
	}

	public Encheres_creationDTO(int no_utilisateur, String nom_article, String description, int no_categorie,
			int prix_initial, LocalDate date_debut_encheres, LocalDate date_fin_encheres, String rue, String code_postal,
			String ville) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.nom_article = nom_article;
		this.description = description;
		this.no_categorie = no_categorie;
		this.prix_initial = prix_initial;		
		this.date_debut_encheres = date_debut_encheres;		
		this.date_fin_encheres = date_fin_encheres;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	public int getNo_utilisateur() {
		return no_utilisateur;
	}

	public void setNo_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public String getNom_article() {
		return nom_article;
	}

	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNo_categorie() {
		return no_categorie;
	}

	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}

	public int getPrix_initial() {
		return prix_initial;
	}

	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}

	public LocalDate getDate_debut_encheres() {
		return date_debut_encheres;
	}

	public void setDate_debut_encheres(LocalDate date_debut_encheres) {
		this.date_debut_encheres = date_debut_encheres;
	}

	public LocalDate getDate_fin_encheres() {
		return date_fin_encheres;
	}

	public void setDate_fin_encheres(LocalDate date_fin_encheres) {
		this.date_fin_encheres = date_fin_encheres;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
