/*
Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår
Lag en metode for å regne ut alderen til en person. Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut.
 */

package Oppgaver.Oppgave3;

    class Person {
            //Oppretter attributtene
        String navn;
        String adresse;
        int tlfNr;
        int fodselsaar;

        //metode som finner alder basert på fødselsår. ingen parametre tas inn
        public int beregnAlder() {
            return 2020 - fodselsaar;
        }

            //metode som skriver ut data.
            public void skrivUt(int alder) {
                System.out.println(navn + " med adresse " + adresse + " med telefonnummer " + tlfNr + " er " + alder + " år.");
            }
    }

public class Oppgave3 {
    public static void main (String [] args) {

        //Lager en ny person Per. med tilhørende attributter
        Person per = new Person();
            per.navn = "Per Hansen";
            per.adresse =  "Osloveien 82";
            per.tlfNr = 22124512;
            per.fodselsaar = 1999;

                //Deklarerer ny variabel alder som regnes ut i andre klassen basert på attributtene over
                int alder = per.beregnAlder();

            //Kaller på metoden som skriver ut. Men henter inn parametre alder som ble regnet ut over
            per.skrivUt(alder);

        Person ole = new Person();
            ole.navn = "Ole Jørgen Knoph";
            ole.adresse = "Olav M. Troviks vei 58";
            ole.tlfNr = 95470772;
            ole.fodselsaar = 2000;

                //Snarvei
                ole.skrivUt(ole.beregnAlder());
    }
}
