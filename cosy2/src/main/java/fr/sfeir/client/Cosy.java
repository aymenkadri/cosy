package fr.sfeir.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

import fr.sfeir.client.gin.GwtInjector;
import fr.sfeir.client.resources.ResourceInjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Cosy implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	@Override
	public void onModuleLoad() {
		// Bootstrap
		ResourceInjector.configure();

		GwtInjector injector = GWT.create(GwtInjector.class);
		RootPanel.get().add(injector.getDisplay());
		injector.getHistoryHandler().handleCurrentHistory();
		RootLayoutPanel.get().add(injector.getDisplay());
	}
}
