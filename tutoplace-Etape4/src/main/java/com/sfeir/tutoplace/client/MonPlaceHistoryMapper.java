package com.sfeir.tutoplace.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.tutoplace.client.accueil.AccueilActivity;
import com.sfeir.tutoplace.client.accueil.AccueilPlace;
import com.sfeir.tutoplace.client.login.LoginPlace;


@WithTokenizers({LoginPlace.Tokenizer.class, AccueilPlace.Tokenizer.class})
public interface MonPlaceHistoryMapper extends PlaceHistoryMapper{

}
