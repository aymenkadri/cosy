package fr.sfeir.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.resources.client.TextResource;

import fr.sfeir.client.config.Configurator;

public class ResourceInjector {

	private static final Configurator ADAPTER = GWT.create(Configurator.class);

	/**
	 * Injects the required CSS styles and JavaScript files into the document
	 * header.
	 */
	public static void configure() {

		Resources res = ADAPTER.getResources();

		injectCss(res.bootstrapCss());
		injectCss(res.bootstrapCssGwt());
		if (ADAPTER.hasResponsiveDesign())
			activateResponsiveDesign(res);
		injectJs(res.jquery());
		injectJs(res.bootstrapJs());
	}

	private static void injectCss(TextResource r) {
		StyleInjector.inject(r.getText());
	}

	private static void injectJs(TextResource r) {
		JavaScriptInjector.inject(r.getText());
	}

	private static void activateResponsiveDesign(Resources res) {
		injectCss(res.bootstrapResponsiveCss());
		MetaInjector
				.inject("viewport", "width=device-width, initial-scale=1.0");
	}

}
