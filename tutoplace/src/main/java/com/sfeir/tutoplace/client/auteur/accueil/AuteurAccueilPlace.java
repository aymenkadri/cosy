package com.sfeir.tutoplace.client.auteur.accueil;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AuteurAccueilPlace extends Place {
	
	public static class Tokenizer implements PlaceTokenizer<AuteurAccueilPlace>{

		public AuteurAccueilPlace getPlace(String token) {
			return new AuteurAccueilPlace();
		}

		public String getToken(AuteurAccueilPlace arg0) {
			return "";
		}
		
	}

}
