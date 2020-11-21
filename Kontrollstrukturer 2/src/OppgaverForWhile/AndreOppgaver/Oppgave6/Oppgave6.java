/*
Lag et program som viser følgene ut (med tab):

N       N^2       N^3        N^4
1            1           1             1
2            4           8             16
3            9           27           81

..... frem til N=10.

Bruk gjerne metoden i Java : MATH.pow(grunntall, eksponent).
 */
package OppgaverForWhile.AndreOppgaver.Oppgave6;

public class Oppgave6 {
    public static void main(String[] args) {
        System.out.println("N    " + "N^2    " + "N^3    " + "N^4    ");

            for (int i = 0; i <= 10; i++) {
                System.out.println(i + "    " + Math.pow(i, 2) + "    " + Math.pow(i, 3) + "    " + Math.pow(i, 4));
        }

    }
}
