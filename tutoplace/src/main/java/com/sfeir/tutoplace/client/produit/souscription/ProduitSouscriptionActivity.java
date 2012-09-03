package com.sfeir.tutoplace.client.produit.souscription;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class ProduitSouscriptionActivity extends AbstractActivity {
	
	public interface AccueilView extends IsWidget {

		void clear();
		
	}

	AccueilView accueilView = new ProduitSouscriptionViewImpl();
	
	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(accueilView);
	}

	@Override
	public void onStop() {
		
		accueilView.clear();
		
		super.onStop();
	}
	
		
	
}
