package de.projects.github.designpattern.creational.singletonPattern;

public class PatternClient {

	public static void main(String[] args) {

		// Ausf�hren der EagerLoadingSingleton Methode
		EagerLoadingSingleton.getInstance().eagerMethod();
		
		// Ausf�hren der LazyLoadingSingleton Methode
		LazyLoadingSingleton.getInstance().lazyMethod();

	}

}
