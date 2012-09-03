package com.sfeir.tutoplace.client.login;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LoginPlace extends Place {
	
	public static class Tokenizer  implements PlaceTokenizer<LoginPlace>{

		public LoginPlace getPlace(String arg0) {
			return new LoginPlace();
		}

		public String getToken(LoginPlace arg0) {
			return "";
		}
	}
}
