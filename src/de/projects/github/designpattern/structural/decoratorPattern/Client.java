package de.projects.github.designpattern.structural.decoratorPattern;

/**
 * 
 * @author Peter Gessler
 * @description Das DecoratorPattern dient zum "dekorieren" von Hauptobjekten.
 * 				Eine Dekoration kann bspw. die Erweiterung eines Wertes sein
 * 				(wie in diesem Modell dargestellt). Auch andere Erweiterungen sind
 * 				m�glich (siehe Sims - Person ankleiden).
 * 
 * 				Im ersten Schritt erzeugen wir uns eine Hauptkomponente, die IComponent
 * 				als Schnittstelle besitzt und die entsprechenden Operationen implementiert
 * 				(In unserem Fall operation()). 
 * 
 * 				Im zweiten Schritt dekorieren wir die
 * 				bereits vorhandene Komponente cComp mit dem ersten Decorator.
 * 				Die operation() Implementierung im ersten Decorator sieht wie folgt aus:
 * 				return iComp.operation() + 2;
 * 
 * 				Als Wert wird 3 zur�ckgegeben, denn das �bergebene Objekt iComp ist in diesem
 * 				Moment cComp, welche beim Aufruf von operation() 1 zur�ck gibt.
 * 
 * 				Der zweite Schritt wird nun mit dem zweiten Decorator wiederholt.
 * 				Berechnung sDeco.operation() = (3 + (2 + (1)))
 *
 */
public class Client {

	public static void main(String[] args) {
		
		// erzeugen Hauptkomponente		
		IComponent cComp = new ConcreteComponent();
		System.out.println("Wert: " + cComp.operation());
		
		System.out.println("---------------------------");
		
		// dekorieren cComp mit erstem Dekorator
		IComponent fDeco = new FirstDecorator(cComp);
		System.out.println("Wert: " + fDeco.operation());
		
		System.out.println("---------------------------");
		
		// dekorieren fDeco mit zweitem Dekorator
		IComponent sDeco = new SecondDecorator(fDeco);
		System.out.println("Wert: " + sDeco.operation());
		
	}
}
