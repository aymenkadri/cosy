package com.sfeir.tutoplace.client.widgets.highcharts.piechart;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PieChartsPlace extends Place {
	
	public static class Tokenizer  implements PlaceTokenizer<PieChartsPlace>{

		public PieChartsPlace getPlace(String arg0) {
			return new PieChartsPlace();
		}

		public String getToken(PieChartsPlace arg0) {
			return "";
		}
	}
}
