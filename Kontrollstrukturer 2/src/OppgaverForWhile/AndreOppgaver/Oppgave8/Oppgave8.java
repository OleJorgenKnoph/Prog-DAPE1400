/*
Palindrom er en sekvens med tegn som kan leses likt begge veier. Feks. 12321 er et palindrom.
 Skriv et program som leser inn et 5 sifret heltall og avgjør om dette er et palindrom eller ikke.
 Dersom ikke tallet er 5 siffer, les inn tallet på nytt.
  Tips: Bruk heltallsdivisjon og modulus for å finne de ulike sifrene i tallet.
 */
package OppgaverForWhile.AndreOppgaver.Oppgave8;

import javax.swing.*;

public class Oppgave8 {
    public static void main(String[] args) {
        String innTall = JOptionPane.showInputDialog("Skriv inn 5 siffer");

            if (innTall.length() == 5) {
                int tall = Integer.parseInt(innTall);

                    int tall5 = tall % 10;
                        int tall4 = (tall % 100) / 10;
                                //Trenger ikke sjekke tall3 da det er likt uans
                    int tall2 = (tall/1000) % 10;
                        int tall1 = tall / 10_000;

                        if (tall5 == tall1 && tall4 == tall2) {
                            JOptionPane.showMessageDialog(null, tall + " er et palindrom");
                        }
                            else {
                                JOptionPane.showMessageDialog(null, "Dette er ikke et palindrom");
                        }

            }
                else {
                    innTall = JOptionPane.showInputDialog("Det må være 5 siffer");
            }
    }
}
