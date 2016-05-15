package de.projects.github.designpattern.creational.singletonPattern;

/**
 * 
 * @author Peter Gessler
 * 
 *         Lazy Loading mit synchronized - verz�gerte Instanziierung. 
 *         Singleton wird beim ersten Aufruf von getInstance() erzeugt. 
 *         Andere Threads k�nnen nicht eintreten bei Initialisierung warten.
 * 
 *         Vorteil: 
 *         + Einsparung von Ressourcen wenn Singleton nicht ben�tigt
 *         wird 
 *         + Instanziierung kann in Abh�ngigkeit von verwendeten Werten
 *         gestellt werden
 * 
 *
 */
public class SyncLazyLoadingSingleton {

	private static SyncLazyLoadingSingleton instance;

	private SyncLazyLoadingSingleton() {

		// Konstruktor in dem weitere Ojekte erzeugt oder deren Methoden
		// aufgerufen werden k�nnen
	}

	// Aufzurufende Methode um Singleton Objekt zu erhalten
	public static SyncLazyLoadingSingleton getInstance() {

		if (instance == null) {

			// Eintritt eines zweiten Threads verhindern
			synchronized (instance) {
				if (instance == null) {
					// Erzeugung vom Objekt
					instance = new SyncLazyLoadingSingleton();
				}
			}

		}

		return instance;
	}

	// Methode die �ber das Singleton aufgerufen werden kann
	public void syncLazyMethod() {

		System.out
				.println("Hier wird die Methode aus der SyncLazyLoadingSingleton Klasse ausgef�hrt");

	}
}
