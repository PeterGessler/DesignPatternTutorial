package de.projects.github.designpattern.behavioral.observerPattern.obsInJava;

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
 * 				Java-Implementierung:
 * 				Das Observer-Pattern wurde bereits in die Java Bibliothek mit aufgenommen.
 * 				Ein beobachtbares Subject erbt dabei die Klasse Observable. Mit notifyObservers(value)
 * 				werden alle angemeldeten Observer benachrichtigt wenn vorher setChanged()
 * 				aufgerufen wurde. Die Beobachter implementieren die Schnittstelle Observer
 * 				und erhalten dadurch public void update(Observable o, Object arg).
 * 				o - beobachtetes Objekt
 * 				arg - veränderter Wert welcher bei notifyObservers(value) übergeben wurde
 * 
 * 				Zu beachten:
 * 				- Subject kann durch extends Observable keine andere Implementierungsklasse erben
 * 				- Übergabeparameter arg benötigt eventuell typcast
 * 				- Benachrichtigungen an die Objekte erfolgt entgegengesetzt zur Anmeldungsreihenfolge
 */

import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		
		Observer observerOne = new ObserverOne();
		Observer observerTwo = new ObserverTwo();
		Subject subject = new Subject();
		
		subject.addObserver(observerOne);
		subject.tellMessage();
		System.out.println("------------------------");
		
		subject.addObserver(observerTwo);
		subject.tellMessage();
		System.out.println("------------------------");
		
		// ein erneutes Hinzufüger wird in der Java Implementierung
		// von Observer verworfen
		subject.addObserver(observerOne);
		subject.tellMessage();
		System.out.println("------------------------");
	}
}
