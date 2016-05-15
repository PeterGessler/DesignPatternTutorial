package de.projects.github.designpattern.structural.modelViewController;

/**
 * 
 * @author Peter Gessler
 * @description View (grafische Oberfläche) reicht Werte an den Controller
 * 				weiter oder verwendet Methoden vom Controller.
 * 				"Verändert" sich bei Benachrichtigung vom Modell. 
 *
 */
public class View implements IView{

	Controller controller;
	
	public View(Controller controller) {
		this.controller = controller;
		
		Thread execute = new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				controller.setModelName("MVC-Pattern Model");
			}
		});
		execute.start();
	}

	@Override
	public void notifyView(String param) {
		
		System.out.println(param);
	}

}
