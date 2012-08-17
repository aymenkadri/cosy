package fr.sfeir.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class HomePagePlace extends Place {

	@Prefix("homePage")
	public static class Tokenizer implements PlaceTokenizer<HomePagePlace> {

		@Override
		public HomePagePlace getPlace(String token) {
			return new HomePagePlace();
		}

		@Override
		public String getToken(HomePagePlace place) {
			return "";
		}

	}
}
