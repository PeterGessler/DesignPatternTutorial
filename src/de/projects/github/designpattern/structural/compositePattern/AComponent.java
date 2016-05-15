package de.projects.github.designpattern.structural.compositePattern;

/**
 * 
 * @author Peter Gessler
 * @description Die abstrakte Klasse AComponent bildet die Wurzel im Composite Modell. 
 * 				Im hier dargestellten Modell sind alle nicht abstrakten Klassen die von
 * 				AComponent erben gezwungen, operation() als Methode zu implementierten.
 * 
 * 				Die Methoden add(AComponent pComponent), remove(AComponent pComponent)
 * 				und getChild(int pIndex) sind ebenfalls in allen abgeleiteten Klassen
 * 				aufrufbar, besitzen jedoch keine Implementierung.
 *
 */
public abstract class AComponent {

	// Methode die jede Unterklasse besitzt
	public abstract void operation();
	
	// Defaultimplementierung
	// Methode wird nur in der Composite Klasse verwendet
	// und ist deswegen nicht als abstrakte Methode deklariert
	public void add(AComponent pComponent) {
		
	}
	
	// siehe Beschreibung add-Methode 
	public void remove(AComponent pComponent) {
		// Defaultimplementierung
	}
	
	// siehe Beschreibung add-Methode 
	public AComponent getChild(int pIndex) {
		// Defaultimplementierung
		return null;
	}
	
}
