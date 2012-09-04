package com.sfeir.tutoplace.client.widgets.highcharts.piechart;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class PieChartsActivity extends AbstractActivity {
	
	public interface PieChartsView extends IsWidget {
	}
	
	private PieChartsView view = new PieChartsViewImpl();

	public PieChartsActivity() {
		
		// Mettre le charts ici.
	}

	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(view);
	}
}
