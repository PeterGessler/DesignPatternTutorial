package de.projects.github.designpattern.behavioral.strategyPattern;

public class Client {

	public static void main(String[] args) {

		// Initialisierung der aktuellen Strategie sowie Zuweisung
		IStrategy currentStrategy = new BehaviourOne();
		
		// Erstellung und �bergabe von aktueller Strategie an ein
		// Context Objekt
		Context context = new Context(currentStrategy);
		
		// Ausgabe von der gew�hlten Strategie
		System.out.println(context.executeBehavior());
		
		context.setStrategy(new BehaviourThree());
		
		// Ausgabe von der gew�hlten Strategie
		System.out.println(context.executeBehavior());
		
		// �berschreiben von aktueller Strategie mit Verhalten2
		currentStrategy = new BehaviourTwo();
		
		// setzen der neuen Strategie im Context Objekt
		context.setStrategy(currentStrategy);
		
		// Ausgabe von der gew�hlten Strategie
		System.out.println(context.executeBehavior());

	}

}
