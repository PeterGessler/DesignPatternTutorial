package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Strategie 2
 *
 */
public class BehaviourTwo implements IStrategy {

	@Override
	public String doBehavior() {

		String retVal = "You choose strategy BehaviourTwo";

		return retVal;
	}

}
