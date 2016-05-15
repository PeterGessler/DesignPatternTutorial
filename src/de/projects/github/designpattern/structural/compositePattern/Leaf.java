package de.projects.github.designpattern.structural.compositePattern;

/**
 * 
 * @author Peter Gessler
 * @description Atomares Blatt welches von AComponent dazu
 * 				gezwungen wird operation() zu implementieren.
 *
 */
public class Leaf extends AComponent {

	@Override
	public void operation() {
		System.out.println("Ich bin ein Blatt und habe keine weiteren Kinder");
	}

	
}
