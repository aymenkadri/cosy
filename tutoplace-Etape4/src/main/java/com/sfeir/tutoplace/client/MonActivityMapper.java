package com.sfeir.tutoplace.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.sfeir.tutoplace.client.accueil.AccueilActivity;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.login.LoginActivity;
import com.sfeir.tutoplace.client.login.LoginPlace;

public class MonActivityMapper implements ActivityMapper {

	private final Map<Class<? extends Place>, Activity> map = new HashMap<Class<? extends Place>, Activity>();

	public MonActivityMapper() {
		map.put(LoginPlace.class, new LoginActivity());
		map.put(AccueilPlace.class, new AccueilActivity());
	}

	public Activity getActivity(Place place) {
		Activity activity = map.get(place.getClass());
		return activity;
	}

}
