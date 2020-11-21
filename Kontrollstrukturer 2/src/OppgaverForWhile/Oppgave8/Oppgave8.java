/*
Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).

Finn også gjennomsnittet.
 */
package OppgaverForWhile.Oppgave8;

public class Oppgave8 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        double snittAntall = 0;

            while (i < 100) {
                sum += i;
                    snittAntall++;
                        i+=2;
            }
                System.out.println("Summen er lik " + sum + " og snittet er "+ (double)sum / snittAntall);

    }
}
