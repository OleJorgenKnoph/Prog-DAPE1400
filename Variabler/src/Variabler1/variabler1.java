package Variabler1;

import javax.swing.*;

public class variabler1 {
    public  static void main (String [] args) {

        String navn, adresse;

        navn = "Per Hansen";
        adresse  = "OsloVeien 82";
        String postadresse = "Oslo";
        String postNr = "1234";

        System.out.println("Navn: " + navn);
        System.out.println("Adresse: " + adresse +" "+ postNr + " "+ postadresse);

        String innNavn = JOptionPane.showInputDialog("Hva er ditt navn?");
        String innAdresse = JOptionPane.showInputDialog("Adresse?");
        String innPostAdresse = JOptionPane.showInputDialog("Postadresse?");
        String innPostNr = JOptionPane.showInputDialog("PostNr?");

        JOptionPane.showMessageDialog(null, innNavn + " har adressen " + innAdresse +" "+ innPostAdresse +" "+ innPostNr);

        String ut = "Navnet: " +innNavn+"\n"+ "adressen er: " + innAdresse+" "+innPostNr+" "+innPostAdresse;
        JOptionPane.showMessageDialog(null, ut);
    }
}
