package fr.sfeir.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class NavBarActivity extends AbstractActivity {

	public interface INavBarView extends IsWidget {
		Anchor getAcceuil();

		Anchor getAideDecision();

		Anchor getAideChoixSupport();

		Anchor getEvalCapitalATerme();

		void setPresenter(NavBarActivity presenter);
	}

	private final INavBarView navBarView;
	private final PlaceController placeController;

	@Inject
	public NavBarActivity(final INavBarView navBarView,
			final PlaceController placeController) {
		super();

		this.placeController = placeController;
		this.navBarView = navBarView;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.navBarView.setPresenter(this);
		panel.setWidget(this.navBarView);
	}

	/**
	 * Lien Accueil
	 */
	// public void onAccueil() {
	// this.placeController.goTo();
	// }

	/**
	 * Lien Aide à la Décision
	 */
	// public void onAideDecision() {
	// this.placeController.goTo();
	// }

	/**
	 * Lien Aide Choix Support
	 */
	// public void onChoixSupport() {
	// this.placeController.goTo();
	// }

	/**
	 * Lien Eval Capital à Terme
	 */
	// public void onCapitalATerme() {
	// this.placeController.goTo();
	// }
}
