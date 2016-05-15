package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Schnittstelle f�r alle Beobachter.
 *
 */
public interface IView {

	public void notifyView(String param);
}
