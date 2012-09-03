package com.sfeir.tutoplace.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.tutoplace.client.login.LoginActivity.LoginView;

public class LoginViewImpl extends Composite implements LoginView {

	private static LoginViewImplUiBinder uiBinder = GWT
			.create(LoginViewImplUiBinder.class);

	@UiField
	Button avancer;
	
	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {
	}

	public LoginViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HasClickHandlers getButton() {
		return avancer;
	}
	
	

}
