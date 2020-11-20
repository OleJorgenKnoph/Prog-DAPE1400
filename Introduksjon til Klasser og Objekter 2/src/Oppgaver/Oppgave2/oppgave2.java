/*
Generer klassediagrammer fra klassene i oppgavene over.
 */


//Høyre-klikk på begge klassene i sidemeny -> diagrams -> show diagrams

package Oppgaver.Oppgave2;

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

public class oppgave2 {
    public static void main (String [] args) {

        String fornavn = JOptionPane.showInputDialog("Fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Etternavn: ");
        String adr = JOptionPane.showInputDialog("Adresse: ");
        String tlfNr = JOptionPane.showInputDialog("Telefonnummer: ");

        Person person1 = new Person(fornavn, etternavn, adr, tlfNr);
        person1.skrivUt();
    }
}
