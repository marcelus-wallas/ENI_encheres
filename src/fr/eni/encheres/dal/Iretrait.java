package fr.eni.encheres.dal;

import java.util.ArrayList;

import fr.eni.encheres.bo.Retrait;

public interface Iretrait {

	public void create(Retrait retrait);

	public ArrayList<Retrait> read();

	public void update(Retrait retrait);

	public void delete(Retrait retrait);
	
}
