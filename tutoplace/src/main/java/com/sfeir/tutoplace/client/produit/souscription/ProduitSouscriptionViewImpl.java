package com.sfeir.tutoplace.client.produit.souscription;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.tutoplace.client.accueil.AccueilActivity.AccueilView;

public class ProduitSouscriptionViewImpl extends Composite implements ProduitSouscriptionActivity.AccueilView{

	private static ProduitSouscriptionViewImplUiBinder uiBinder = GWT
			.create(ProduitSouscriptionViewImplUiBinder.class);

	interface ProduitSouscriptionViewImplUiBinder extends UiBinder<Widget, ProduitSouscriptionViewImpl> {
	}

	public ProduitSouscriptionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
