/*
Definer et ArrayList array : 1,2,3,4,5,6,7,8,9.
Skriv kode for å konvertere dette til et vanlig heltalls-array.
Skriv så kode for å skrive ut det nye heltalls-arrayet
 */
package Oppgaver.Oppgave4;

import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i < 10; i ++) {
            array.add(i);
        }


        int [] array2 = new int[array.size()];

            for (int i = 0; i < array.size(); i++) {
                array2[i] = array.get(i);
            }

                for (int  i : array2) {
                    System.out.print(i + " ");
                }


    }
}
