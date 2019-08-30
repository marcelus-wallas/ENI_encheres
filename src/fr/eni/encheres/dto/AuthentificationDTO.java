package fr.eni.encheres.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthentificationDTO {

	private String pseudo;
	private String email;
	private String mot_de_passe;
	
	public AuthentificationDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthentificationDTO(String pseudo, String email, String mot_de_passe) {
		super();
		this.pseudo = pseudo;
		this.email = email;
		this.mot_de_passe = mot_de_passe;
	}
	
	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getmot_de_passe() {
		return mot_de_passe;
	}

	public void setmot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	@Override
	public String toString() {
		return "AuthentificationDTO [pseudo=" + pseudo + ", email=" + email + ", mot_de_passe=" + mot_de_passe + "]";
	}
}
