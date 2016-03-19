package de.projects.github.designpattern.creational.factoryPattern;

public class ConcreteCreatorB extends ACreator{

	@Override
	protected AProduct factoryMethod() {

		ConcreteProductB concProd = new ConcreteProductB();
		return concProd;
	}

}
