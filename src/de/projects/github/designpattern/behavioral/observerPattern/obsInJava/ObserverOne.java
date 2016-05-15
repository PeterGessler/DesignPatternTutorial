package de.projects.github.designpattern.behavioral.observerPattern.obsInJava;

import java.util.Observable;
import java.util.Observer;

public class ObserverOne implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("ObserverOne bekommt Nachricht: " + arg);		
	}

}
