package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Das Strategy Pattern ermöglicht eine Verhaltensänderung
 * 				(Änderung vom verwendeten Algorithmus) des Clients zur
 * 				Laufzeit. Es spielt dabei für den Client keine Rolle,
 * 				wie die Implementierung vom Verhalten aussieht.
 * 				Der Client legt lediglich den zu verwendenen Algorithmus
 * 				fest.
 *
 */
public class Client {

	public static void main(String[] args) {

		// Initialisierung der aktuellen Strategie sowie Zuweisung
		IStrategy currentStrategy = new BehaviourOne();
		
		// Erstellung und Übergabe von aktueller Strategie an ein
		// Kontroll-Objekt
		Context context = new Context(currentStrategy);
		
		// Ausführung von der gewählten Strategie
		System.out.println(context.executeBehavior());
		
		// setzen von neuer Strategie ohne aktuelle
		// Client Strategie zu überschreiben
		context.setStrategy(new BehaviourThree());
		
		// Ausführung von der gewählten Strategie
		System.out.println(context.executeBehavior());
		
		// Überschreiben von aktueller Strategie mit Verhalten2
		currentStrategy = new BehaviourTwo();
		
		// setzen der neuen Strategie im Kontroll-Objekt
		context.setStrategy(currentStrategy);
		
		// Ausführung von der gewählten Strategie
		System.out.println(context.executeBehavior());

	}

}
