/*
Lag et program som beregner skatten til tre personer.
 Skatten er 30 % frem til 500.000 kr og 50 % over.
Les inn navn og inntekt på de 3 personene og vis den samme informasjonen med hvor mye skatt de kan forvente seg.
 */
package OppgaverForWhile.AndreOppgaver.Oppgave3;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {
        String navn1 = JOptionPane.showInputDialog("Navn");
            int inntekt1 = Integer.parseInt(JOptionPane.showInputDialog("Inntekt"));

        String navn2 = JOptionPane.showInputDialog("Navn");
            int inntekt2 = Integer.parseInt(JOptionPane.showInputDialog("Inntekt"));

        String navn3 = JOptionPane.showInputDialog("Navn");
            int inntekt3 = Integer.parseInt(JOptionPane.showInputDialog("Inntekt"));

        double skattOver500 = 0.5;
        double skattUnder500 = 0.3;

        double skatt1;
        double skatt2;
        double skatt3;

            if (inntekt1 > 500_000) {
                skatt1 = inntekt1 * skattOver500;
            }
                else {
                    skatt1 = inntekt1 * skattUnder500;
            }

                    if (inntekt2 > 500_000) {
                        skatt2 = inntekt2 * skattOver500;
                    }
                    else {
                        skatt2 = inntekt2 * skattUnder500;
                    }

                                if (inntekt3 > 500_000) {
                                    skatt3 = inntekt3 * skattOver500;
                                }
                                else {
                                    skatt3 = inntekt3 * skattUnder500;
                                }
              String utPers1 = "";
                                utPers1 += "Navn: " + navn1 + "\n";
                                utPers1 += "Inntekt: " + inntekt1 + "\n";
                                utPers1 += "Forventet skatt: " + skatt1 + "\n";

              String utPers2 = "";
                                utPers2 += "Navn: " + navn2 + "\n";
                                utPers2 += "Inntekt: " + inntekt2 + "\n";
                                utPers2 += "Forventet skatt: " + skatt2 + "\n";

              String utPers3 = "";
                                utPers3 += "Navn: " + navn3 + "\n";
                                utPers3 += "Inntekt: " + inntekt3 + "\n";
                                utPers3 += "Forventet skatt: " + skatt3 + "\n";



        JOptionPane.showMessageDialog(null, utPers1);
        JOptionPane.showMessageDialog(null, utPers2);
        JOptionPane.showMessageDialog(null, utPers3);
    }
}
