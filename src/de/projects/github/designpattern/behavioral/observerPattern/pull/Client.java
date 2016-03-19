package de.projects.github.designpattern.behavioral.observerPattern.pull;

public class Client {

	private static ParameterController parameterController;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parameterController = new ParameterController();
		
		ObserverValueOne observerValueOne = new ObserverValueOne(parameterController);
		ObserverValueTwo observerValueTwo = new ObserverValueTwo(parameterController);
		
	}

}
