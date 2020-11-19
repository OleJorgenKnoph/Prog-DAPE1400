package oppgaverVariabler1.Oppgave4;

import javax.swing.*;

public class oppgave4 {
    public static void main (String [] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String innAlder = JOptionPane.showInputDialog("Skriv inn din alder:");
        String innAdresse = JOptionPane.showInputDialog("Adresse:");
        String innPoststed = JOptionPane.showInputDialog("Poststed:");
        String innPostnr = JOptionPane.showInputDialog("Postnummer:");

        JOptionPane.showMessageDialog(null,
                "Navn:" + innFornavn +" "+ innEtternavn + "\n"
                +"Adresse: "+ innAdresse+ "\n"
                + "Postnummer: " + innPostnr + "\n"
                + "Poststed: " + innPoststed + "\n"
                + "Alder: " + innAlder);
    }
}
