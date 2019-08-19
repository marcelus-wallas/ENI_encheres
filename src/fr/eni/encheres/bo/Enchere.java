package fr.eni.encheres.bo;

public class Enchere {

	private int no_utilisateur;
	private String no_article;
	private String date_enchere;
	private String montant_enchere;

	public Enchere(int no_utilisateur, String no_article, String date_enchere, String montant_enchere) {
		super();
		this.no_utilisateur = no_utilisateur;
		this.no_article = no_article;
		this.date_enchere = date_enchere;
		this.montant_enchere = montant_enchere;
	}

	public Enchere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNo_utilisateur() {
		return no_utilisateur;
	}

	public void setNo_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public String getNo_article() {
		return no_article;
	}

	public void setNo_article(String no_article) {
		this.no_article = no_article;
	}

	public String getDate_enchere() {
		return date_enchere;
	}

	public void setDate_enchere(String date_enchere) {
		this.date_enchere = date_enchere;
	}

	public String getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(String montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	@Override
	public String toString() {
		return "Enchere [no_utilisateur=" + no_utilisateur + ", no_article=" + no_article + ", date_enchere="
				+ date_enchere + ", montant_enchere=" + montant_enchere + "]";
	}
}
