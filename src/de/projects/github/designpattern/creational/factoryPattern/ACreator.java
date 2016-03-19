package de.projects.github.designpattern.creational.factoryPattern;

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
