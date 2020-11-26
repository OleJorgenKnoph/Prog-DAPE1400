package Oppgave1;

import javax.swing.*;

public class TempKonvertering {
    public static void main(String[] args) {

        String innTemp = JOptionPane.showInputDialog("Ønsker du å konvertere fra C eller F?");
        String innGrader = JOptionPane.showInputDialog("Hvor mange grader?");

        double grader = Double.parseDouble(innGrader);


        double resultat = 0;

            if (innTemp.equals("F")){
                resultat = (grader - 32) / 1.8;

                JOptionPane.showMessageDialog(null, grader + " " + innTemp + " er lik " + String.format("%.2f",resultat) + " C");
            }
                else if (innTemp.equals("C")){
                    resultat = grader * 1.8 + 32;

                    JOptionPane.showMessageDialog(null, grader + " " + innTemp + " er lik " + String.format("%.2f",resultat) + " F");
            }
                else {
                    JOptionPane.showMessageDialog(null, "Det må skrives inn enten C eller F");
            }
    }
}
