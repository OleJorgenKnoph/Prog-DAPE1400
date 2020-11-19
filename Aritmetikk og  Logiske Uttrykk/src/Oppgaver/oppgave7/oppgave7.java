package Oppgaver.oppgave7;

import javax.swing.*;

public class oppgave7 {
    public static void main (String [] args) {
        String innPizza = JOptionPane.showInputDialog("Hvor mange pizzaer?");
        String innPers = JOptionPane.showInputDialog("Hvor mange personer?");
        String innAntallSlices = JOptionPane.showInputDialog("Hvor mange slices skal hver person få?");

            int pizzaer = Integer.parseInt(innPizza);
            int personer = Integer.parseInt(innPers);
            int slicesPerPers = Integer.parseInt(innAntallSlices);

                int tilOvers = (6 * pizzaer) % (personer * slicesPerPers);

                System.out.println("Dersom man er " + personer + " personer og har " + pizzaer + " pizzaer, hvor hver person får "
                                    + slicesPerPers + " slices. Så blir det " + tilOvers + " slices til overs.");
    }
}
