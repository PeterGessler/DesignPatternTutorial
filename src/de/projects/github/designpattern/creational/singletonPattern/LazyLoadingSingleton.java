package de.projects.github.designpattern.creational.singletonPattern;

/**
 * 
 * @author Peter Gessler
 * 
 *         Lazy Loading - verz�gerte Instanziierung. Singleton wird beim ersten
 *         Aufruf von getInstance() erzeugt.
 * 
 *         Vorteil: 
 *         + Einsparung von Ressourcen wenn Singleton nicht ben�tigt
 *         wird 
 *         + Instanziierung kann in Abh�ngigkeit von verwendeten Werten
 *         gestellt werden
 *         
 *         Nachteil:
 *         - durch Multithreading kann es zu mehreren Instanzen kommen
 *
 */
public class LazyLoadingSingleton {

	private static LazyLoadingSingleton instance;

	private LazyLoadingSingleton() {

		// Konstruktor in dem weitere Ojekte erzeugt oder deren Methoden
		// aufgerufen werden k�nnen
	}

	// Aufzurufende Methode um Singleton Objekt zu erhalten
	public static LazyLoadingSingleton getInstance() {

		if (instance == null) {
			// Erzeugung vom Objekt
			instance = new LazyLoadingSingleton();
		}

		return instance;
	}
	
	// Methode die �ber das Singleton aufgerufen werden kann
	public void lazyMethod() {
		
		System.out.println("Hier wird die Methode aus der LazyLoadingSingleton Klasse ausgef�hrt");
		
	}
}
