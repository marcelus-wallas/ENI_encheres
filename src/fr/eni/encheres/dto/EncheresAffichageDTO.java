package fr.eni.encheres.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.eni.encheres.tools.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EncheresAffichageDTO {

	// numero utilisateur -> vendeur
	private int no_utilisateur;
	// nom vendeur
	private String nom_utilisateur;

	private int no_article;
	private String nom_article;
	private String description;
	private int no_categorie;
	// photo encheres
	private int prix_initial;
	private int prix_vente;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate date_debut_encheres = LocalDate.now();
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate date_fin_encheres = LocalDate.now();

	// retrait ----
	private String rue;
	private String code_postal;
	private String ville;

	public EncheresAffichageDTO() {
		super();
	}

	public EncheresAffichageDTO(int no_utilisateur, String nom_utilisateur, int no_article, String nom_article,
			String description, int no_categorie, int prix_initial, int prix_vente, LocalDate date_debut_encheres,
			LocalDate date_fin_encheres, String rue, String code_postal, String ville) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.nom_utilisateur = nom_utilisateur;
		this.no_article = no_article;
		this.nom_article = nom_article;
		this.description = description;
		this.no_categorie = no_categorie;
		this.prix_initial = prix_initial;
		this.prix_vente = prix_vente;
		this.date_debut_encheres = date_debut_encheres;
		this.date_fin_encheres = date_fin_encheres;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	public EncheresAffichageDTO(int no_article, String nom_article, String description, LocalDate date_fin_encheres,
			int prix_vente, int prix_initial, int no_utilisateur, int no_categorie) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.no_article = no_article;
		this.nom_article = nom_article;
		this.description = description;
		this.no_categorie = no_categorie;
		this.prix_initial = prix_initial;
		this.prix_vente = prix_vente;
		this.date_fin_encheres = date_fin_encheres;
	}

	public EncheresAffichageDTO(String nom_article, String description, int no_categorie, int prix_initial,
			LocalDate date_debut_encheres, LocalDate date_fin_encheres) {
		super();
		this.nom_article = nom_article;
		this.description = description;
		this.no_categorie = no_categorie;
		this.prix_initial = prix_initial;
		this.date_debut_encheres = date_debut_encheres;
		this.date_fin_encheres = date_fin_encheres;
	}

	public int getNo_utilisateur() {
		return no_utilisateur;
	}

	public void setNo_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public String getNom_utilisateur() {
		return nom_utilisateur;
	}

	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}

	public int getNo_article() {
		return no_article;
	}

	public void setNo_article(int no_article) {
		this.no_article = no_article;
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

	public int getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
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