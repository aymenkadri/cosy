package com.sfeir.tutoplace.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.highcharts.charts.HighChartsPlace;
import com.sfeir.tutoplace.client.highcharts.piechart.PieChartsPlace;
import com.sfeir.tutoplace.client.login.LoginPlace;
import com.sfeir.tutoplace.client.produit.souscription.ProduitSouscriptionPlace;

@WithTokenizers({
		LoginPlace.Tokenizer.class,
		AccueilPlace.Tokenizer.class,
		com.sfeir.tutoplace.client.auteur.accueil.AuteurAccueilPlace.Tokenizer.class,
		ProduitSouscriptionPlace.Tokenizer.class,
		HighChartsPlace.Tokenizer.class,
		PieChartsPlace.Tokenizer.class})
public interface MonPlaceHistoryMapper extends PlaceHistoryMapper {

}
