package de.projects.github.designpattern.behavioral.observerPattern.pull;

/**
 * 
 * @author Peter Gessler
 * @description Ziel des Observer Patterns ist die Entkopplung von einem Objekt(Subject),
 * 				welches andere Objekte �ber seinen Zustand benarichtigen m�chte.
 * 				Das Objekt(Subject) soll dabei keine direkte Referenzen auf die anderen
 * 				Objekte besitzen.
 * 				Die Beobachter(Observer) melden sich dazu beim Objekt(Subjekt) an und 
 * 				werden benachrichtigt, sobald eine Zustands�nderung vorliegt. 
 * 				Eine Zust�nds�nderung kann dabei bspw. die �nderung eines Wertes sein.
 * 				Die �bertragung des Wertes an die Beobachter ist abh�ngig von der
 * 				verwendeten Variante. 
 * 
 * 				Varianten: push-Modell und pull-Modell
 * 
 * 				Pull-Modell:
 * 				Wird eine Zustands�nderung vom Objekt(Subject) bekannt gegeben,
 * 				interessieren sich die Beobachter eventuell f�r unterschiedliche Werte.
 * 				Ein Observer bekommt nur die Nachricht, dass sich etwas ge�ndert hat.
 *				Anschlie�end erfolgt die Abfrage des Wertes am Subject selbst. 
 *
 */

public class Client {

	private static Subject subject;
	
	public static void main(String[] args) {

		// Subject erzeugen
		subject = new Subject();
		
		// Erzeugung von Beobachtern sowie �bergabe vom subject
		ObserverOne observereOne = new ObserverOne(subject);
		ObserverTwo observerTwo = new ObserverTwo(subject);
		
	}

}
