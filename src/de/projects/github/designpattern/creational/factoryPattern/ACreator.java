package de.projects.github.designpattern.creational.factoryPattern;

/**
 * 
 * @author Peter Gessler
 * @description Abstrakte Klasse ACreator zur Erzeugung eines konkreten
 * 				Produktes sowie festlegen weiterer Produkteigenschaften
 * 				und Rückgabe des konkreten Produktes.
 *
 */
public abstract class ACreator {

	public AProduct createProduct() {
		
		AProduct product = factoryMethod();
		
		// allgemeiner Produktherstellungsprozess
		product.setState(23);
		product.prepare();
		return product;
	}
	
	protected abstract AProduct factoryMethod();
}
