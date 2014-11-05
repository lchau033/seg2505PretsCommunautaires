package ca.uottawa.eecs.seg2505.objetpret.model;

import ca.uottawa.eecs.seg2505.objetpret.Constantes;

public class Emprunt {

	private String dateEmprunt = Constantes.VIDE;
	// duree: nombre de jours
	private int duree = -1;
	private boolean confirmationEmprunt = false;

	private Objet objet = null;
	private Utilisateur utilisateur = null;
	private Preteur preteur = null;

	public Emprunt() {
	}

	public String getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(String dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isConfirmationEmprunt() {
		return confirmationEmprunt;
	}

	public void setConfirmationEmprunt(boolean confirmationEmprunt) {
		this.confirmationEmprunt = confirmationEmprunt;
	}

	public Objet getObjet() {
		return objet;
	}

	public void setObjet(Objet objet) {
		this.objet = objet;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Preteur getPreteur() {
		return preteur;
	}

	public void setPreteur(Preteur preteur) {
		this.preteur = preteur;
	}

}