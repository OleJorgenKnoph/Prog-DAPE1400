/*
Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.
 */
package Oppgaver.Oppgave7;

public class Oppgave7 {
    public static void main(String[] args) {
        int[] tall = {46, 34, 5, 8, 10, 2, 13, 25};

        int partall = 0;
        int oddetall = 0;

            for (int i : tall) {

                    if (i % 2 == 0) {
                        partall++;
                    }
                        else {
                            oddetall++;
                        }
            }
            System.out.print("Antall partall: " + partall + "\n Antall oddetall: " + oddetall);
    }
}
