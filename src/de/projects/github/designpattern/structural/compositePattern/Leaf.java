package de.projects.github.designpattern.structural.compositePattern;

public class Leaf extends AComponent {

	@Override
	public void operation() {
		System.out.println("Ich bin ein Blatt und habe keine weiteren Kinder");
	}

	
}
