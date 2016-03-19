package de.projects.github.designpattern.behavioral.strategyPattern;

public class BehaviourOne implements IStrategy {

	@Override
	public String doBehavior() {
		
		String retVal = "You choose strategy BehaviourOne";
		
		return retVal;
	}

}
