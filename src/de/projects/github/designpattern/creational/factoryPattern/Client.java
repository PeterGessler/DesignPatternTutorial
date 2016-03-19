package de.projects.github.designpattern.creational.factoryPattern;

public class Client {

	public static void main(String[] args) {
		ACreator creator = new ConcreteCreatorA();
		AProduct product = creator.createProduct();
		System.out.println(product.getPrice());
	}

}
