package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description Das Model View Controller Pattern geht auf die Idee des
 * 				Observer Patterns zur�ck. Die Beobachter sind in diesem
 * 				Fall ausschlie�lich grafische Oberfl�chen. Das beobachtbare
 * 				Subject ist ein Modell, welches die zu visualisierenden 
 * 				Daten verwaltet.
 * 				MVC beschreibt dabei die drei miteinander interagierenden
 * 				Komponenten Model, View und Controller.
 * 
 * 				Im vorliegenden Fall gibt es nur ein Objekt(View) welches die
 *				grafische Oberfl�che repr�sentiert. Wegen der �bersichtlichkeit
 *				wird auf eine grafische Oberfl�che verzichtet sondern nur
 *				das Konzept dargestellt.
 *				Zun�chst wird der Controller initialisiert. Dieser stellt
 *				der View Methoden bereit um Nutzereingaben zu verarbeiten.
 *				Nach der Verarbeitung werden die Daten im Modell gespeichert
 *				und die View benachrichtigt/angepasst. Dazu wird das Modell
 *				dem Controller �bergeben. Das Modell kennt wiederum die View,
 *				welche die Schnittstelle IView implementiert.
 *				Das Modell hat somit die M�glichkeit, die View �ber die Methode
 *				notifyView(String param) zu benachrichtigen.
 */
public class Client {

	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		View view = new View(controller);
		Model model = new Model(view);
		controller.setModel(model);
	}
}
