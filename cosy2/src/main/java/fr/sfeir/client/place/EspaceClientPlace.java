package fr.sfeir.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class EspaceClientPlace extends Place {

	@Prefix("espaceClient")
	public static class Tokenizer implements PlaceTokenizer<EspaceClientPlace> {

		@Override
		public EspaceClientPlace getPlace(String token) {
			return new EspaceClientPlace();
		}

		@Override
		public String getToken(EspaceClientPlace place) {
			return "";
		}

	}
}
