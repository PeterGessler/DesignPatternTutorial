package de.projects.github.designpattern.behavioral.observerPattern.push;

public class ObserverOne implements IObserver{

	private Subject controller;

	public ObserverOne(Subject parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {

		return "ObserverOne";
	}

	@Override
	public void notifyObserver(String parameter) {

		System.out.println(parameter);
	}

}
