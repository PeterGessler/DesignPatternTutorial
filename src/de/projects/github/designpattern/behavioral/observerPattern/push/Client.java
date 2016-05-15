package de.projects.github.designpattern.behavioral.observerPattern.push;

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
 * 				Push-Modell:
 * 				Liegt eine Zustands�nderung beim Subject vor, wird diese den
 * 				Beobachtern mitgeteilt. Das Subject �bergibt dabei den ver�nderten
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
