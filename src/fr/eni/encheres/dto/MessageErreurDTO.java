package fr.eni.encheres.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageErreurDTO {

	private String message_erreur;
	
	public MessageErreurDTO() {
		super();
	}

	public MessageErreurDTO(String message_erreur) {
		super();
		this.message_erreur = message_erreur;
	}

	public String getMessage_erreur() {
		return message_erreur;
	}

	public void setMessage_erreur(String message_erreur) {
		this.message_erreur = message_erreur;
	}

	@Override
	public String toString() {
		return "messageErreurDTO [message_erreur=" + message_erreur + "]";
	}
	
	
	
}
