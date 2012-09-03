package com.sfeir.tutoplace.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.sfeir.tutoplace.client.login.LoginPlace;


@WithTokenizers({LoginPlace.Tokenizer.class})
public interface MonPlaceHistoryMapper extends PlaceHistoryMapper{

}
