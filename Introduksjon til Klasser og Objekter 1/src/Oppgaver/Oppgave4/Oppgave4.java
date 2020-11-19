/*
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
 */


package Oppgaver.Oppgave4;

import javax.swing.*;

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
        String ut = "";
        ut += "Navn: " + navn + "\n";
        ut += "Adresse: " + adresse + "\n";
        ut += "Telefonnr: " + tlfNr + "\n";
        ut += "Alder: " + alder + "\n";

            JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppgave4 {
    public static void main (String [] args) {

        String innNavn = JOptionPane.showInputDialog("Navn");
        String innAdresse = JOptionPane.showInputDialog("Adresse");
        String innTlf = JOptionPane.showInputDialog("Tlf-nummer");
        String innFodsels = JOptionPane.showInputDialog("Fødselsår");

        int tlf = Integer.parseInt(innTlf);
        int fodsels = Integer.parseInt(innFodsels);


        Person per = new Person();
        per.navn = innNavn;
        per.adresse =  innAdresse;
        per.tlfNr = tlf;
        per.fodselsaar = fodsels;

        per.skrivUt(per.beregnAlder());

    }
}
