package de.projects.github.designpattern.creational.singletonPattern;

/**
 * 
 * @author Peter Gessler
 * @description Mit dem Singleton Pattern erstellen wir ein Objekt
 * 				welches global verf�gbar ist. Des Weiteren wird sicher gestellt,
 * 				dass zur Laufzeit nur eine Instanz dieser Klasse existiert. 
 * 
 * 				Die Vor- und Nachteile k�nnen in den entsprechenden Klassen
 * 				nachgelesen werden. 
 *
 */
public class PatternClient {

	public static void main(String[] args) {

		// Ausf�hren der EagerLoadingSingleton Methode
		EagerLoadingSingleton.getInstance().eagerMethod();
		
		// Ausf�hren der LazyLoadingSingleton Methode
		LazyLoadingSingleton.getInstance().lazyMethod();
		
		// Ausf�hren der SyncLazyLoadingSingleton Methode
		SyncLazyLoadingSingleton.getInstance().syncLazyMethod();
	}

}
