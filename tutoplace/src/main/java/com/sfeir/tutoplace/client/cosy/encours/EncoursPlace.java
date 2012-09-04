package com.sfeir.tutoplace.client.cosy.encours;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class EncoursPlace extends Place {
	
	public static class Tokenizer  implements PlaceTokenizer<EncoursPlace>{

		public EncoursPlace getPlace(String arg0) {
			return new EncoursPlace();
		}

		public String getToken(EncoursPlace arg0) {
			return "";
		}
	}
}
