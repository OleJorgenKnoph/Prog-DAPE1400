/*
Utvid oppgave 6 til også å lese inn matrisen (det to-dimensjonale arrayet) fra brukeren.
Først skal man kunne lese inn antall anmeldere (rader) og antall filmer (kolonner).
Så skal arrayet defineres og man skal lese inn "scores".

Bruk gjerne try/catch for å sikre at man leser inn korrekte tall.
Sjekk også om tallene er mellom 0 og 9.
 */
package Oppgaver.Oppgave6;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
int antallMeldere;
int antallFilmer;
int score;

        try {
            antallMeldere = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange anmeldere er det?"));
            antallFilmer = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange filmer skal anmeldes?"));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Skriv inn gyldig tall");
            antallMeldere = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange anmeldere er det?"));
            antallFilmer = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange filmer skal anmeldes?"));
        }

        int[][] filmScore = new int[antallMeldere][antallFilmer];


            for (int i = 1; i <= antallMeldere; i++) {
                for (int j = 1; j <= antallFilmer; j++) {
                        score = Integer.parseInt(JOptionPane.showInputDialog("Hva syntes anmelder nummer " +
                                i + " om film nummer " + j + "? (Skriv et tall mellom 0-9"));

                        filmScore[i - 1][j - 1] = score;
                }
            }

        int film = 0;
        for (int[] verdi : filmScore) {
                int totalSum = 0;
                film++;

            for (int i : verdi) {
                totalSum += i;
            }
            System.out.println("Snittscore for film nr" + film + " er " + (double)totalSum/antallMeldere);
            }





    }
}
