package de.projects.github.designpattern.behavioral.observerPattern.push;

interface IParameterListener {

	public String getObserverName();
	
	public void notifyListener (String parameter);
}
