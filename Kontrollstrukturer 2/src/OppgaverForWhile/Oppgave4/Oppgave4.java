/*
Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)
 */
package OppgaverForWhile.Oppgave4;

public class Oppgave4 {
    public static void main(String[] args) {

        int sumAvPartall = 0;
        double snitt = 0;

            for (int i = 0; i < 100; i+=2) {
                sumAvPartall += i;
                snitt++;
            }
            System.out.println("Summen av alle partall er " + sumAvPartall + ". Snittet er " + (double)sumAvPartall / snitt);
    }
}
