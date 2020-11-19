package Oppgaver.oppgave5;

import javax.swing.*;

public class oppgave5 {
    public static void main (String [] args) {

        String innFarenheit = JOptionPane.showInputDialog("Farenheit: ");

        double farenheit = Double.parseDouble(innFarenheit);

        double celsius = (farenheit - 32) / 1.8;

            System.out.println(farenheit + " farenheit er lik " + String.format("%.2f", celsius) + " celsius");
    }
}
