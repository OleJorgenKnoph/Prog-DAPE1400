/*
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr
Lag en konstruktør som setter disse ved instansiering av klassen. Lag så «get», «set» metoder for disse.

Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.

Skriv så kode i «main» for å lese inn dataene via Swing sin input, opprette et objekt og kalle metoden over for å vise disse.
 */

package Oppgaver.Oppgave1;

import javax.swing.*;

class Person {
        private String fornavn;
        private String etternavn;
        private String adr;
        private String tlfNr;

            public Person (String fornavn, String etternavn, String adr, String tlfNr) {
                this.fornavn = fornavn;
                this.etternavn = etternavn;
                this.adr = adr;
                this.tlfNr = tlfNr;
            }
//Står man skal ha getter og setter men skjønner ikke hvorfor. Skrevet likt som i fasit, men metodene blir ikke brukt
                /*public String getFornavn() {
                return fornavn;
                }
                    public void setFornavn(String fornavn) {
                        this.fornavn = fornavn;
                    }

                public String getEtternavn() {
                    return etternavn;
                }
                    public void setEtternavn(String etternavn) {
                        this.etternavn = etternavn;
                    }

                public String getAdr() {
                    return adr;
                }
                    public void setAdr(String adr) {
                        this.adr = adr;
                    }

                public String getTlfNr () {
                    return adr;
                }
                    public void setTlfNr (String adr) {
                        this.adr = adr;
                    }
*/
                            public void skrivUt() {
                                String ut = "";
                                    ut += "Navn: " + fornavn + " " + etternavn + "\n";
                                    ut += "Adresse: " + adr + "\n";
                                    ut += "Telefonnummer: " + tlfNr + "\n";

                                        JOptionPane.showMessageDialog(null, ut);
                            }
    }

public class oppgave1 {
    public static void main (String [] args) {

        String fornavn = JOptionPane.showInputDialog("Fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Etternavn: ");
        String adr = JOptionPane.showInputDialog("Adresse: ");
        String tlfNr = JOptionPane.showInputDialog("Telefonnummer: ");

            Person person1 = new Person(fornavn, etternavn, adr, tlfNr);
                person1.skrivUt();
    }
}
