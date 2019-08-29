package fr.eni.encheres.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import fr.eni.encheres.tools.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EncheresListDTO {

	// numero utilisateur
	//private String nom_utilisateur;
	// article
	private int no_utilisateur;
	private String nom_article;
	private int prix_vente;
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate date_fin_encheres = LocalDate.now();

	public EncheresListDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
/*
	public EncheresListDTO(String nom_utilisateur, int no_utilisateur, String nom_article, int prix_vente,
			LocalDate date_fin_encheres) {
		super();
		this.nom_utilisateur = nom_utilisateur;
		this.no_utilisateur = no_utilisateur;
		this.nom_article = nom_article;
		this.prix_vente = prix_vente;
		this.date_fin_encheres = date_fin_encheres;
	}
*/
	public EncheresListDTO(int no_utilisateur, String nom_article, int prix_vente, LocalDate date_fin_encheres) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.nom_article = nom_article;
		this.prix_vente = prix_vente;
		this.date_fin_encheres = date_fin_encheres;
	}
/*
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}

	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
*/
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

	public int getPrix_vente() {
		return prix_vente;
	}

	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
	}

	public LocalDate getDate_fin_encheres() {
		return date_fin_encheres;
	}

	public void setDate_fin_encheres(LocalDate date_fin_encheres) {
		this.date_fin_encheres = date_fin_encheres;
	}
	@Override
	public String toString() {
		return "EncheresListDTO [no_utilisateur=" + no_utilisateur + ", nom_article=" + nom_article + ", prix_vente="
				+ prix_vente + ", date_fin_encheres=" + date_fin_encheres + "]";
	}

	/*@Override
	public String toString() {
		return "EncheresListDTO [nom_utilisateur=" + nom_utilisateur + ", no_utilisateur=" + no_utilisateur
				+ ", nom_article=" + nom_article + ", prix_vente=" + prix_vente + ", date_fin_encheres="
				+ date_fin_encheres + "]";
	}
	
	*/
	

}