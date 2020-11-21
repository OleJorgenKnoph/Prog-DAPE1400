/*
Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
Skriv så ut for og etternavn på flere linjer med en løkke som vist under:

Per Hansen
Line Olsen
 */
package Oppgaver.Oppgave3;


public class Oppgave3 {
    public static void main(String[] args) {

            String[] personer = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

            for (int i = 0; i < personer.length; i+=2) {
                System.out.println(personer[i] + " " + personer[i+1]);
            }
    }
}
