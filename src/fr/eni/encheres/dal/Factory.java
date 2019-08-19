package fr.eni.encheres.dal;

import fr.eni.encheres.dal.impl.*;

public abstract class Factory {

	public static IarticleVendu getArticleVendu() {
		return new DAOUtilisateur();
	}

	public static Icategorie getCategorie() {
		return new DAOCategorie();
	}

	public static Ienchere getEnchere() {
		return new DAOEnchere();
	}

	public static Iretrait getRetrait() {
		return new DAORetrait();
	}

	public static Iutilisateur getUtilisateur() {
		return new DAOArticleVendu();
	}
}
