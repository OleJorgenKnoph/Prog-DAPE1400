package oppgaverVariabler1.Oppgave2;

import javax.swing.*;

public class oppgave2 {
    public static void main(String[] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String innAlder = JOptionPane.showInputDialog("Skriv inn din alder:");

        JOptionPane.showMessageDialog(null, "Alderen til " + innFornavn +" "+ innEtternavn +" er "+ innAlder);
    }
}
