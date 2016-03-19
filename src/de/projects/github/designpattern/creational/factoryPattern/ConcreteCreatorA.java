package de.projects.github.designpattern.creational.factoryPattern;

public class ConcreteCreatorA extends ACreator {

	@Override
	protected AProduct factoryMethod() {

		ConcreteProductA concProd = new ConcreteProductA();
		return concProd;
	}

}
