package Strenger;

import javax.swing.*;

public class Strenger {
    public static void main (String [] args) {
        String navn = JOptionPane.showInputDialog("Hva heter du?");
        String adresse = JOptionPane.showInputDialog("Hva er adressen din?");

                String ut = navn +" "+ adresse;

        System.out.println(ut);
    }
}
