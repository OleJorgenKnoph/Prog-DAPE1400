/*
Definer følgende heltallsarray : 45, 34, 5, 8, 10, 2, 13, 25.
Lag et program som skriver ut tallene baklengs. (Dvs. 25, 13, 2 osv.) med en for-løkke.
Tips: Start fra array.length - 1 så lenge telleren i for-løkka er større eller lik 0.
Mink telleren med en hver gang.
 */
package Oppgaver.Oppgave4;

public class Oppgave4 {
    public static void main(String[] args) {
        int[] tall = {45, 34, 5, 8, 10, 2, 13, 25};

        for (int i = tall.length - 1; i >= 0; i--)
            System.out.print(tall[i] + ", ");
    }
}
