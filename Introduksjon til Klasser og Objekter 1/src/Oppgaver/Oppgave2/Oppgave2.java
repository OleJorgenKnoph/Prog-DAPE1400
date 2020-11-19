/*
Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.
 */

package Oppgaver.Oppgave2;

import javax.swing.*;

class Boker {
    String tittel;
    double pris;
    String forfatter;
    String iSBNnr;

    public void skrivUt() {

        String ut = "";
        ut += "Tittel: " + tittel + "\n";
        ut += "Forfatter: " + forfatter + "\n";
        ut += "Pris: " + pris + "\n";
        ut += "iSBN-nummer: " + iSBNnr + "\n";

        JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppgave2 {
    public static void main (String [] args) {

        String innTittel = JOptionPane.showInputDialog("Skriv inn tittel");
        String innPris = JOptionPane.showInputDialog("Skriv inn pris");
        String innForfatter = JOptionPane.showInputDialog("Skriv inn forfatter");
        String innIsbn = JOptionPane.showInputDialog("Skriv inn iSBN-nummer (");

        double pris = Double.parseDouble(innPris);

        Boker bok1 = new Boker();

        bok1.tittel = innTittel;
        bok1.pris = pris;
        bok1.forfatter = innForfatter;
        bok1.iSBNnr = innIsbn;

        bok1.skrivUt();
    }
}
