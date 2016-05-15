package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Strategie 3
 *
 */
public class BehaviourThree implements IStrategy {

	@Override
	public String doBehavior() {

		String retVal = "You choose strategy BehaviourThree";

		return retVal;
	}

}
