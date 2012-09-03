package com.sfeir.tutoplace.client.accueil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.tutoplace.client.accueil.AccueilActivity.AccueilView;

public class AccueilViewImpl extends Composite implements AccueilActivity.AccueilView{

	private static AccueilViewImplUiBinder uiBinder = GWT
			.create(AccueilViewImplUiBinder.class);

	interface AccueilViewImplUiBinder extends UiBinder<Widget, AccueilViewImpl> {
	}

	public AccueilViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
