package fr.sfeir.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainLayoutView extends Composite {

	private static MainLayoutViewUiBinder uiBinder = GWT
			.create(MainLayoutViewUiBinder.class);

	interface MainLayoutViewUiBinder extends UiBinder<Widget, MainLayoutView> {
	}

	@UiField
	AcceptsOneWidget centerContainer;

	@UiField
	AcceptsOneWidget navBar;

	public MainLayoutView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public AcceptsOneWidget getCenterContainer() {
		return centerContainer;
	}

	public void setCenterContainer(AcceptsOneWidget centerContainer) {
		this.centerContainer = centerContainer;
	}

	public AcceptsOneWidget getNavBar() {
		return navBar;
	}

	public void setNavBar(AcceptsOneWidget navBar) {
		this.navBar = navBar;
	}

}
