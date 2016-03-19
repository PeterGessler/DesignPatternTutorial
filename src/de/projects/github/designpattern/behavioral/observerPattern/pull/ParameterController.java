package de.projects.github.designpattern.behavioral.observerPattern.pull;

import java.util.ArrayList;
import java.util.List;

public class ParameterController {

	List<IParameterListener> listenerList;
	private String paramOne;
	private String paramTwo;
	
	public ParameterController() {
		
		listenerList = new ArrayList<IParameterListener>();
		
		computeNewValues();
	}
	
	// Beobachter in Liste einfügen
	public void addParameterListener(IParameterListener listener) {
		
		// schauen ob Beobachter schon in Liste ist
		for (IParameterListener iParameterListener : listenerList) {
			
			if (listener.getObserverName().equals(iParameterListener.getObserverName())) {
				return;
			}
		}
		
		listenerList.add(listener);
	}
	
	// Beobachter aus der Liste entfernen
	public void removeParameterListener(IParameterListener listener) {
		
		for (IParameterListener iParameterListener : listenerList) {
			
			if (listener.getObserverName().equals(iParameterListener.getObserverName())) {
				listenerList.remove(listener);
			}
		}
	}

	// Neue Werte berechnen und Methode zur Benachrichtigung der Beobachter aufrufen.
	private void computeNewValues() {

		Thread runSystem = new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {

					paramOne = "Dieser Parameter ist für listener 1 interessant. Wert "
							+ Math.random();
					paramTwo = "Dieser Parameter ist für listener 2 interessant. Wert "
							+ Math.random();

					try {
						Thread.sleep(5000);
						notifyAllListener();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		});
		runSystem.start();
		
	}
	
	// Alle Beobachter benachrichtigen, dass eine Zustandsänderung vorliegt.
	private void notifyAllListener() {
		
		for (IParameterListener iParameterListener : listenerList) {
			iParameterListener.notifyListener();
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
