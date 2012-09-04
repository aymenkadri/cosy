package com.sfeir.tutoplace.client.cosy.encours;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class EncoursActivity extends AbstractActivity {
	
	public interface EncoursView extends IsWidget {
	}
	
	private EncoursView view = new EncoursViewImpl();

	public EncoursActivity() {
		
		// Mettre le charts ici.
	}

	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(view);
	}
}
