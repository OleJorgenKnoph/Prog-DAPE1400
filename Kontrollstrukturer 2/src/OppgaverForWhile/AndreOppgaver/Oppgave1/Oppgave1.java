/*
Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt. Les inn ved hjelp av inputbokser (JOptionPane).
Når lengden på turen er 0 eller negativ avsluttes innlesningen og det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.
 */
package OppgaverForWhile.AndreOppgaver.Oppgave1;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        int antallKm = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange kilometer? (skriv 0 for å avslutte)"));
        double antallLiter = Double.parseDouble(JOptionPane.showInputDialog("Hvor mange liter brukt?"));

            int totaltAntallKm = 0;
            double totaltAntallLiter = 0;

                while (antallKm > 0) {
                    totaltAntallKm += antallKm;
                    totaltAntallLiter += antallLiter;

                    antallKm = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange kilometer? (skriv 0 for å avslutte)"));
                    if (antallKm <= 0) {
                        break;
                    }
                    antallLiter = Double.parseDouble(JOptionPane.showInputDialog("Hvor mange liter brukt?"));

                }

                JOptionPane.showMessageDialog(null, "Gjennomsnittsforbruk pr mil = " +  String.format("%.2f",(totaltAntallKm/10) / totaltAntallLiter));
    }
}
