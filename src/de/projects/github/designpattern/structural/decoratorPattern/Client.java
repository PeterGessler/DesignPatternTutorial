package de.projects.github.designpattern.structural.decoratorPattern;

public class Client {

	public static void main(String[] args) {
		
		/*
		 * Struktur aufbauen
		 */
		
		IComponent cComp = new ConcreteComponent();
		cComp.operation();
		
		System.out.println("---------------------------");
		
		IComponent fDeco = new FirstDecorator(cComp);
		fDeco.operation();
		
		System.out.println("---------------------------");
		
		IComponent sDeco = new SecondDecorator(fDeco);
		sDeco.operation();
		
		System.out.println("-----------Test------------");
		
		IComponent t1Deco = new FirstDecorator(new SecondDecorator(null));
		t1Deco.operation();

		
	}
}
