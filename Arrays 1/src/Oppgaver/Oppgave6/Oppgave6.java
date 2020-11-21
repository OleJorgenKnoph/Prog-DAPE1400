/*
Lag et program som sjekker om to heltalls-arrays er like. Bruk løkker, ikke innebygd java klasse/metode.
 */
package Oppgaver.Oppgave6;

public class Oppgave6 {
    public static void main(String[] args) {
        int[] liste1 = {1,2,3,4,5};
        int[] liste2 = {1,2,3,4,5};
        
        if (liste1.length != liste2.length){
            System.out.print("De er ikke like lange");
        }
            else {
                boolean like = true;

                    for (int i = 0; i < liste1.length; i++) {

                        if (liste1[i] != liste2[i]) {
                            like = false;
                        }
                    }
            if (like) {
                System.out.print("Arrayene er like");
            }
            if (!like) {
                System.out.print("Arrayene er ikke like");
            }
        }
            

    }
}
