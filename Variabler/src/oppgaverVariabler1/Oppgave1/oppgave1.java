package oppgaverVariabler1.Oppgave1;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavn:");

        JOptionPane.showMessageDialog(null, "Fulle navnet til brukeren er: " + innFornavn +" "+ innEtternavn);
    }
}

