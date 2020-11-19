package Oppgaver.oppgave4;

import javax.swing.*;

public class oppgave4 {
    public static void main (String [] args) {

        String innRadius = JOptionPane.showInputDialog("Radius: ");

        double radius = Double.parseDouble(innRadius);

        double omkrets = 2 * Math.PI * radius;

        System.out.println("Omkretsen av en sirkel med " + radius + " som radius blir " + String.format("%.2f", omkrets));
    }
}
