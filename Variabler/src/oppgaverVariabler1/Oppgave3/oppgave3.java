package oppgaverVariabler1.Oppgave3;

import javax.swing.*;

public class oppgave3 {
    public static void main(String[] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String innAlder = JOptionPane.showInputDialog("Skriv inn din alder:");
        String innAdresse = JOptionPane.showInputDialog("Adresse:");
        String innPoststed = JOptionPane.showInputDialog("Poststed:");
        String innPostnr = JOptionPane.showInputDialog("Postnummer:");

        JOptionPane.showMessageDialog(null, innFornavn +" "+ innEtternavn +" bor i "+ innAdresse + " som har postnummer "
                        + innPostnr + " i " + innPoststed + ". " + innFornavn +"´s alder er " + innAlder + " år.");
    }
}
