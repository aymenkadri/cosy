package fr.sfeir.client.activity;

import java.util.ArrayList;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

import fr.sfeir.client.place.SituationEncoursPlace;
import fr.sfeir.shared.init.InitData;
import fr.sfeir.shared.pro.Souscripteur;

public class EspaceClientActivity extends AbstractActivity {
	
	public interface IEspaceClientView extends IsWidget{
		void setData(ArrayList<Souscripteur> souscripteurs);
		void setPresenter(EspaceClientActivity presenter);
	}
	private InitData initData = new InitData();
	private final IEspaceClientView espaceClientView;
	private final ArrayList<Souscripteur> souscripteurs = new ArrayList<Souscripteur>();
	private Souscripteur souscripteur ;
	private final PlaceController placeController;
	
	@Inject
	public EspaceClientActivity(final IEspaceClientView espaceClientView,
			final PlaceController placeController) {
		this.espaceClientView = espaceClientView;
		this.placeController = placeController;
		souscripteur = initData.initSouscripteru();
		souscripteurs.add(souscripteur);
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.espaceClientView.setPresenter(this);
		this.espaceClientView.setData(souscripteurs);
		panel.setWidget(espaceClientView);
	}

	public void onDetailSituationEnCours() {
		this.placeController.goTo(new SituationEncoursPlace());
		
	}
}
