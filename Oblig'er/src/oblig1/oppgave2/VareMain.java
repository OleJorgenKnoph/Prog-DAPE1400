package oblig1.oppgave2;

import javax.swing.*;

public class VareMain {
    public static void main(String[] args) {
        // les inn navn, antall og pris for vare 1
        String vare1Navn = JOptionPane.showInputDialog("Navn vare1");
        String vare1Antall = JOptionPane.showInputDialog("Antall vare1");
        String vare1Pris = JOptionPane.showInputDialog("Pris vare1");

        // les inn navn, antall og pris for vare 2
        String vare2Navn = JOptionPane.showInputDialog("Navn vare2");
        String vare2Antall = JOptionPane.showInputDialog("Antall vare2");
        String vare2Pris = JOptionPane.showInputDialog("Pris vare2");

        // bruk avvikshåntering (try/catch) for å konvertere
        // antall og pris for vare 1 og vare 2
        int antallVare1 = 0;
        int antallVare2 = 0;
        double prisVare1 = 0;
        double prisVare2 = 0;
        try {
            antallVare1 = Integer.parseInt(vare1Antall);
            prisVare1 = Double.parseDouble(vare1Pris);

            antallVare2 = Integer.parseInt(vare2Antall);
            prisVare2 = Double.parseDouble(vare2Pris);
        }
            catch (Exception e){
                System.out.println(e);
            }

        // opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(vare1Navn, antallVare1, prisVare1);
        Vare vare2 = new Vare(vare2Navn, antallVare2, prisVare2);

        // beregn og skriv ut total pris for alle varer i System.out
        double totalPris1 = vare1.totalPris();
        double totalPris2 = vare2.totalPris();

        System.out.println("Du kjøpte" + antallVare1 + "stk av varen" + vare1Navn +
                            ". Denne koster " + prisVare1);
        System.out.println("Du kjøpte" + antallVare2 + "stk av varen" + vare2Navn +
                ". Denne koster " + prisVare2 + "\n\n");


        System.out.println("Totalprisen ble: " + (totalPris1+totalPris2));

    }
}
