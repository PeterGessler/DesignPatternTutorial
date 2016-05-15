package de.projects.github.designpattern.behavioral.observerPattern.pull;

/**
 * 
 * @author Peter Gessler
 * @description Schnittstelle Observer Pattern pull-Modell
 * 				Jede Klasse vom Typ IObserver hat seinen eindeutigen
 * 				Namen wiederzugeben sowie eine entsprechende Behandlung
 * 				bei der Zustandsänderung vom Subject durchzuführen. 
 *
 */
public interface IObserver {

	public String getObserverName();
	
	public void notifyObserver();
	
}
