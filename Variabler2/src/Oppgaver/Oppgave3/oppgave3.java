package Oppgaver.Oppgave3;

import javax.swing.*;

public class oppgave3 {
    public static void main (String [] args) {
        String innTall1 = JOptionPane.showInputDialog("Skriv inn et desimaltall: ");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn et nytt desimaltall: ");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn enda et nytt desimaltall: ");

        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;

        JOptionPane.showMessageDialog(null, "Snittet av tallene er = " + gjennomsnitt);
        System.out.println("Snittet av tallene er = " + gjennomsnitt);
    }
}
