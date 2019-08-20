package fr.eni.encheres.dal.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.encheres.bo.Enchere;
import fr.eni.encheres.dal.Ienchere;

public class DAOEnchere implements Ienchere {
	private static final String CREATE = "INSERT INTO ENCHERES(no_utilisateur, no_article, date_enchere, montant_enchere) VALUES(?,?,?,?);";
	private static final String READ = "SELECT * FROM ENCHERES;";
	private static final String UPDATE = "UPDATE ENCHERES SET date_enchere = ?, montant_enchere = ? WHERE no_utilisateur = ? AND no_article = ?;";
	private static final String DELETE = "DELETE FROM ENCHERES WHERE no_utilisateur = ? AND no_article = ?;";

	public void create(Enchere enchere) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, enchere.getNo_utilisateur());
			pstmt.setInt(2, enchere.getNo_article());
			pstmt.setDate(3, Date.valueOf(enchere.getDate_enchere()));
			pstmt.setInt(4, enchere.getMontant_enchere());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * enchere.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Enchere> read() {

		ArrayList<Enchere> res = new ArrayList<Enchere>();

		try (Connection cnx = ConnectionProvider.getConnection()) {
			Statement stmt = cnx.createStatement();

			ResultSet rs = stmt.executeQuery(READ);

			while (rs.next()) {
				Enchere temp = new Enchere(rs.getInt("no_utilisateur"), rs.getInt("no_article"),
						rs.getDate("date_enchere").toLocalDate(), rs.getInt("montant_enchere"));
				res.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void update(Enchere enchere) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setDate(1, Date.valueOf(enchere.getDate_enchere()));
			pstmt.setInt(2, enchere.getMontant_enchere());
			pstmt.setInt(3, enchere.getNo_utilisateur());
			pstmt.setInt(4, enchere.getNo_article());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * enchere.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Enchere enchere) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, enchere.getNo_utilisateur());
			pstmt.setInt(2, enchere.getNo_article());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * enchere.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
