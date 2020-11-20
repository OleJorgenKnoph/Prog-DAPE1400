package Oppgaver.Oppgave5;

import javax.swing.*;

public class Konto {

    //  Attributtene for kontoinnehavers navn, kontonummer og saldo.
    private String navn;
    private String kontonummer;
    private double saldo;

    //  Kontruktør som skal gi startverdier til ALLE attributtene
        public Konto (String navn, String kontonummer, double saldo) {
            this.navn = navn;
            this.kontonummer = kontonummer;
            this.saldo = saldo;
        }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
        public void kontoUtskrift () {

            String ut = "Kontoeier \n" +
                        "Navn: " + navn + "\n" +
                        "Kontonummer: " + kontonummer + "\n" +
                        "Saldo: " + saldo + " kr";

            JOptionPane.showMessageDialog(null, ut);
        }


    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

        public double setSaldo (double saldo) {
            this.saldo = this.saldo + saldo;
                return saldo;
        }

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

        public double uttak (double uttakBelop) {
            if (saldo >= uttakBelop) {
                this.saldo = saldo - uttakBelop;
            }
                else {
                    JOptionPane.showMessageDialog(null,"Du har ikke nok penger til å ta ut så mye.");
            }
            return saldo;
        }

} // end of class Konto
