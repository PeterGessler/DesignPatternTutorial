package de.projects.github.designpattern.behavioral.strategyPattern;

/**
 * 
 * @author Peter Gessler
 * @description Das Strategy Pattern erm�glicht eine Verhaltens�nderung
 * 				(�nderung vom verwendeten Algorithmus) des Clients zur
 * 				Laufzeit. Es spielt dabei f�r den Client keine Rolle,
 * 				wie die Implementierung vom Verhalten aussieht.
 * 				Der Client legt lediglich den zu verwendenen Algorithmus
 * 				fest.
 *
 */
public class Client {

	public static void main(String[] args) {

		// Initialisierung der aktuellen Strategie sowie Zuweisung
		IStrategy currentStrategy = new BehaviourOne();
		
		// Erstellung und �bergabe von aktueller Strategie an ein
		// Kontroll-Objekt
		Context context = new Context(currentStrategy);
		
		// Ausf�hrung von der gew�hlten Strategie
		System.out.println(context.executeBehavior());
		
		// setzen von neuer Strategie ohne aktuelle
		// Client Strategie zu �berschreiben
		context.setStrategy(new BehaviourThree());
		
		// Ausf�hrung von der gew�hlten Strategie
		System.out.println(context.executeBehavior());
		
		// �berschreiben von aktueller Strategie mit Verhalten2
		currentStrategy = new BehaviourTwo();
		
		// setzen der neuen Strategie im Kontroll-Objekt
		context.setStrategy(currentStrategy);
		
		// Ausf�hrung von der gew�hlten Strategie
		System.out.println(context.executeBehavior());

	}

}
