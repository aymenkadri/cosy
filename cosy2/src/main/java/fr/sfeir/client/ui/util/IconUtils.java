package fr.sfeir.client.ui.util;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;

import fr.sfeir.client.resources.img.ImagesResource;

public  class IconUtils {
	static ImagesResource images;
	static{
		images = GWT.create(ImagesResource.class);
	}
	
	
	public IconUtils() {
		super();
	}
	
	public static SafeHtml getDeleteIcon(){
		return SafeHtmlUtils.fromSafeConstant("<img  style=\"cursor:default;\" src=\""+ images.delete().getSafeUri().asString()	+ "\" alt=\"Supprimer un élément \" title=\"Supprimer un élément\" />");
	}
	
	public static SafeHtml getDetailIcon(){
		return SafeHtmlUtils.fromSafeConstant("<img  style=\"cursor:default;\" src=\""+ images.pencil_go().getSafeUri().asString() + "\" alt=\"Voir le détail \" title=\"Voir le détail\" />");
	}
	
	public static SafeHtml getAddElementIcon(){
		return SafeHtmlUtils.fromSafeConstant("<img  style=\"cursor:default;\" src=\""+ images.add().getSafeUri().asString() + "\" alt=\"Ajouter un nouveau élèment \" title=\"Ajouter un nouveau élèment\" />");
	}
	
	public static SafeHtml getMessageEmptyForCellTable(){
		return SafeHtmlUtils.fromSafeConstant("<span  style=\"background:#F3F7FB;\">Aucune résultat correpondant à votre recherche  </>");
	}
	
}
