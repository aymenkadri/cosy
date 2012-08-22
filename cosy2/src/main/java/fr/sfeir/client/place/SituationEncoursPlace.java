package fr.sfeir.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class SituationEncoursPlace extends Place {

	@Prefix("situationEncours")
	public static class Tokenizer implements PlaceTokenizer<SituationEncoursPlace> {

		@Override
		public SituationEncoursPlace getPlace(String token) {
			return new SituationEncoursPlace();
		}

		@Override
		public String getToken(SituationEncoursPlace place) {
			return "";
		}

	}
}
