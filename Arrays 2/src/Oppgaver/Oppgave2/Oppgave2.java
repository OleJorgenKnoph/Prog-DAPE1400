/*
Bruk samme array som i oppgave 1.
 Legg til tallene 10 og 11 i arrayet. Slett så elementene med tallene 2 og 3.
 Skriv så ut hele arrayet med en for-løkke. Bruk size() for å finne lengden i arrayet.
 */
package Oppgaver.Oppgave2;

import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args) {
        ArrayList<Integer> helTall = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            helTall.add(i);
        }

            helTall.add(10);
            helTall.add(11);

            int tall2 = 0;
            int tall3 = 0;

            for (int j = 0; j < helTall.size(); j++){

                tall2 = helTall.indexOf(2);
                tall3 = helTall.indexOf(3);
            }
                helTall.remove(tall2);
                helTall.remove(tall3-1); //blir 1 mindre tall i rekka når tall2 removes


        for (Integer verdi : helTall) {

            System.out.print(verdi + " ");
        }

    }
}
