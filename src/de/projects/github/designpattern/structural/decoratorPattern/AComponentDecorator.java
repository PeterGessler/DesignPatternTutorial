package de.projects.github.designpattern.structural.decoratorPattern;

/*
 * Klasse dient zum halten der Komponente.
 */
public abstract class AComponentDecorator implements IComponent{

	IComponent cComp;
	
	protected AComponentDecorator(IComponent cComp) {
		this.cComp = cComp;
	}
	
}
