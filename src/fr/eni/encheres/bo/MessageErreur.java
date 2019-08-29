package fr.eni.encheres.bo;

public class MessageErreur {

	private String messsage_erreur;

	public MessageErreur() {
		super();
	}

	public MessageErreur(String messsage_erreur) {
		super();
		this.messsage_erreur = messsage_erreur;
	}

	public String getMesssage_erreur() {
		return messsage_erreur;
	}

	public void setMesssage_erreur(String messsage_erreur) {
		this.messsage_erreur = messsage_erreur;
	}

	@Override
	public String toString() {
		return "MessageErreur [messsage_erreur=" + messsage_erreur + "]";
	}
	
	
}
