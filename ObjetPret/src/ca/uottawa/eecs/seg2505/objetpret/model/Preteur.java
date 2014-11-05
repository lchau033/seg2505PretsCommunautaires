package ca.uottawa.eecs.seg2505.objetpret.model;

import java.util.*;

public class Preteur {
	private double cote = -1;
	private List<Objet> objets = new ArrayList<Objet>();

	public Preteur() {
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	public List<Objet> getObjets() {
		return objets;
	}
	
	public void addObjet(Objet obj) {
		objets.add(obj);
	}
	
	public void removeObjet(Objet obj) {
		objets.remove(obj);
	}

}