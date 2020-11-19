package Oppgaver.oppgave6;

import javax.swing.*;

public class oppgave6 {
    public static void main (String [] args) {
        String innDollar = JOptionPane.showInputDialog("Dollar: ");

        int dollar = Integer.parseInt(innDollar);

        double dollarTilNok = dollar * 9.03;

        System.out.println(dollar + " dollar i NOK er " + dollarTilNok);
    }
}
