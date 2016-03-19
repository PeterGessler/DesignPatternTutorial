package de.projects.github.designpattern.behavioral.strategyPattern;

public class BehaviourTwo implements IStrategy {

	@Override
	public String doBehavior() {

		String retVal = "You choose strategy BehaviourTwo";

		return retVal;
	}

}
