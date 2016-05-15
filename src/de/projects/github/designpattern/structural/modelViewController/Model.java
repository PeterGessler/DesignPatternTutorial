package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Modell zum verwalten der Daten.
 *
 */
public class Model {

	IView view;
	String modelName;
	
	public Model(IView view) {
		this.view = view;
	}
	
	
	public void addModelName(String modelName){
		
		this.modelName = modelName;
		notifyListeners();
	}
	
	
	private void notifyListeners() {
		view.notifyView("Der neue Model Name ist " + modelName);
	}

}
