package fr.sfeir.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

import fr.sfeir.client.activity.NavBarActivity;

public class NavBarView extends Composite implements NavBarActivity.INavBarView {

	private static NavBarViewUiBinder uiBinder = GWT
			.create(NavBarViewUiBinder.class);

	interface NavBarViewUiBinder extends UiBinder<Widget, NavBarView> {
	}

	@UiField
	Anchor acceuil;

	@UiField
	Anchor aideDecision;

	@UiField
	Anchor aideChoixSupport;

	@UiField
	Anchor evalCapitalATerme;
	
	@UiField
	HTMLPanel htmlPanel;
	
	private NavBarActivity presenter;
	
	
	public NavBarView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Anchor getAcceuil() {
		return this.acceuil;
	}

	@Override
	public Anchor getAideDecision() {
		return this.aideDecision;
	}

	@Override
	public Anchor getAideChoixSupport() {
		return this.aideChoixSupport;
	}

	@Override
	public Anchor getEvalCapitalATerme() {
		return this.evalCapitalATerme;
	}

	@Override
	public void setPresenter(NavBarActivity presenter) {
		this.presenter = presenter;
	}

	public HTMLPanel getHtmlPanel() {
		return htmlPanel;
	}

	public void setHtmlPanel(HTMLPanel htmlPanel) {
		this.htmlPanel = htmlPanel;
	}

}
