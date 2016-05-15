package de.projects.github.designpattern.behavioral.observerPattern.push;

public class ObserverTwo implements IObserver{

	private Subject controller;

	public ObserverTwo(Subject parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {

		return "ObserverTwo";
	}

	@Override
	public void notifyObserver(String parameter) {

		System.out.println(parameter);
		
	}

}
