/*OPPGAVE 1
Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:

tittel
pris
forfatter
iSBN-nummer
Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.

Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier. Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
*/

package Oppgaver.Oppgave1;

    class Bøker {
        String tittel;
        double pris;
        String forfatter;
        String iSBNnr;

        public void skrivUt() {

                System.out.println(tittel);
                System.out.println(pris);
                System.out.println(forfatter);
                System.out.println(iSBNnr);
        }
    }

public class oppgave1 {
    public static void main (String [] args) {

        Bøker bok1 = new Bøker();

            bok1.tittel = "Tause Skrik";
            bok1.pris = 299;
            bok1.forfatter = "Arne Svingen";
            bok1.iSBNnr = "3456789876";

            bok1.skrivUt();
    }
}
