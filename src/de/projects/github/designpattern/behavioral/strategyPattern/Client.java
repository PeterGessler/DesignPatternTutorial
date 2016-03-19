package de.projects.github.designpattern.behavioral.strategyPattern;

public class Client {

	public static void main(String[] args) {

		// Initialisierung der aktuellen Strategie sowie Zuweisung
		IStrategy currentStrategy = new BehaviourOne();
		
		// Erstellung und Übergabe von aktueller Strategie an ein
		// Context Objekt
		Context context = new Context(currentStrategy);
		
		// Ausgabe von der gewählten Strategie
		System.out.println(context.executeBehavior());
		
		context.setStrategy(new BehaviourThree());
		
		// Ausgabe von der gewählten Strategie
		System.out.println(context.executeBehavior());
		
		// Überschreiben von aktueller Strategie mit Verhalten2
		currentStrategy = new BehaviourTwo();
		
		// setzen der neuen Strategie im Context Objekt
		context.setStrategy(currentStrategy);
		
		// Ausgabe von der gewählten Strategie
		System.out.println(context.executeBehavior());

	}

}
