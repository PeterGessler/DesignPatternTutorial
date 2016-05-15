package de.projects.github.designpattern.behavioral.observerPattern.pull;

public class ObserverTwo implements IObserver {

	private Subject controller;

	public ObserverTwo(Subject parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {
		// TODO Auto-generated method stub
		return "ObserverValueTwo";
	}

	@Override
	public void notifyObserver() {

		showParameter();
	}

	private void showParameter() {
		System.out.println(controller.getParameterTwo());
		
	}

}
