package fr.eni.encheres.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AuthentificationDTO {

	private String pseudo;
	private String email;
	private String password;
	
	public AuthentificationDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthentificationDTO(String pseudo, String email, String password) {
		super();
		this.pseudo = pseudo;
		this.email = email;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthentificationDTO [pseudo=" + pseudo + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
