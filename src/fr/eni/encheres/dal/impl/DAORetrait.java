package fr.eni.encheres.dal.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dal.Iretrait;

public class DAORetrait implements Iretrait {
	private static final String CREATE = "INSERT INTO RETRAITS(no_article, rue, code_postal, ville) VALUES(?,?,?,?);";
	private static final String READ = "SELECT * FROM RETRAITS;";
	private static final String UPDATE = "UPDATE RETRAITS SET rue = ?, code_postal = ?, ville = ? WHERE no_article = ?;";
	private static final String DELETE = "DELETE FROM RETRAITS WHERE no_article =?;";

	private static final String DELETERETRAITBYUSERID = "DELETE r FROM RETRAITS JOIN ARTICLES_VENDUS a ON r.no_article = a.no_article JOIN UTILISATEURS u ON a.no_utilisateur = u.no_utilisateur WHERE u.no_utilisateur= ?";

	public void create(Retrait retrait) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, retrait.getNo_article());
			pstmt.setString(2, retrait.getRue());
			pstmt.setString(3, retrait.getCode_postal());
			pstmt.setString(4, retrait.getVille());
			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				retrait.setNo_article(rs.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Retrait> read() {

		ArrayList<Retrait> res = new ArrayList<Retrait>();

		try (Connection cnx = ConnectionProvider.getConnection()) {
			Statement stmt = cnx.createStatement();

			ResultSet rs = stmt.executeQuery(READ);

			while (rs.next()) {
				Retrait temp = new Retrait(rs.getInt("no_article"), rs.getString("rue"), rs.getString("code_postal"),
						rs.getString("ville"));
				res.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void update(Retrait retrait) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCode_postal());
			pstmt.setString(3, retrait.getVille());
			pstmt.setInt(4, retrait.getNo_article());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * retrait.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Retrait retrait) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, retrait.getNo_article());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * retrait.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAllByUserId(Utilisateur user) {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETERETRAITBYUSERID,
					PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, user.getNo_utilisateur());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
