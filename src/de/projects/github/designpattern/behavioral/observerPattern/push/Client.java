package de.projects.github.designpattern.behavioral.observerPattern.push;

public class Client {

	static ParameterController parameterController;
	
	public static void main(String[] args) {

		parameterController = new ParameterController();
		
		ObserverValueOne observerValueOne = new ObserverValueOne(parameterController);
		ObserverValueTwo observerValueTwo = new ObserverValueTwo(parameterController);

	}

}
