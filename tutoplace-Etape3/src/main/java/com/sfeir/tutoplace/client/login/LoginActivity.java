package com.sfeir.tutoplace.client.login;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class LoginActivity extends AbstractActivity {
	
	public interface LoginView extends IsWidget {
		
	}
	
	private LoginView loginView = new LoginViewImpl();

	public void start(AcceptsOneWidget display, EventBus eventBus) {
		display.setWidget(loginView);
	}
}
