package de.projects.github.designpattern.structural.compositePattern;

public class Client {

	public static void main(String[] args) {

		/*
		 * Struktur aufbauen
		 */
		
		Composite rootComposite = new Composite();
		rootComposite.add(new Leaf());
		rootComposite.add(new Leaf());
		
		Composite secondAreaComposite = new Composite();
		rootComposite.add(secondAreaComposite);
		
		secondAreaComposite.add(new Leaf());
		secondAreaComposite.add(new Leaf());
		secondAreaComposite.add(new Leaf());

		// Abfrage der ganzen Struktur
		rootComposite.operation();

	}

}
