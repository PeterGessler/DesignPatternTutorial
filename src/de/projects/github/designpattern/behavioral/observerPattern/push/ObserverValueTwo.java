package de.projects.github.designpattern.behavioral.observerPattern.push;

public class ObserverValueTwo implements IParameterListener{

	private ParameterController controller;

	public ObserverValueTwo(ParameterController parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {
		// TODO Auto-generated method stub
		return "ObserverValueTwo";
	}

	@Override
	public void notifyListener(String parameter) {

		System.out.println(parameter);
		
	}

}
