package com.sfeir.tutoplace.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.sfeir.tutoplace.client.login.LoginActivity;

public class MonActivityMapper implements ActivityMapper {

	public Activity getActivity(Place place) {
		return new LoginActivity();
	}

}
