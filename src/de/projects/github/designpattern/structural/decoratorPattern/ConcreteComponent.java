package de.projects.github.designpattern.structural.decoratorPattern;

/**
 * 
 * @author Peter Gessler
 * @description Implementierung einer Hauptkomponente, welche dekoriert werden kann.
 *
 */
public class ConcreteComponent implements IComponent{

	@Override
	public int operation() {

		return 1;
	}

}
