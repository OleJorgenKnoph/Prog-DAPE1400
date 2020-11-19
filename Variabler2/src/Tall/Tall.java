package Tall;

import javax.swing.*;

public class Tall {
    public static void main (String [] args) {
        String innString1 = JOptionPane.showInputDialog("Skriv inn et heltall:");
        String innString2 = JOptionPane.showInputDialog("Skriv inn et annet heltall:");

        int tall1 = Integer.parseInt(innString1);
        int tall2 = Integer.parseInt(innString2);

        int sum = tall1 + tall2;

        System.out.println("Summen til de to tallene er " + sum);
    }
}
