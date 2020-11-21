/*
Lag et program som skriver ut en rettvinklet trekant med *. Input hvor mange stjerner grunnflaten skal være. F.eks: 3 * gir

X
XX
XXX
 */
package OppgaverForWhile.AndreOppgaver.Oppgave7;

import javax.swing.*;

public class Oppgave7 {
    public static void main(String[] args) {

        int grunnlinje = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange stjerner i grunnlinja?"));

            for (int i = 0; i < grunnlinje; i++) {

                    System.out.print("\n");

                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }

            }
    }
}
