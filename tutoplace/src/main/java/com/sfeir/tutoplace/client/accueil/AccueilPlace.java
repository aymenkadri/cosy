package com.sfeir.tutoplace.client.accueil;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AccueilPlace extends Place {
	
	public static class Tokenizer implements PlaceTokenizer<AccueilPlace>{

		public AccueilPlace getPlace(String token) {
			return new AccueilPlace();
		}

		public String getToken(AccueilPlace arg0) {
			return "";
		}
		
	}

}
