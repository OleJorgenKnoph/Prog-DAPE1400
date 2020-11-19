package Desimaltall;

import javax.swing.*;

public class Desimaltall {
    public static void main (String [] args) {
        String innString1 = JOptionPane.showInputDialog("Skriv inn et desimaltall:");
        String innString2 = JOptionPane.showInputDialog("Skriv inn et annet desimaltall:");

        double tall1 = Double.parseDouble(innString1);
        double tall2 = Double.parseDouble(innString2);

        double divSum = tall1 / tall2;

        System.out.println("Divisjonen av de to tallene ble " + divSum);
    }
}
