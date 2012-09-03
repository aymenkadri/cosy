package com.sfeir.tutoplace.client.login;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.sfeir.tutoplace.client.Main;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.auteur.accueil.AuteurAccueilPlace;
import com.sfeir.tutoplace.client.produit.souscription.ProduitSouscriptionPlace;

public class LoginActivity extends AbstractActivity {
	
	public interface LoginView extends IsWidget {
		HasClickHandlers getButton();
	}
	
	private LoginView view = new LoginViewImpl();

	public LoginActivity() {
		view.getButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent arg0) {
				Main.getPlaceController().goTo(new AccueilPlace());
			}
		});
	}

	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(view);
	}
}
