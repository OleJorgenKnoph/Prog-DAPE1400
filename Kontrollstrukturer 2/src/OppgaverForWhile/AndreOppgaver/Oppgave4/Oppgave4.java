/*
Et program skal finne det største tallet av 10 heltall.
Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
Programmet skal bruke tre heltallsvariabler:

telller; som teller 0 til 10
nummer; som er tallet som er lest inn
størst; det til en hver tid største tallet
 */
package OppgaverForWhile.AndreOppgaver.Oppgave4;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {

        int størst = 0;

            for (int teller = 1; teller <= 10; teller++) {
                int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall nummer " +  teller));

                    if (nummer > størst) {
                        størst = nummer;
                    }
            }
            JOptionPane.showMessageDialog(null, "Det største tallet er " + størst);
    }
}
