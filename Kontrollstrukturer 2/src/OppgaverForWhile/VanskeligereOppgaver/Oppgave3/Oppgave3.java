/*
Lag en primtallssjekk.
 Et tall oppgis og det sjekkes om dette tallet er delelig med alle tall fra 1 og opp til det valgte tallet.
  Dersom det er delelig bare med 1 og seg selv er det et primtall.
 */
package OppgaverForWhile.VanskeligereOppgaver.Oppgave3;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args) {
        int n =Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall :"));
        int c = 0;
        String primtall = " er et primtall!";
        for (int i = 1; i <= n; i++) {
            if(n % i==0) {
                c++;
            }
            if(c > 2) {
                primtall = " er ikke et primtall";
                break; // gå ut av for-løkken det er ikke et primtall
            }
        }
        JOptionPane.showMessageDialog(null,"Tallet "+n + primtall);
    }
}
