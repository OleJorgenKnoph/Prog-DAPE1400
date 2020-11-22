/*
Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
Skriv ut element nummer 3 og 6 med System.out
 */
package Oppgaver.Oppgave1;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> helTall = new ArrayList<>();

            for (int i = 1; i < 10; i++) {
                helTall.add(i);
            }
            System.out.println(helTall);

        System.out.print(helTall.get(3) + " " + helTall.get(6));


    }
}
