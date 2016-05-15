package de.projects.github.designpattern.creational.factoryPattern;

/**
 * 
 * @author Peter Gessler
 * @description Abstraktes Produkt welches die Methoden und Eigenschaften eines
 * 				konkreten Produktes darstellt.
 *
 */
public abstract class AProduct {

	private int basisState;
	
	public void prepare() {
		System.out.println("Preparing general Product!");
	}
	
	public void setState(int pState) {
		basisState = pState;
	}
	
	public int getState() {
		return basisState;
	}
	
	public abstract int getPrice();
}
