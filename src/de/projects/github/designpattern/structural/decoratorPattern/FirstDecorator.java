package de.projects.github.designpattern.structural.decoratorPattern;

/**
 * 
 * @author Peter Gessler
 * @description Implementierung des zweiten Dekorierers.
 * 				Der Konstruktor übergibt das Objekt vom Typ IComponent
 * 				an die Basisklasse.
 * 
 * 				operation() ruft die Methode operation() vom Objekt
 * 				iComp auf und addiert 2.
 *
 */
public class FirstDecorator extends AComponentDecorator{

	public FirstDecorator(IComponent iComp) {
		super(iComp);
	}

	@Override
	public int operation() {
		
		return iComp.operation() + 2;
	}
	
	

	
}
