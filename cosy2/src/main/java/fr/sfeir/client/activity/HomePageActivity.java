package fr.sfeir.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

import fr.sfeir.client.place.EspaceClientPlace;

public class HomePageActivity extends AbstractActivity {

	/**
	 * passive view
	 * 
	 * @author kader
	 * 
	 */
	public interface IHomePageView extends IsWidget {
		void setPresenter(HomePageActivity presenter);

		TextBox getUserBox();

		PasswordTextBox getPassBox();
	}

	private final IHomePageView homePageView;
	private final PlaceController placeController;
		
	@Inject
	public HomePageActivity(final IHomePageView homePageView,
			final PlaceController placeController ) {
		super();
		this.homePageView = homePageView;
		this.placeController = placeController;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		this.homePageView.setPresenter(this);
		panel.setWidget(this.homePageView);
	}

	/**
	 * connecter l'utilisateur à l'pplication
	 * 
	 * 
	 * @param event
	 */
	public void connect(ClickEvent event) {
		placeController.goTo(new EspaceClientPlace());
	}
	
	/**
	 * reset fields 
	 * @param event
	 */
	public void reset(ClickEvent event) {
		this.homePageView.getUserBox().setText("");
		this.homePageView.getPassBox().setText("");
	}
}
