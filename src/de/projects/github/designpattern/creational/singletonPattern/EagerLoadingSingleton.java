package de.projects.github.designpattern.creational.singletonPattern;

/**
 * 
 * @author Peter Gessler
 *
 *         Eager Loading - vorgezogenes Instanziieren. Objekterstellung findet
 *         beim Laden der Klasse statt.
 * 
 *         Vorteil: 
 *         + Einfachheit 
 *         + Threadsicherheit 
 *         + Performance
 * 
 *         Nachteil: 
 *         - verfr�hte Instanziierung 
 *         - evtl. unn�tige Instanziierung
 *         - ben�tigte Werte von anderen Objekten evtl. bei Instanziierung noch
 *         nicht verf�gbar
 */

public class EagerLoadingSingleton {

	private static final EagerLoadingSingleton instance = new EagerLoadingSingleton();

	private EagerLoadingSingleton() {

		// Konstruktor in dem weitere Ojekte erzeugt oder deren Methoden
		// aufgerufen werden k�nnen
	}

	// Aufzurufende Methode um Singleton Objekt zu erhalten
	public static EagerLoadingSingleton getInstance() {
		return instance;
	}
	
	// Methode die �ber das Singleton aufgerufen werden kann
	public void eagerMethod() {
		
		System.out.println("Hier wird die Methode aus der EagerLoadingSingleton Klasse ausgef�hrt");
		
	}
}
