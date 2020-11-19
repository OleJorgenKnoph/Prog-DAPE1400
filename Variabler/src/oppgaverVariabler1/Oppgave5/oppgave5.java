package oppgaverVariabler1.Oppgave5;

import javax.swing.*;

public class oppgave5 {
    public static void main (String [] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String innAlder = JOptionPane.showInputDialog("Skriv inn din alder:");
        String innAdresse = JOptionPane.showInputDialog("Adresse:");
        String innPoststed = JOptionPane.showInputDialog("Poststed:");
        String innPostnr = JOptionPane.showInputDialog("Postnummer:");

        System.out.println("Navn:" + innFornavn +" "+ innEtternavn + "\n"
                +"Adresse: "+ innAdresse+ "\n"
                + "Postnummer: " + innPostnr + "\n"
                + "Poststed: " + innPoststed + "\n"
                + "Alder: " + innAlder);
    }
}
