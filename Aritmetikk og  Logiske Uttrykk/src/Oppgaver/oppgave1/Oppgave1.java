package Oppgaver.oppgave1;

import javax.swing.*;

public class Oppgave1 {
    public static void main (String [] args) {

        String innNavn = JOptionPane.showInputDialog("Hva er navnet ditt?");
        String innAlder = JOptionPane.showInputDialog("Hvor gammel er du?");

        int alder = Integer.parseInt(innAlder);

        int aar = 2018;
        int fodselaar = aar - alder;
        int alder2053 = (2053 - aar) + alder;

        JOptionPane.showMessageDialog(null, innNavn + " er i dag " + alder +" år. Han er født i " + fodselaar +". I 2053 er han "
                                                                    + alder2053 + " år og da vil han være pensjonist");
    }
}
