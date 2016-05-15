package de.projects.github.designpattern.structural.compositePattern;

/**
 * @author Peter Gessler
 * @description Composite enthält alle Methoden zur Verwaltung seiner Kindknoten
 * 				sowie eine Liste childComponents von diesen.
 * 				Die Methode getChild ermöglich das Abfragen eines Kindknotens
 * 				innerhalb der Liste.
 */


import java.util.ArrayList;
import java.util.List;

public class Composite extends AComponent {

	private List<AComponent> childComponents = new ArrayList<AComponent>(); 
	
	@Override
	public void operation() {
		
		System.out.println("Ich bin ein Knoten. Meine Kinder sind:");
		for (AComponent childComps : childComponents) {
			childComps.operation();
		}
	}
	
	// Hinzufügen einer Komponente (Knoten o. Blatt) zum aktuellen Knoten
	public void add(AComponent pComp) {
		childComponents.add(pComp);
	}
	
	// Entfernen einer Komponente (Knoten o. Blatt) vom aktuellen Knoten
	public void remove(AComponent pComp) {
		childComponents.remove(pComp);
	}
	
	
	// Knoten oder Blatt unter aktuellem Knoten wiedergeben
	public AComponent getChild(int pIndex) {
		return childComponents.get(pIndex);
	}
	
	

}
