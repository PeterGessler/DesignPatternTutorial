package de.projects.github.designpattern.structural.compositePattern;

/**
 * 
 * @author Peter Gessler
 * @description Die Klasse Client dient als Launcher für das Composite Modell.
 * 				Im vorliegenden Fall besteht das erzeugte Composite aus zwei
 * 				Ebenen (rootComposite & secondLevelComposite) .
 * 				Die Ebene rootComposite besitzt dabei zwei Blätter, welche
 * 				keine weiteren Kindknoten besitzten.
 * 				Nach dem erzeugen von secondLevelComposite wird dieses an
 * 				rootComposite "angebunden". rootComposite besitzt somit eine
 * 				dritte Verbindung. secondLevelComposite erhält im letzten 
 * 				Schritt drei Blätter.
 * 
 * 				Durch den Aufruf von rootComposite.operation() wird durch die
 * 				operation() Implementierung in Composite.java jede Verbindung
 * 				ebenfalls mit operation(); aufgerufen.
 *
 */
public class Client {

	public static void main(String[] args) {

		// Erzeugung von rootComposite mit zwei Blättern
		Composite rootComposite = new Composite();
		rootComposite.add(new Leaf());
		rootComposite.add(new Leaf());
		
		
		// Erzeugung von secondLevelComposite sowie Anbindung
		// an rootComposite
		Composite secondLevelComposite = new Composite();
		rootComposite.add(secondLevelComposite);
		
		// 3 Blätter an secondLevelComposite anbinden
		secondLevelComposite.add(new Leaf());
		secondLevelComposite.add(new Leaf());
		secondLevelComposite.add(new Leaf());

		// Abfrage der ganzen Struktur
		rootComposite.operation();

	}

}
