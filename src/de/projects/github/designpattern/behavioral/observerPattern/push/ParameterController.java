package de.projects.github.designpattern.behavioral.observerPattern.push;

import java.util.ArrayList;
import java.util.List;

public class ParameterController {

	private List<IParameterListener> listenerList;
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

			if (listener.getObserverName().equals(
					iParameterListener.getObserverName())) {
				return;
			}
		}

		listenerList.add(listener);
	}

	// Beobachter aus der Liste entfernen
	public void removeParameterListener(IParameterListener listener) {

		for (IParameterListener iParameterListener : listenerList) {

			if (listener.getObserverName().equals(
					iParameterListener.getObserverName())) {
				listenerList.remove(listener);
			}
		}
	}

	// Berechnung von neuen Werten.
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

	// Beobachter individuell benachrichtigen
	private void notifyAllListener() {

		for (IParameterListener iParameterListener : listenerList) {

			if (iParameterListener.getObserverName().equals("ObserverValueOne")) {
				iParameterListener.notifyListener(paramOne);
			}

			if (iParameterListener.getObserverName().equals("ObserverValueTwo")) {
				iParameterListener.notifyListener(paramTwo);
			}

		}
	}
}
