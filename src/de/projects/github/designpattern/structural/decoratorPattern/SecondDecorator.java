package de.projects.github.designpattern.structural.decoratorPattern;

/**
 * 
 * @author Peter Gessler
 * @description Implementierung des zweiten Dekorierers.
 * 				Der Konstruktor übergibt das Objekt vom Typ IComponent
 * 				an die Basisklasse.
 * 
 * 				operation() ruft die Methode operation() vom Objekt
 * 				iComp auf und addiert 3.
 *
 */
public class SecondDecorator extends AComponentDecorator{

	public SecondDecorator(IComponent iComp) {
		super(iComp);
	}

	@Override
	public int operation() {
		
		return iComp.operation() + 3;
	}

	
}
