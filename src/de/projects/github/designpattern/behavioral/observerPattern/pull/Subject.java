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
	
	// Beobachter in Liste einf�gen
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
				
				// F�nf Durchl�ufe
				while (cnt < 5) {

					paramOne = "Dieser Parameter ist f�r ObserverOne interessant. Wert: "
							+ Math.random();
					paramTwo = "Dieser Parameter ist f�r ObserverTwo interessant. Wert: "
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
	
	// Alle Beobachter benachrichtigen, dass eine Zustands�nderung vorliegt.
	private void notifyAllObservers() {
		
		for (IObserver observers : observerList) {
			observers.notifyObserver();
		}
	}
	
	
	// Wert von Parameter 1 zur�ckgeben
	public String getParameterOne() {
		return paramOne;
	}
	
	// Wert von Parameter 2 zur�ckgeben
	public String getParameterTwo() {
		return paramTwo;
	}
}
