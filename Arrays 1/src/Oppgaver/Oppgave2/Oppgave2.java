/*
Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
 Finn så gjennomsnittet av alle tallene.
  Summer så alle tallene som er større enn 5.
   Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.
 */
package Oppgaver.Oppgave2;

public class Oppgave2 {
    public static void main(String[] args) {

        int[] heltallArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        int sumOver5 = 0;
        int antallOver5 = 0;


            for (int i = 0; i < heltallArray.length; i++) {

                sum += heltallArray[i];
            }
                System.out.println("Summen av alle tallene er " + sum + " og snittet av alle disse er " + String.format("%.2f", ((double)sum / heltallArray.length)));


                for (int tall : heltallArray) {

                        if (tall > 5 ) {
                            sumOver5 += tall;
                            antallOver5++;
                        }
                }
                System.out.println("Summen av tallene over 5 er " + sumOver5 + " og snittet av disse er " + String.format("%.2f", ((double)sumOver5 / antallOver5)));


    }
}
