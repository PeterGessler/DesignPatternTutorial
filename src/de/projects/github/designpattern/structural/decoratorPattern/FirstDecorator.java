package de.projects.github.designpattern.structural.decoratorPattern;

/*
 * Implementierung vom ersten Dekorator.
 */
public class FirstDecorator extends AComponentDecorator{

	public FirstDecorator(IComponent cComp) {
		super(cComp);
	}

	@Override
	public void operation() {
		cComp.operation();
		System.out.println("I'm the first decorator!");
		
	}
	
	

	
}
