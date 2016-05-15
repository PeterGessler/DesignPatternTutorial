package de.projects.github.designpattern.creational.factoryPattern;

/**
 * 
 * @author Peter Gessler
 * @description Klasse ConcreteCreatorA ist von der Basisklasse ACreator
 * 				abgeleitet und besitzt somit die Methode createProduct().
 * 				In dieser wird ein AProdukt vom Typ ConcreteProductA
 * 				beim Aufruf der factoryMethod erzeugt und die entsprechenden
 * 				Werte gesetzt.
 *
 */
public class ConcreteCreatorA extends ACreator {

	@Override
	protected AProduct factoryMethod() {

		ConcreteProductA concProd = new ConcreteProductA();
		return concProd;
	}

}
