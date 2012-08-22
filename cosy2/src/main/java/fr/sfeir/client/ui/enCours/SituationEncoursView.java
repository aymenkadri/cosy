package fr.sfeir.client.ui.enCours;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

import fr.sfeir.client.activity.SituationEncoursActivity;

public class SituationEncoursView extends Composite implements SituationEncoursActivity.ISituationEncoursView{

	private static SituationEncoursViewUiBinder uiBinder = GWT
			.create(SituationEncoursViewUiBinder.class);

	interface SituationEncoursViewUiBinder extends
			UiBinder<Widget, SituationEncoursView> {
	}
	
	private SituationEncoursActivity presenter;
	
	@Inject
	public SituationEncoursView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(SituationEncoursActivity presenter) {
		this.presenter = presenter;
	}
}
