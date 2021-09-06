package no.hvl.dat100;

import javax.swing.*;

public class Fakultet {

	public static void main(String[] args) {
		
		String nTall = JOptionPane.showInputDialog("Sett inn verdi for beregning av fakultet: ");
		
		int n = Integer.parseInt(nTall);
		long fakultet = 1;
		
		while(n <= 0) {
			JOptionPane.showMessageDialog(null, "Tallet" + n + "er for lavt, kan ikke fakulteres.");
			nTall = JOptionPane.showInputDialog("Sett inn verdi for beregning av fakultet: ");
			n = Integer.parseInt(nTall);
		}
		
		while (n > 1) {
			fakultet *= n;
			n--;
		}
		System.out.println(nTall + "! =" + fakultet);

	}

}
