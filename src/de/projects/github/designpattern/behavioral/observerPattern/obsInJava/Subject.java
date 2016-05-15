package de.projects.github.designpattern.behavioral.observerPattern.obsInJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

/**
 * 
 * @author Peter Gessler
 * @description Subject ist das beobachtbare Objekt und benachrichtigt Beobachter.
 * 				Erst durch den Aufruf von setChanged() wird notifyObservers ausgeführt.
 *
 */
public class Subject extends Observable{

	private static final List<String> messages = Arrays.asList(
			"Das ist die erste Nachricht.", 
			"Sie ist sehr einfallsreich.",
			"Mehr muss hier auch nicht stehen."
			);
	
	
	public void tellMessage() {
		
		setChanged();
		Collections.shuffle(messages);
		notifyObservers(messages.get(0));
	}
}
