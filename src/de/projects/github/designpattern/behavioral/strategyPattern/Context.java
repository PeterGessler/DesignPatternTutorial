package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Kontroll-Objekt zum setzen und ausf�hren der
 * 				aktuellen Strategie.
 *
 */
public class Context {

	private IStrategy strategy;

	// Konstruktor um Context Objekt zu erstellen
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	// Ausf�hren vom gew�hlten Verhalten bei der Erstellung von Context
	public String executeBehavior() {
		return strategy.doBehavior();
	}
	
	// setzen einer anderen Strategie
	public void setStrategy(IStrategy newStrategy) {
		this.strategy = newStrategy;
	}
}
