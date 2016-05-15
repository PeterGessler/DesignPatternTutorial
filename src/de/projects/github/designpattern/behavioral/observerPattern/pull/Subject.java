package de.projects.github.designpattern.behavioral.observerPattern.pull;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Peter Gessler
 * @description Subject ist das beobachtbare Objekt und benachrichtigt Beobachter.
 * 				Beobachter besitzen Referenz auf das Subject und fragen individuell
 * 				nach Wert an.
 *
 */
public class Subject {

	List<IObserver> observerList;
	private String paramOne;
	private String paramTwo;
	
	public Subject() {
		
		observerList = new ArrayList<IObserver>();
		
		computeNewValues();
	}
	
	// Beobachter in Liste einfügen
	public void addParameterListener(IObserver observer) {
		
		// schauen ob Beobachter schon in Liste ist
		for (IObserver iObservers : observerList) {
			
			if (observer.getObserverName().equals(iObservers.getObserverName())) {
				return;
			}
		}
		
		observerList.add(observer);
	}
	
	// Beobachter aus der Liste entfernen
	public void removeParameterListener(IObserver observer) {
		
		for (IObserver iObservers : observerList) {
			
			if (observer.getObserverName().equals(iObservers.getObserverName())) {
				observerList.remove(observer);
			}
		}
	}

	// Neue Werte erzeugen und Methode zur Benachrichtigung der Beobachter aufrufen.
	private void computeNewValues() {

		Thread runSystem = new Thread(new Runnable() {
			
			@Override
			public void run() {

				int cnt = 0;
				
				// Fünf Durchläufe
				while (cnt < 5) {

					paramOne = "Dieser Parameter ist für ObserverOne interessant. Wert: "
							+ Math.random();
					paramTwo = "Dieser Parameter ist für ObserverTwo interessant. Wert: "
							+ Math.random();

					try {
						Thread.sleep(2000);
						notifyAllObservers();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					cnt++;
				}

			}
		});
		runSystem.start();
		
	}
	
	// Alle Beobachter benachrichtigen, dass eine Zustandsänderung vorliegt.
	private void notifyAllObservers() {
		
		for (IObserver observers : observerList) {
			observers.notifyObserver();
		}
	}
	
	
	// Wert von Parameter 1 zurückgeben
	public String getParameterOne() {
		return paramOne;
	}
	
	// Wert von Parameter 2 zurückgeben
	public String getParameterTwo() {
		return paramTwo;
	}
}
