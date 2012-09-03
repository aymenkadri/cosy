package com.sfeir.tutoplace.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;
import com.sfeir.tutoplace.client.accueil.AccueilActivity;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.highcharts.charts.HighChartsActivity;
import com.sfeir.tutoplace.client.highcharts.charts.HighChartsPlace;
import com.sfeir.tutoplace.client.highcharts.piechart.PieChartsActivity;
import com.sfeir.tutoplace.client.highcharts.piechart.PieChartsPlace;
import com.sfeir.tutoplace.client.login.LoginActivity;
import com.sfeir.tutoplace.client.login.LoginPlace;
import com.sfeir.tutoplace.client.menu.Menu;
import com.sfeir.tutoplace.client.produit.souscription.ProduitSouscriptionActivity;
import com.sfeir.tutoplace.client.produit.souscription.ProduitSouscriptionPlace;

public class MonActivityMapper implements ActivityMapper {

	private final Map<Class<? extends Place>, Activity> map = new HashMap<Class<? extends Place>, Activity>();

	public MonActivityMapper() {
		map.put(LoginPlace.class, new LoginActivity());
		map.put(AccueilPlace.class, new AccueilActivity());
		map.put(ProduitSouscriptionPlace.class, new ProduitSouscriptionActivity());
		map.put(com.sfeir.tutoplace.client.auteur.accueil.AuteurAccueilPlace.class,
				new com.sfeir.tutoplace.client.auteur.accueil.AuteurAccueilActivity());
		map.put(HighChartsPlace.class, new HighChartsActivity());
		map.put(PieChartsPlace.class, new PieChartsActivity());
		

	}

	public Activity getActivity(Place place) {
		Activity activity = map.get(place.getClass());
		Main.getMenu().setVisible(!(place instanceof LoginPlace));
		return activity;
	}

}
