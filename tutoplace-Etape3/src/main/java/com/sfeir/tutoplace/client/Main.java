package com.sfeir.tutoplace.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.sfeir.tutoplace.client.login.LoginPlace;

public class Main implements EntryPoint {

	public void onModuleLoad() {

		// <la sauce pour aller de l'URL a la place>
		PlaceHistoryMapper placeHistoryMapper = GWT
				.create(MonPlaceHistoryMapper.class);
		PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(
				placeHistoryMapper);

		Place defaultPlace = new LoginPlace();
		EventBus eventBus = new SimpleEventBus();
		PlaceController placeController = new PlaceController(eventBus);
		placeHistoryHandler.register(placeController, eventBus, defaultPlace);
		// </la sauce pour aller de l'URL a la place>

		// <la sauce pour aller de la place vers l'activite qui s'affiche>
		ActivityMapper mapper = new MonActivityMapper();

		// Controleur d'une region d'affichage
		ActivityManager activityManager = new ActivityManager(mapper, eventBus);
		//TODO : remplacer le simplepanel par un composant de notre layout
		SimplePanel leDisplayDAffichage = new SimplePanel();
		activityManager.setDisplay(leDisplayDAffichage);
		

		// </la sauce pour aller de la place vers l'activite qui s'affiche>

		// Demarre l'activite qui correspond a l'historique courant
		placeHistoryHandler.handleCurrentHistory();
		
		
		// Ajout de la region d'affichage
		RootPanel.get().add(leDisplayDAffichage);
		

	}

}
