package no.hvl.dat100;
//import javax.swing.JOptionPane;

import javax.swing.*;

public class TrinnSkatt {
	public static void main(String[] args) {
	
	String in = JOptionPane.showInputDialog("Brutto");
	int brutto = Integer.parseInt(in);
	//long brutto = Long.parseLong(in);
	double nettoLonn;
	double sats = 0.0;
	
	if (brutto >= 164101 && brutto <=230950) {	
    	sats = 0.93; 
	}   else if (brutto >= 230951 && brutto <=580650) {	
    	sats = 2.41; 
	}   else if (brutto >= 580651 && brutto <=934500) {	
    	sats = 11.52; 
	}   else if (brutto >= 934051) {	
    	sats = 14.52; 
	}   else if (brutto <= 164100) {	
    	sats = 0.0; 
	}
	
	double trinn = 0;
	
	if (brutto >= 164101 && brutto <=230950) {	
    	trinn = 1; 
	}   else if (brutto >= 230951 && brutto <=580650) {	
    	trinn = 2; 
	}   else if (brutto >= 580651 && brutto <=934500) {	
    	trinn = 3; 
	}   else if (brutto >= 934051) {	
    	trinn = 4; 
	}   else if (brutto <= 164100) {	
    	trinn = 0; 
	}
	double skatt = brutto * (sats / 100); 
	
	nettoLonn = brutto - skatt;
	JOptionPane.showMessageDialog(null, "Trinn: " + trinn);
	JOptionPane.showMessageDialog(null, "Sats i prosent: " + sats + "\nSum Skatt: " + skatt);
	JOptionPane.showMessageDialog(null, "Bruttolønn: " + in + "\nNettolønn: " + nettoLonn);
		
    }
}

