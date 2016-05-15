package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Schnittstelle für alle Beobachter.
 *
 */
public interface IView {

	public void notifyView(String param);
}
