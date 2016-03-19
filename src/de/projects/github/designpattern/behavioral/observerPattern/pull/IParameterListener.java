package de.projects.github.designpattern.behavioral.observerPattern.pull;

public interface IParameterListener {

	public String getObserverName();
	
	public void notifyListener();
	
}
