package de.projects.github.designpattern.behavioral.observerPattern.push;

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
 * 				Push-Modell:
 * 				Liegt eine Zustandsänderung beim Subject vor, wird diese den
 * 				Beobachtern mitgeteilt. Das Subject übergibt dabei den veränderten
 * 				Wert an alle Beobachter.
 *
 */

public class Client {

	public static void main(String[] args) {

		Subject subject = new Subject();
		
		ObserverOne observerValueOne = new ObserverOne(subject);
		ObserverTwo observerValueTwo = new ObserverTwo(subject);

	}

}
