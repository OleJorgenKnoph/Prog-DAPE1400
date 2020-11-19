package Oppgaver.oppgave10;

import javax.swing.*;

public class oppgave10 {
    public static void main (String [] args) {

        String innAlder = JOptionPane.showInputDialog("Hvor gammel er du?");

        int alder = Integer.parseInt(innAlder);

            if (alder >= 18) {
                System.out.println("Grattis, du er gammel nok til å ta lappen");
            }
                else if (alder < 18) {
                    System.out.println("Sorry, du er for ung");
            }
    }
}
