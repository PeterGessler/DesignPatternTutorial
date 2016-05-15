package de.projects.github.designpattern.creational.singletonPattern;

/**
 * 
 * @author Peter Gessler
 * @description Mit dem Singleton Pattern erstellen wir ein Objekt
 * 				welches global verfügbar ist. Des Weiteren wird sicher gestellt,
 * 				dass zur Laufzeit nur eine Instanz dieser Klasse existiert. 
 * 
 * 				Die Vor- und Nachteile können in den entsprechenden Klassen
 * 				nachgelesen werden. 
 *
 */
public class PatternClient {

	public static void main(String[] args) {

		// Ausführen der EagerLoadingSingleton Methode
		EagerLoadingSingleton.getInstance().eagerMethod();
		
		// Ausführen der LazyLoadingSingleton Methode
		LazyLoadingSingleton.getInstance().lazyMethod();
		
		// Ausführen der SyncLazyLoadingSingleton Methode
		SyncLazyLoadingSingleton.getInstance().syncLazyMethod();
	}

}
