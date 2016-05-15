package de.projects.github.designpattern.behavioral.observerPattern.push;

interface IObserver {

	public String getObserverName();
	
	public void notifyObserver (String parameter);
}
