package Oppgaver.oppgave3;

import javax.swing.*;

public class oppgave3 {
    public static void main (String [] args) {

        String innLengde = JOptionPane.showInputDialog("Lengde: ");
        String innBredde = JOptionPane.showInputDialog("Bredde: ");

        double lengde = Double.parseDouble(innLengde);
        double bredde = Double.parseDouble(innBredde);

        double areal = lengde * bredde;

            System.out.println("Et rektangel med bredde " + bredde + " cm og en lengde " +lengde + " cm har et areal på " + areal + " cm^2");
    }
}
