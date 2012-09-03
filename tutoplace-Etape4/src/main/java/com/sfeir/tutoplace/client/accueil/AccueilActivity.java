package com.sfeir.tutoplace.client.accueil;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class AccueilActivity extends AbstractActivity {
	
	public interface AccueilView extends IsWidget {
		
	}

	AccueilView accueilView = new AccueilViewImpl();
	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(accueilView);
	}
	
	
}
