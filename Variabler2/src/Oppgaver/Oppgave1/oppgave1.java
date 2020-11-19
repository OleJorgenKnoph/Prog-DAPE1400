package Oppgaver.Oppgave1;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        String innAlder = JOptionPane.showInputDialog("Alder:");

        int alder = Integer.parseInt(innAlder);

        JOptionPane.showMessageDialog(null, "Min alder er " + alder + " år");
    }
}
