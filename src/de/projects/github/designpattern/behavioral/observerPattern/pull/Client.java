package de.projects.github.designpattern.behavioral.observerPattern.pull;

/**
 * 
 * @author Peter Gessler
 * @description Ziel des Observer Patterns ist die Entkopplung von einem Objekt(Subject),
 * 				welches andere Objekte über seinen Zustand benarichtigen möchte.
 * 				Das Objekt(Subject) soll dabei keine direkte Referenzen auf die anderen
 * 				Objekte besitzen.
 * 				Die Beobachter(Observer) melden sich dazu beim Objekt(Subjekt) an und 
 * 				werden benachrichtigt, sobald eine Zustandsänderung vorliegt. 
 * 				Eine Zuständsänderung kann dabei bspw. die Änderung eines Wertes sein.
 * 				Die Übertragung des Wertes an die Beobachter ist abhängig von der
 * 				verwendeten Variante. 
 * 
 * 				Varianten: push-Modell und pull-Modell
 * 
 * 				Pull-Modell:
 * 				Wird eine Zustandsänderung vom Objekt(Subject) bekannt gegeben,
 * 				interessieren sich die Beobachter eventuell für unterschiedliche Werte.
 * 				Ein Observer bekommt nur die Nachricht, dass sich etwas geändert hat.
 *				Anschließend erfolgt die Abfrage des Wertes am Subject selbst. 
 *
 */

public class Client {

	private static Subject subject;
	
	public static void main(String[] args) {

		// Subject erzeugen
		subject = new Subject();
		
		// Erzeugung von Beobachtern sowie Übergabe vom subject
		ObserverOne observereOne = new ObserverOne(subject);
		ObserverTwo observerTwo = new ObserverTwo(subject);
		
	}

}
