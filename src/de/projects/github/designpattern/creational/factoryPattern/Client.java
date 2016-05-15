package de.projects.github.designpattern.creational.factoryPattern;

/**
 * 
 * @author Peter Gessler
 * @description Das Factory Method Pattern ermöglicht es, die Erzeugung von
 * 				Objekten an die Unterklasse zu delegieren.
 * 
 * 				Mit der Erzeugung von ConcreteCreatorA erzeugen wir eine
 * 				Unterklasse, welche in der zu überschreibenden Methode, aus
 * 				der Oberklasse, das konkrete Objekt erzeugt.
 * 				Durch den Methoden Aufruf in der Oberklasse  creator.createProduct()
 * 				wird das konkrete Objekt erzeugt und dessen Werte festgelegt.
 * 				Anschließend kann eine Abfrage der Objekt Eigenschaften bzw.
 * 				eine Weiterverarbeitung erfolgen.
 *
 */
public class Client {

	public static void main(String[] args) {
		ACreator creator = new ConcreteCreatorA();
		AProduct product = creator.createProduct();
		System.out.println(product.getPrice());
	}

}
