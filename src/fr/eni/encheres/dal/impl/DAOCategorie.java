package fr.eni.encheres.dal.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.dal.Icategorie;

public class DAOCategorie implements Icategorie {
	private static final String CREATE = "INSERT INTO CATEGORIES(libelle) VALUES(?);";
	private static final String READ = "SELECT * FROM CATEGORIES;";
	private static final String UPDATE = "UPDATE CATEGORIES SET libelle = ? WHERE no_categorie = ?;";
	private static final String DELETE = "DELETE FROM CATEGORIES WHERE no_categorie = ?;";

	public void create(Categorie categorie) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, categorie.getLibelle());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * categorie.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Categorie> read() {

		ArrayList<Categorie> res = new ArrayList<Categorie>();

		try (Connection cnx = ConnectionProvider.getConnection()) {
			Statement stmt = cnx.createStatement();

			ResultSet rs = stmt.executeQuery(READ);

			while (rs.next()) {
				Categorie temp = new Categorie(rs.getInt("no_categorie"), rs.getString("libelle"));
				res.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void update(Categorie categorie) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, categorie.getLibelle());
			pstmt.setInt(2, categorie.getNo_categorie());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * categorie.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Categorie categorie) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, categorie.getNo_categorie());
			pstmt.executeUpdate();

			/*
			 * ResultSet rs = pstmt.getGeneratedKeys(); if (rs.next()) {
			 * categorie.setIdentifiant(rs.getInt(1)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}