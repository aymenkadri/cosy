package fr.sfeir.client.gin;

import com.google.common.collect.ImmutableMap;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import fr.sfeir.client.activity.EspaceClientActivity;
import fr.sfeir.client.activity.HomePageActivity;
import fr.sfeir.client.activity.SituationEncoursActivity;
import fr.sfeir.client.activity.EspaceClientActivity.IEspaceClientView;
import fr.sfeir.client.activity.HomePageActivity.IHomePageView;
import fr.sfeir.client.activity.NavBarActivity;
import fr.sfeir.client.activity.NavBarActivity.INavBarView;
import fr.sfeir.client.activity.SituationEncoursActivity.ISituationEncoursView;
import fr.sfeir.client.layout.MainLayoutView;
import fr.sfeir.client.layout.NavBarView;
import fr.sfeir.client.place.EspaceClientPlace;
import fr.sfeir.client.place.HomePagePlace;
import fr.sfeir.client.place.SituationEncoursPlace;
import fr.sfeir.client.ui.client.EspaceClientView;
import fr.sfeir.client.ui.enCours.SituationEncoursView;
import fr.sfeir.client.ui.home.HomePageView;

@SuppressWarnings("deprecation")
public class GwtModule extends AbstractGinModule {

	/**
	 * Identify all places in the application
	 */
	@WithTokenizers({ HomePagePlace.Tokenizer.class, EspaceClientPlace.Tokenizer.class, SituationEncoursPlace.Tokenizer.class })
	public static interface AppHistoryMapper extends PlaceHistoryMapper {
	}

	@Override
	protected void configure() {
		// bind EventBus and PlaceHistoryMapper
		bind(PlaceHistoryMapper.class).to(AppHistoryMapper.class).in(
				Singleton.class);
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(Place.class).to(HomePagePlace.class);
		bind(MainLayoutView.class).in(Singleton.class);

		// bind view
		bind(INavBarView.class).to(NavBarView.class).in(Singleton.class);
		bind(IHomePageView.class).to(HomePageView.class).in(Singleton.class);
		
		bind(IEspaceClientView.class).to(EspaceClientView.class).in(Singleton.class);
		bind(ISituationEncoursView.class).to(SituationEncoursView.class).in(Singleton.class);
		
		// bind Activity
		bind(HomePageActivity.class);
		bind(NavBarActivity.class);
		bind(EspaceClientActivity.class);
		bind(SituationEncoursActivity.class);
	}

	// bind ActivityMapper
	@Provides
	@Singleton
	ActivityMapper provideActivityMapper(final HomePageActivity homePageActivity,
			final EspaceClientActivity espaceClientActivity, 
			final SituationEncoursActivity situationEncoursActivity) {

		return new ActivityMapper() {
			private ImmutableMap<Class<? extends Place>, Activity> map = new ImmutableMap.Builder<Class<? extends Place>, Activity>()
			.put(HomePagePlace.class, homePageActivity)
			.put(EspaceClientPlace.class, espaceClientActivity)
			.put(SituationEncoursPlace.class, situationEncoursActivity)
			.build();

			@Override
			public Activity getActivity(Place place) {
				Activity activity = map.get(place.getClass());
				return activity;
			}
		};
	}

	@Provides
	@Inject
	IsWidget provideLayout(MainLayoutView layout) {
		return layout;
	}

	// bind placeController
	@Provides
	@Singleton
	PlaceController providePlaceController(EventBus eventBus) {
		return new PlaceController(eventBus);
	}

	@Provides
	@Singleton
	PlaceHistoryHandler provideHistoryHandler(final EventBus eventBus,
			final PlaceHistoryMapper historyMapper, final Place defaultPlace,
			final PlaceController placeController,
			final ActivityMapper activityMapper, final MainLayoutView layout,
			final NavBarActivity navBareActivity) {

		// Main container

		final ActivityManager activityManager = new ActivityManager(
				activityMapper, eventBus);
		activityManager.setDisplay(layout.getCenterContainer());
		final PlaceHistoryHandler placeHistoryHandler = new PlaceHistoryHandler(
				historyMapper);

		// NavBar
		final ActivityManager activityNavManager = new ActivityManager(
				new ActivityMapper() {

					@Override
					public Activity getActivity(Place place) {
						if(place instanceof HomePagePlace){
							return null;
						}
						return navBareActivity;	
					}
				}, eventBus);

		activityNavManager.setDisplay(layout.getNavBar());
		placeHistoryHandler.register(placeController, eventBus, defaultPlace);
		return placeHistoryHandler;
	}
}
