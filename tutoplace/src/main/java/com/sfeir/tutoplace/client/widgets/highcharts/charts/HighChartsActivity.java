package com.sfeir.tutoplace.client.widgets.highcharts.charts;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class HighChartsActivity extends AbstractActivity {
	
	public interface HighChartsView extends IsWidget {
	}
	
	private HighChartsView view = new HighChartsViewImpl();

	public HighChartsActivity() {
		
		// Mettre le charts ici.
	}

	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(view);
	}
}
