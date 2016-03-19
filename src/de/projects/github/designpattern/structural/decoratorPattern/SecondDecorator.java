package de.projects.github.designpattern.structural.decoratorPattern;

/*
 * Implementierung vom zweiten Dekorator.
 */
public class SecondDecorator extends AComponentDecorator{

	public SecondDecorator(IComponent cComp) {
		super(cComp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		cComp.operation();
		System.out.println("I'm the second decorator!");
		
	}

	
}
