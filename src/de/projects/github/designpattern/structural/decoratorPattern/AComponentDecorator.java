package de.projects.github.designpattern.structural.decoratorPattern;

/**
 * 
 * @author Peter Gessler
 * @description AComponentDecorator stellt die abstrakte Klasse zum halten
 * 				eines Objekts vom Typ IComponent dar. Dadurch l�sst
 * 				sich eine Hauptkomponente mit mehreren Dekorieren verschachteln.
 * 
 * 				Aufruf-Bsp. im Client: new FirstDecorator (new ConcreteComponent());
 *
 */
public abstract class AComponentDecorator implements IComponent{

	IComponent iComp;
	
	// Konstruktor erh�lt Objekt vom Typ IComponent
	protected AComponentDecorator(IComponent iComp) {
		this.iComp = iComp;
	}
	
}
