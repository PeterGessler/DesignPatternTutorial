package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Controller führt Befehle der View aus und arbeitet
 * 				die erhaltenen Daten für das Modell auf.
 *
 */
public class Controller {

	private Model model;

	public void setModel(Model model) {
		this.model = model;		
	}
	
	public void setModelName(String param) {
		
		// hier könnten weitere Verarbeitungsschritte stattfinden
		model.addModelName(param);
	}

}
