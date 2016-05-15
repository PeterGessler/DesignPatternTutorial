package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Strategie 1
 *
 */
public class BehaviourOne implements IStrategy {

	@Override
	public String doBehavior() {
		
		String retVal = "You choose strategy BehaviourOne";
		
		return retVal;
	}

}
