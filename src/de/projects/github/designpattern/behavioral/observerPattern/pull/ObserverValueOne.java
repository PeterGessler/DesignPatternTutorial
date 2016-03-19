package de.projects.github.designpattern.behavioral.observerPattern.pull;

public class ObserverValueOne implements IParameterListener {

	private ParameterController controller;

	public ObserverValueOne(ParameterController parameterController) {
		this.controller = parameterController;
		
		controller.addParameterListener(this);
	}

	@Override
	public String getObserverName() {
		// TODO Auto-generated method stub
		return "ObserverValueOne";
	}

	@Override
	public void notifyListener() {

		showParameter();
	}

	private void showParameter() {
		
		System.out.println(controller.getParameterOne());
		
	}

}
