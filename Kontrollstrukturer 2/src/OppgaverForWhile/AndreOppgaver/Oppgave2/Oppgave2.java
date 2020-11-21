/*
En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende får 9 % av salget i tillegg til vanlig månedslønn.
Skriv et program som leser prisen på et antall varer selgeren har solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
 Bruk inputbokser og avslutt innlesningen når prisen er 0.
 */
package OppgaverForWhile.AndreOppgaver.Oppgave2;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {

        int prisPaVarer = Integer.parseInt(JOptionPane.showInputDialog("Skriv prisen på vare. 0 for å avslutte"));

            int totaltSumVarer = 0;

        while (prisPaVarer > 0) {
                totaltSumVarer += prisPaVarer;

                prisPaVarer = Integer.parseInt(JOptionPane.showInputDialog("Skriv prisen på vare. 0 for å avslutte"));
        }

            JOptionPane.showMessageDialog(null, "Salgspersonen får " + totaltSumVarer * 0.09 + " kr i tillegg");
    }
}
