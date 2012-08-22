package fr.sfeir.shared.pro;

import java.util.Date;

import com.google.gwt.view.client.ProvidesKey;

public class Souscripteur {
	
	private Long id;
	private String nom;
	private String prenom;
	
	private String nomContrat;	
	private String numeroContrat;
	private String agence ;
	private String dateEffetContrat;
	private String duree;
	private Double rachatsPartiels;
	private Double versementInitial;
	private Double versementsComplementaires;
	private Double valorisationEncours;
	
	public static final ProvidesKey<Souscripteur> KEY_PROVIDER = new ProvidesKey<Souscripteur>() {
		@Override
		public Object getKey(Souscripteur item) {
			return item == null ? null : item.getId();
		}
	};
	
	public Souscripteur() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Double getRachatsPartiels() {
		return rachatsPartiels;
	}

	public void setRachatsPartiels(Double rachatsPartiels) {
		this.rachatsPartiels = rachatsPartiels;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNomContrat() {
		return nomContrat;
	}
	public void setNomContrat(String nomContrat) {
		this.nomContrat = nomContrat;
	}
	public String getNumeroContrat() {
		return numeroContrat;
	}
	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public String getDateEffetContrat() {
		return dateEffetContrat;
	}
	public void setDateEffetContrat(String dateEffetContrat) {
		this.dateEffetContrat = dateEffetContrat;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public Double getVersementInitial() {
		return versementInitial;
	}
	public void setVersementInitial(Double versementInitial) {
		this.versementInitial = versementInitial;
	}
	public Double getVersementsComplementaires() {
		return versementsComplementaires;
	}
	public void setVersementsComplementaires(Double versementsComplementaires) {
		this.versementsComplementaires = versementsComplementaires;
	}
	public Double getValorisationEncours() {
		return valorisationEncours;
	}
	public void setValorisationEncours(Double valorisationEncours) {
		this.valorisationEncours = valorisationEncours;
	}
	

}
