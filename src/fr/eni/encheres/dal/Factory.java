package fr.eni.encheres.dal;

import fr.eni.encheres.dal.impl.*;

public abstract class Factory {

	public static IarticleVendu getArticleVendu() {
		return new DAOUtilisateur();
	}

	public static Icategorie getCategorie() {
		return new Categorie();
	}

	public static Ienchere getEnchere() {
		return new Enchere();
	}

	public static Iretrait getRetrait() {
		return new Retrait();
	}

	public static Iutilisateur getUtilisateur() {
		return new ArticleVendu();
	}
}
