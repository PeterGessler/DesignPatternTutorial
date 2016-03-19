package de.projects.github.designpattern.creational.factoryPattern;

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
