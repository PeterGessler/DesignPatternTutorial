package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Controller f�hrt Befehle der View aus und arbeitet
 * 				die erhaltenen Daten f�r das Modell auf.
 *
 */
public class Controller {

	private Model model;

	public void setModel(Model model) {
		this.model = model;		
	}
	
	public void setModelName(String param) {
		
		// hier k�nnten weitere Verarbeitungsschritte stattfinden
		model.addModelName(param);
	}

}
