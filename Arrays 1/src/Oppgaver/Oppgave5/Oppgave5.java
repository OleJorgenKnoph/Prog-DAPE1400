/*
Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
Tips: Sett største og minste tallet til første elementet i arrayet før løkken.
 */
package Oppgaver.Oppgave5;


public class Oppgave5 {
    public static void main(String[] args) {

        int[] tall = {45, 34, 5, 8, 10, 2, 13, 25};

        int størst = tall[0];
        int minst = tall[0];

        for (int i : tall) {

                    if (i >= størst) {
                        størst = i;
                    }
                        else if (i < minst) {
                            minst = i;
                    }
        }
            System.out.println("Det største tallet er " + størst);
            System.out.println("Det minste tallet er " + minst);
    }
}
