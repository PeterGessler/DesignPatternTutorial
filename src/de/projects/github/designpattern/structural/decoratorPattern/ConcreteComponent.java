package de.projects.github.designpattern.structural.decoratorPattern;

/*
 * Implementierung einer konkreten Komponente welche es zu dekorieren gibt.
 */
public class ConcreteComponent implements IComponent{

	@Override
	public void operation() {
		System.out.println("I'm an concrete component");		
	}

}
