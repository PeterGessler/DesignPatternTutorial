package de.projects.github.designpattern.structural.compositePattern;

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
