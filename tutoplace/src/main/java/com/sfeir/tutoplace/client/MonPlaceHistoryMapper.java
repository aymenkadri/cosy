package com.sfeir.tutoplace.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.cosy.encours.EncoursPlace;
import com.sfeir.tutoplace.client.cosy.souscription.ProduitSouscriptionPlace;
import com.sfeir.tutoplace.client.login.LoginPlace;
import com.sfeir.tutoplace.client.widgets.highcharts.charts.HighChartsPlace;
import com.sfeir.tutoplace.client.widgets.highcharts.piechart.PieChartsPlace;

@WithTokenizers({
		LoginPlace.Tokenizer.class,
		AccueilPlace.Tokenizer.class,
		com.sfeir.tutoplace.client.widgets.auteur.accueil.AuteurAccueilPlace.Tokenizer.class,
		ProduitSouscriptionPlace.Tokenizer.class,
		EncoursPlace.Tokenizer.class,
		HighChartsPlace.Tokenizer.class,
		PieChartsPlace.Tokenizer.class})
public interface MonPlaceHistoryMapper extends PlaceHistoryMapper {

}
