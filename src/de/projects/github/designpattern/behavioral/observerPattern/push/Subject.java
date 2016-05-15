package de.projects.github.designpattern.behavioral.observerPattern.push;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Peter Gessler
 * @description Subject ist das beobachtbare Objekt und benachrichtigt Beobachter.
 * 				Der veränderte Wert wird beim Aufruf von notifyObserver mitgegeben.
 *
 */
public class Subject {

	private List<IObserver> observerList;
	private String paramOne;
	private String paramTwo;

	public Subject() {

		observerList = new ArrayList<IObserver>();

		computeNewValues();
	}

	// Beobachter in Liste einfügen
	public void addParameterListener(IObserver observer) {

		// schauen ob Beobachter schon in Liste ist
		for (IObserver iObserver : observerList) {

			if (observer.getObserverName().equals(
					iObserver.getObserverName())) {
				return;
			}
		}

		observerList.add(observer);
	}

	// Beobachter aus der Liste entfernen
	public void removeParameterListener(IObserver observer) {

		for (IObserver iObserver : observerList) {

			if (observer.getObserverName().equals(
					iObserver.getObserverName())) {
				observerList.remove(observer);
			}
		}
	}

	// Berechnung von neuen Werten.
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
						notifyAllObserver();
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
	
	// Beobachter benachrichtigen
	private void notifyAllObserver() {

		for (IObserver iParameterListener : observerList) {

			// Beobachter individuell benachrichtigen
			if (iParameterListener.getObserverName().equals("ObserverOne")) {
				iParameterListener.notifyObserver(paramOne);
			}

			if (iParameterListener.getObserverName().equals("ObserverTwo")) {
				iParameterListener.notifyObserver(paramTwo);
			}

		}
	}
}
