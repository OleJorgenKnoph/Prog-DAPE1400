package Sammenlikninger;


import javax.swing.*;

public class Sammenlikninger {
    public static void main (String [] args) {
        String innString1 = JOptionPane.showInputDialog("Skriv inn tall 1 ");
        String innString2 = JOptionPane.showInputDialog("Skriv inn tall 2 ");

        int tall1 = Integer.parseInt(innString1);
        int tall2 = Integer.parseInt(innString2);

        if (tall1 == tall2) {
            JOptionPane.showMessageDialog(null, "Tall 1 er lik tall 2");
        }
            if (tall1 != tall2) {
                JOptionPane.showMessageDialog(null, "Tall 1 er ikke lik tall 2");
            }
                if (tall1 < tall2) {
                    JOptionPane.showMessageDialog(null, "Tall 1 er mindre enn tall 2");
                }
                    if (tall1 > tall2) {
                        JOptionPane.showMessageDialog(null, "Tall 1 er større enn tall 2");
                    }
                        if (tall1 <= tall2) {
                            JOptionPane.showMessageDialog(null, "Tall 1 er mindre eller lik tall 2");
                        }

    }
}
