package Oppgaver.Oppgave5;

import javax.swing.*;

public class Bank
{
    public static void main(String[] args)
    {
       String innNavn = JOptionPane.showInputDialog("Navn");
       String innKontonummer = JOptionPane.showInputDialog("Kontonr");
       String innSaldo = JOptionPane.showInputDialog("Saldo");

        String setteInnOnske = JOptionPane.showInputDialog("Ønsker du å sette inn penger? Hvis ikke bare klikk ok");
        String uttakOnske = JOptionPane.showInputDialog("Ønsker du å ta ut penger? Hvis ikke bare klikk ok");

        double saldo = Double.parseDouble(innSaldo);

            Konto konto2 = new Konto(innNavn, innKontonummer, saldo);

        if (!setteInnOnske.equals("")) {
            String setteInnBelop = JOptionPane.showInputDialog("Hvor mye vil du sette inn?");
                double innBelop = Double.parseDouble(setteInnBelop);
            konto2.setSaldo(innBelop);
        }
                else if (!uttakOnske.equals("")) {
                    String taUtBelop = JOptionPane.showInputDialog("Hvor mye vil du ta ut?");
                    double utBelop = Double.parseDouble(taUtBelop);
                    konto2.uttak(utBelop);
            }


  /*   Opprett et Konto-objekt, som ved opprettelsen blir tilført
        navn, kontonummer og saldo.*/
        Konto konto1 = new Konto("Per Hansen", "12345678", 1500);


    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon*/

        konto1.uttak(2000); //Tar ut 2000kr
        konto1.setSaldo(2000); // setter inn 2000kr
        konto1.kontoUtskrift(); //Skriver ut alle verdier*/

        konto2.kontoUtskrift();



    }
} // end of class Kontotest
