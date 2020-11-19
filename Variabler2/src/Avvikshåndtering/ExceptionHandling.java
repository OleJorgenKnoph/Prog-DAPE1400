package Avvikshåndtering;

import javax.swing.*;

public class ExceptionHandling {
    public static void main (String [] args) {
        String innString = JOptionPane.showInputDialog("Skriv inn et heltall:");  /*
        Denne metoden krever et tall. Skriver man inn f.eks bokstaver krasjer koden. Da kan man legge inn en try/catch metode*/

        //Oppretter variabelen
        int tall;

        //Prøver å kjøre denne
            try {

                tall = Integer.parseInt(innString);
            }
            //Hvis det ikke gikk (feilmelding) så kjører denne
                catch (Exception feilkode) {
                    tall = 0;
                    System.out.println("Du har skrevet inn et ugyldig tall");
                }

        System.out.println("Tallet er " + tall);
    }
}
