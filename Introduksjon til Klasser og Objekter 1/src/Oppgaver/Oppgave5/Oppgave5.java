/*
Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver. Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
 */

package Oppgaver.Oppgave5;

    class Kalkulator {
        double tall1;
        double tall2;

        public static double addere (double tall1, double tall2) {
            return tall1 + tall2;
        }
            public static double subtrahere (double tall1, double tall2) {
                return tall1 - tall2;
            }
                public static double multiplisere (double tall1, double tall2) {
                    return tall1 * tall2;
                }
                    public static double dividere (double tall1, double tall2) {
                        return tall1 / tall2;
                    }
    }

public class Oppgave5 {
    public static void main (String [] args) {

        double tall1 = 5;
        double tall2 = 3;

        Kalkulator regnestykke = new Kalkulator();
            regnestykke.tall1 = tall1;
            regnestykke.tall2 = tall2;

            System.out.println("De to tallene addert blir " + Kalkulator.addere(tall1, tall2));
            System.out.println("De to tallene subtrahert blir " + Kalkulator.subtrahere(tall1, tall2));
            System.out.println("De to tallene multiplisert blir " + Kalkulator.multiplisere(tall1, tall2));
            System.out.println("De to tallene dividert blir " + String.format("%.2f", Kalkulator.dividere(tall1, tall2)));
    }
}
