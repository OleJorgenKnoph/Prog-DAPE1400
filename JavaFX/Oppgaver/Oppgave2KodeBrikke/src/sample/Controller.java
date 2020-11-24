package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;
import javafx.event.ActionEvent;

class KodeGenerator {
    private int[] kodeArray;
    private Random r = new Random();
    private int nyKodeIndeks = 0;

   public KodeGenerator(int antall) {

        kodeArray = new int[antall];
            genererKoder();

        /* opprett array
           kall genererKoder for å legge kodene inn i arrayet*/
    }

    private void genererKoder() {

        for(int i = 0; i < kodeArray.length; i++){
            kodeArray[i] = 100_000 + r.nextInt(1_000_000);
        }

        /* Fyller  kodeArray med tilfeldige, 6-sifrede tall.
           NB! Det laveste mulige tallet skal være 100000, og det høyeste 999999. */
    }

    public String nyKode(int maksAntall) {
        if (nyKodeIndeks < maksAntall){
            return Integer.toString(kodeArray[nyKodeIndeks++]);
        }
        return "Maks antall";

        // returnerer ny kode fra arrayet eller en feilmelding ved array-slutt
    }

    public String formaterBrukteKoder() {
        String ut ="";
        for (int i = 0; i < nyKodeIndeks; i++){
            ut += (i+1) + ": " + kodeArray[i] + "\n";
        }
        return ut;
        /* løp igjennom arrayet og formater kodene med \n i mellom
            kodene fra og med 0 til nyKodeIndeks er "brukte" koder */
    }
}


public class Controller {

    public final int MAKS_ANTALL=10;

    // opprett KodeGeneratoren her
    private KodeGenerator generator = new KodeGenerator(MAKS_ANTALL);

    @FXML
    private Label lblKodeNy;

    @FXML
    private Label lblGamleKoder;

    @FXML
    void gamleKoder(ActionEvent event) {
            lblGamleKoder.setText(generator.formaterBrukteKoder());

// kall til formaterBrukteKoder og legg resultatet i lblGamleKoder
    }

    @FXML
    void nyKode(ActionEvent event) {
        lblKodeNy.setText(generator.nyKode(MAKS_ANTALL));
// kall til nyKode og legg resultat i lblNykode
    }

}