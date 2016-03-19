package de.projects.github.designpattern.creational.singletonPattern;

public class PatternClient {

	public static void main(String[] args) {

		// Ausführen der EagerLoadingSingleton Methode
		EagerLoadingSingleton.getInstance().eagerMethod();
		
		// Ausführen der LazyLoadingSingleton Methode
		LazyLoadingSingleton.getInstance().lazyMethod();

	}

}
