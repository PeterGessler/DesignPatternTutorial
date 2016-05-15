package de.projects.github.designpattern.behavioral.observerPattern.pull;

public class ObserverOne implements IObserver {

	private Subject controller;

	public ObserverOne(Subject parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {
		// TODO Auto-generated method stub
		return "ObserverValueOne";
	}

	@Override
	public void notifyObserver() {

		showParameter();
	}

	private void showParameter() {
		
		System.out.println(controller.getParameterOne());
		
	}

}
