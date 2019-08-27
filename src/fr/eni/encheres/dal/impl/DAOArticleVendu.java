package fr.eni.encheres.dal.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dal.IarticleVendu;

public class DAOArticleVendu implements IarticleVendu {
	private static final String CREATE = "INSERT INTO ARTICLES_VENDUS(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?,?,?,?,?,?,?,?);";
	private static final String READ = "SELECT * FROM ARTICLES_VENDUS;";
	private static final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article = ?, description = ?, date_debut_encheres = ?, date_fin_encheres = ?, prix_initial = ?, prix_vente = ?, no_utilisateur = ?, no_categorie = ? WHERE no_article = ?;";
	private static final String DELETE = "DELETE FROM ARTICLES_VENDUS WHERE no_article = ?;";

	public int create(ArticleVendu article_vendu) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, article_vendu.getNom_article());
			pstmt.setString(2, article_vendu.getDescription());
			pstmt.setDate(3, Date.valueOf(article_vendu.getDate_debut_encheres()));
			pstmt.setDate(4, Date.valueOf(article_vendu.getDate_fin_encheres()));
			pstmt.setInt(5, article_vendu.getPrix_initial());
			pstmt.setInt(6, article_vendu.getPrix_vente());
			pstmt.setInt(7, article_vendu.getNo_utilisateur());
			pstmt.setInt(8, article_vendu.getNo_categorie());
			pstmt.executeUpdate();

			
			ResultSet rs = pstmt.getGeneratedKeys();
			System.out.println(rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<ArticleVendu> read() {

		ArrayList<ArticleVendu> res = new ArrayList<ArticleVendu>();

		try (Connection cnx = ConnectionProvider.getConnection()) {
			Statement stmt = cnx.createStatement();

			ResultSet rs = stmt.executeQuery(READ);

			while (rs.next()) {
				ArticleVendu temp = new ArticleVendu(rs.getInt("no_article"), rs.getString("nom_article"),
						rs.getString("description"), rs.getDate("date_debut_encheres").toLocalDate(), rs.getDate("date_fin_encheres").toLocalDate(), rs.getInt("prix_initial"),
						rs.getInt("prix_vente"), rs.getInt("no_utilisateur"), rs.getInt("no_categorie"));
				res.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void update(ArticleVendu article_vendu) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, article_vendu.getNom_article());
			pstmt.setString(2, article_vendu.getDescription());
			pstmt.setDate(3, Date.valueOf(article_vendu.getDate_debut_encheres()));
			pstmt.setDate(4, Date.valueOf(article_vendu.getDate_fin_encheres()));
			pstmt.setInt(5, article_vendu.getPrix_initial());
			pstmt.setInt(6, article_vendu.getPrix_vente());
			pstmt.setInt(7, article_vendu.getNo_utilisateur());
			pstmt.setInt(8, article_vendu.getNo_categorie());
			pstmt.setInt(9, article_vendu.getNo_article());
			pstmt.executeUpdate();


			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * article_vendu.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(ArticleVendu article_vendu) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, article_vendu.getNo_article());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * article_vendu.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
