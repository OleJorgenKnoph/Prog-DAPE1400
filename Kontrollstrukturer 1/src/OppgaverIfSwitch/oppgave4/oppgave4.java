/*
Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år).
 Oppdater oppgavene over slik at programmet skriver ut meldingene

Du er for ung til å ta førerkort for bil
Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker
 */
package OppgaverIfSwitch.oppgave4;

import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Alder"));

            int hoyesteAlder = 70;

        if (alder < 18) {
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        }
            if (alder < 70 && alder >= 18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil og du trenger ikke årlige legesjekker");
        }
                if (alder >= hoyesteAlder) {
                    JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
                }

    }
}
