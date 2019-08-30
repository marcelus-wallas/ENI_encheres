package fr.eni.encheres.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ModificationProfilDTO {

	private int no_utilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String code_postal;
	private String ville;
	private String mot_de_passe_actuel;
	private String nouveau_mot_de_passe;
	private String confirmation;
	private int credit;
	
	
	public ModificationProfilDTO() {
		super();
	}


	public ModificationProfilDTO(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String code_postal, String ville, String mot_de_passe_actuel, String nouveau_mot_de_passe,
			String confirmation) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.mot_de_passe_actuel = mot_de_passe_actuel;
		this.nouveau_mot_de_passe = nouveau_mot_de_passe;
		this.confirmation = confirmation;
	}

	public int getNo_utilisateur() {
		return no_utilisateur;
	}


	public void setNo_utilisateur(int no_utilisateur) {
		this.no_utilisateur = no_utilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
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


	public String getMot_de_passe_actuel() {
		return mot_de_passe_actuel;
	}


	public void setMot_de_passe_actuel(String mot_de_passe_actuel) {
		this.mot_de_passe_actuel = mot_de_passe_actuel;
	}


	public String getNouveau_mot_de_passe() {
		return nouveau_mot_de_passe;
	}


	public void setNouveau_mot_de_passe(String nouveau_mot_de_passe) {
		this.nouveau_mot_de_passe = nouveau_mot_de_passe;
	}


	public String getConfirmation() {
		return confirmation;
	}


	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public int getCredit() {
		return credit;
	}


	public void setCredit(int credit) {
		this.credit = credit;
	}


	@Override
	public String toString() {
		return "ModificationProfilDTO [pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", telephone=" + telephone + ", rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville
				+ ", mot_de_passe_actuel=" + mot_de_passe_actuel + ", nouveau_mot_de_passe=" + nouveau_mot_de_passe
				+ ", confirmation=" + confirmation + "]";
	}
	
	
	
}
