package fr.sfeir.shared.init;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

import fr.sfeir.shared.pro.Souscripteur;

public class InitData {
	
	private static Souscripteur souscripteur = new Souscripteur();
	private static DateTimeFormat fmt = DateTimeFormat.getFormat("dd/MM/yyyy");
	
	
	public InitData() {
	}
	
	public Souscripteur initSouscripteru(){
		souscripteur.setId(1L);
		souscripteur.setNom("Lou");
		souscripteur.setPrenom("BARON");
		Date date = new Date();
		String dEffet = fmt.format(date);
		
		souscripteur.setDateEffetContrat(dEffet);
		souscripteur.setDuree("Vie entière");
		
		
		souscripteur.setNomContrat("Frontière Efficiente");
		souscripteur.setNumeroContrat("4000025");
		
		souscripteur.setVersementInitial(530000.0);
		souscripteur.setRachatsPartiels(129790.11);
		souscripteur.setValorisationEncours(441648.0);
		return souscripteur;
	}
}
