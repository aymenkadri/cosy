package fr.sfeir.client.ui.util;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

import fr.sfeir.client.resources.img.ImagesResource;

public class ButtonCellList extends ButtonCell {
	ImagesResource images = GWT.create(ImagesResource.class);

	public ButtonCellList() {
		super();
	}

	@Override
	public void render(Context context, SafeHtml data, SafeHtmlBuilder sb) {
		sb.appendHtmlConstant("<img  style=\"cursor:pointer;\" src=\""
				+ images.loupe().getSafeUri().asString()
				+ "\" alt=\"détail\" title=\"détail\" />");
	}
}
