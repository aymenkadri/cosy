package fr.sfeir.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class SituationEncoursActivity extends AbstractActivity {
	
	public interface ISituationEncoursView extends IsWidget{
		void setPresenter(SituationEncoursActivity presenter);
	}
	
	private final ISituationEncoursView situationEncoursView;
		
	@Inject
	public SituationEncoursActivity(final ISituationEncoursView situationEncoursView) {
		this.situationEncoursView = situationEncoursView;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.situationEncoursView.setPresenter(this);
		panel.setWidget(situationEncoursView);
	}
}
