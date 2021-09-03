package launcher;
import entities.*;
import gui.*;

public class Launcher {
	
	// Student s = new Student(108055, "Reynier", "Clemente", "clementereynier18@gmail.com", "https://github.com/ClemenRey/tdp-proyecto-1/tree/master","/proyecto-1/src/images/tdp.png");
	
	
	public static void main(String [] args) {
		
		
		Student s = new Student(108055, "Reynier", "Clemente", "clementereynier18@gmail.com", "https://github.com/ClemenRey/tdp-proyecto-1/tree/master","/proyecto-1/src/images/tdp.png");
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
     
            	SimplePresentationScreen p= new SimplePresentationScreen(s);
            	p.setVisible(true);
            	
            }
        });
    }
}