package com.sfeir.tutoplace.client.cosy.souscription;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ProduitSouscriptionPlace extends Place {
	
	public static class Tokenizer implements PlaceTokenizer<ProduitSouscriptionPlace>{

		public ProduitSouscriptionPlace getPlace(String token) {
			return new ProduitSouscriptionPlace();
		}

		public String getToken(ProduitSouscriptionPlace arg0) {
			return "";
		}
		
	}

}
