/*
Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et ArrayList.
 Skriv så ut denne ArrayListen.
 */
package Oppgaver.Oppgave3;

import java.util.ArrayList;


public class Oppgave3 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> array2 = new ArrayList<>();

            for (int i : array) {
                array2.add(i);
            }

                for (int i : array2) {
                    System.out.print(i + " ");
                }
    }
}
