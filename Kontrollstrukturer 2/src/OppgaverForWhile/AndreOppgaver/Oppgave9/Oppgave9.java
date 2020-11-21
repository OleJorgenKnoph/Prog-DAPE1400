/*
Skriv et program som regner ut fakultet til et tall. n! = n*(n-1)*(n-2)*...*1.

F. eks 5! = 5*4*3*2*1 = 120

Programmet skal lese inn tallet og skrive ut resultatet.
 */
//Måtte se fasit
package OppgaverForWhile.AndreOppgaver.Oppgave9;

import javax.swing.*;

public class Oppgave9 {
    public static void main(String[] args) {
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
        int resultat = tall;

            for (int i = tall - 1; i > 0; i--) {
                resultat *= i;

            }
        JOptionPane.showMessageDialog(null, "Resultatet av fakultetsregningen er " + resultat);
    }
}
