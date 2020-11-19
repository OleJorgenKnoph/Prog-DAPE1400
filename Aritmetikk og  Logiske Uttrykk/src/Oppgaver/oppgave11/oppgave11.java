package Oppgaver.oppgave11;

import javax.swing.*;

public class oppgave11 {
    public static void main (String [] args) {

        String innTall = JOptionPane.showInputDialog("Skriv inn et tall mellom 0 og 1000");

        int tall = Integer.parseInt(innTall);

        int sisteTall = tall % 10;
        int mellomTall = (tall / 10) % 10;
        int forsteTall = tall / 100;

        int tverrsum = forsteTall + mellomTall + sisteTall;

        System.out.println(tall + ": " + forsteTall + " + " + mellomTall + " + " + sisteTall + " = " + tverrsum);
    }
}
