package Oppgaver.oppgave8;
//Regnet meg frem til -1. Parentes først. Deretter multiplikasjon/divisjon, addisjon/subtraksjon til slutt

public class oppgave8 {
    public static void main (String [] args) {

            double tall1=1;
            double tall2=2;
            double resultat;
            resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
            System.out.println(resultat);
    }
}
//Resultat stemte
