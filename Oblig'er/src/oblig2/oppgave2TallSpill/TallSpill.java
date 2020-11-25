package oblig2.oppgave2TallSpill;

import javax.swing.*;

class spillTall
{
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        JOptionPane.showMessageDialog(null, melding);
        }

    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        visMelding(tall + " er for lavt. Prøv igjen");
    }

    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        visMelding(tall + " er for stort. Prøv igjen");
    }

    public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        JOptionPane.showMessageDialog(null, gjetning + " er helt riktig! Grattis! \n Du brukte bare "+ antall+ " forsøk \n");

    }

    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        int inputVerdi = 0;
        int tall = nyttTall();
        int teller = 0;
        int lavestTall = 0;
        int høyestTall = 200;
        boolean spillKjører = true;

            while (spillKjører){

                String input = JOptionPane.showInputDialog(null, "Gjett et tall mellom " + lavestTall + " og " + høyestTall);

                try {
                    inputVerdi = Integer.parseInt(input);
                    teller++;
                        if (inputVerdi < tall){
                            forLite(inputVerdi);
                        }
                        else if (inputVerdi > tall){
                            forStort(inputVerdi);
                        }
                            else {
                                avsluttRunde(teller, inputVerdi);
                                spillKjører = false;
                        }
                }
                catch (Exception e){
                    visMelding("Skriv inn et tall mellom " + lavestTall + " og " + høyestTall);
                }
            }
    }
}

public class TallSpill {
    public static void main(String[] args) {

        spillTall spill = new spillTall();
        spill.kjørSpill();

    }
}
