package com.sfeir.tutoplace.client.menu;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.tutoplace.client.Main;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.auteur.accueil.AuteurAccueilPlace;
import com.sfeir.tutoplace.client.cosy.encours.EncoursPlace;
import com.sfeir.tutoplace.client.highcharts.charts.HighChartsPlace;
import com.sfeir.tutoplace.client.highcharts.piechart.PieChartsPlace;
import com.sfeir.tutoplace.client.produit.souscription.ProduitSouscriptionPlace;

public class Menu extends Composite {

	private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
	
	@UiField
	NavLink simulateur, home, demoFormList, chart, piechart, encours;

	interface MenuUiBinder extends UiBinder<Widget, Menu> {
	}

	public Menu() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("simulateur")
	public void clickSimulateur(ClickEvent event){
		Main.getPlaceController().goTo(new ProduitSouscriptionPlace());
	}
	@UiHandler("home")
	public void clickHome(ClickEvent event){
		Main.getPlaceController().goTo(new AccueilPlace());
	}	
	@UiHandler("demoFormList")
	public void clickDemoFormList(ClickEvent event){
		Main.getPlaceController().goTo(new AuteurAccueilPlace());
	}		
	@UiHandler("chart")
	public void clickChart(ClickEvent event){
		Main.getPlaceController().goTo(new HighChartsPlace());
	}		

	@UiHandler("piechart")
	public void clickPieChart(ClickEvent event){
		Main.getPlaceController().goTo(new PieChartsPlace());
	}		

	@UiHandler("encours")
	public void clickEncours(ClickEvent event){
		Main.getPlaceController().goTo(new EncoursPlace());
	}		

	
}
