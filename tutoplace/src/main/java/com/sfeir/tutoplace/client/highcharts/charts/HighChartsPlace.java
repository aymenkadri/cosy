package com.sfeir.tutoplace.client.highcharts.charts;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HighChartsPlace extends Place {
	
	public static class Tokenizer  implements PlaceTokenizer<HighChartsPlace>{

		public HighChartsPlace getPlace(String arg0) {
			return new HighChartsPlace();
		}

		public String getToken(HighChartsPlace arg0) {
			return "";
		}
	}
}
