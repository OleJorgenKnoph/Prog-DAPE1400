/*
Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall. En ekstra variabel må brukes.
 */
//Forrige oppgave
/*
Et program skal finne det største tallet av 10 heltall.
Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
Programmet skal bruke tre heltallsvariabler:

telller; som teller 0 til 10
nummer; som er tallet som er lest inn
størst; det til en hver tid største tallet
 */

//Måtte se fasit
package OppgaverForWhile.AndreOppgaver.Oppgave5;

import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args) {
        int størst = 0;
        int nestStørst = 0;

        for (int teller = 1; teller <= 10; teller++) {
            int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall nummer " +  teller));

                if (nummer > størst) {
                    nestStørst = størst;

                    størst = nummer;
                }
                    else if (nummer > nestStørst) {
                        nestStørst = nummer;
                    }
        }
        JOptionPane.showMessageDialog(null, "Det største tallet er " + størst + " og det nest største er " + nestStørst);
    }
}
