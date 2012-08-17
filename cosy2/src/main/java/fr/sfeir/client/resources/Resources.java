package fr.sfeir.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface Resources extends ClientBundle {

	public static Resources RESOURCES = GWT.create(Resources.class);

	@Source("css/bootstrap.min.css")
	TextResource bootstrapCss();

	@Source("js/bootstrap.min.js")
	TextResource bootstrapJs();

	@Source("js/jquery-1.7.1.min.js")
	TextResource jquery();

	@Source("css/bootstrap-responsive.min.css")
	TextResource bootstrapResponsiveCss();

	@Source("css/bootstrapCssGwt.css")
	TextResource bootstrapCssGwt();

//	@Source("img/glyphicons-halflings-white.png")
//	ImageResource glyphiconsHalflingsWhite();
//
//	@Source("img/glyphicons-halflings.png")
//	ImageResource glyphiconsHalflings();
}
