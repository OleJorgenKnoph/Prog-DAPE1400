/*
Lag en while-løkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)
 */
package OppgaverForWhile.Oppgave6;

public class Oppgave6 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

            while (i < 10) {
                sum += i;
                i++;
            }
                System.out.println("Summen av tallene mellom 0 og 10 er " + sum);
    }
}
