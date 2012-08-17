package fr.sfeir.shared.pro;

import java.util.Date;

public class Souscripteur {
	
	private String nomContrat;
	private int numeroContrat;
	private String agence ;
	private Date dateEffetContrat;
	private String duree;
	private float versementInitial;
	private float versementsComplementaires;
	private float valorisationEncours;
	
	
	
	public String getNomContrat() {
		return nomContrat;
	}
	public void setNomContrat(String nomContrat) {
		this.nomContrat = nomContrat;
	}
	public int getNumeroContrat() {
		return numeroContrat;
	}
	public void setNumeroContrat(int numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public Date getDateEffetContrat() {
		return dateEffetContrat;
	}
	public void setDateEffetContrat(Date dateEffetContrat) {
		this.dateEffetContrat = dateEffetContrat;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public float getVersementInitial() {
		return versementInitial;
	}
	public void setVersementInitial(float versementInitial) {
		this.versementInitial = versementInitial;
	}
	public float getVersementsComplementaires() {
		return versementsComplementaires;
	}
	public void setVersementsComplementaires(float versementsComplementaires) {
		this.versementsComplementaires = versementsComplementaires;
	}
	public float getValorisationEncours() {
		return valorisationEncours;
	}
	public void setValorisationEncours(float valorisationEncours) {
		this.valorisationEncours = valorisationEncours;
	}
	

}
