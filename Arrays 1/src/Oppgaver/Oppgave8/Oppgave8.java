/*
Det skal lages et program som beregner gjennomsnittlig poengsummer for et antall elever - poengene er mellom 0 og 100.

Lag et program som først leser inn hvor mange poengsummer som skal leses inn.
Så skal det opprettes et heltalls-array med riktig lengde (fra input).
Deretter skal det leses inn poengsummer via en løkke samtidig som arrayet fylles.
Tilslutt skal det via en løkke beregnes gjennomsnittlig poengsum også vise dette på skjermen.
(Det er mulig å løse denne oppgaven enklere uten å bruke array, men oppgaven trener på bruk av arrays).

Bruk gjerne try/catch ved parsing av input og spør igjen om tall dersom det ikke er oppgitt riktig.
 */
package Oppgaver.Oppgave8;

import javax.swing.*;

public class Oppgave8 {
    public static void main(String[] args) {

        int antallPoengsummer;

        try {
            antallPoengsummer = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poengsummer"));
        }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "skriv inn gyldig tall");
                antallPoengsummer = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange poengsummer"));
            }


         int[] poengsum = new int[antallPoengsummer];

            for (int i = 0; i < poengsum.length; i++) {
                int poengsummene = Integer.parseInt(JOptionPane.showInputDialog("Hvor mye poeng fikk du"));

                poengsum[i] = poengsummene;
            }



            int totalPoengsum = 0;

                for (int j : poengsum) {
                    totalPoengsum += j;
                }

                JOptionPane.showMessageDialog(null, "Snitt poengsum: " + totalPoengsum / poengsum.length + "\n" +
                                                "Antall som tok prøven var " + poengsum.length + " og de fikk en total score på " + totalPoengsum);
    }
}
