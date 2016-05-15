package de.projects.github.designpattern.behavioral.observerPattern.obsInJava;

import java.util.Observable;
import java.util.Observer;

public class ObserverTwo implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("ObserverTwo bekommt Nachricht: " + arg);	
	}

}
