package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

class Valuta{
    String sort;
    double kurs;

    public Valuta(String sort, double kurs) {
        this.sort = sort;
        this.kurs = kurs;
    }
    // sort og kurs
    // konstruktør
}

class Kalkulator {

    // array av Valuta
    public Valuta[] liste = new Valuta[3];

    public Kalkulator() {
        // legg inn Valuta objekter i arrayet
        Valuta usd = new Valuta("USD", 8.97);
        liste[0] = usd;

        Valuta eur = new Valuta("EUR", 10.65);
        liste[1] = eur;

        Valuta sek = new Valuta("SEK", 1.05);
        liste[2] = sek;
    }

    public String beregn(String valuta, String beløp) {
        // feilhåndter innlesning av tall
        // dersom det ikke er riktig returner feilmelding
        // ellers returner "Beregnet beløp blir ... kr"
        // og df.format() for å få to desimaler
        boolean funnet = false;
        String ut = "";

            for (Valuta enValuta : liste){
                if (enValuta.sort.equals(valuta)){
                    funnet = true;
                        try {
                            double innBeløp = Double.parseDouble(beløp);
                            if (innBeløp >= 0) {
                                double resultat = innBeløp * enValuta.kurs;
                                DecimalFormat df = new DecimalFormat("####0.00");
                                ut = "Beregnet beløp blir " + df.format(resultat) + " kr";
                            }
                            else ut = "Beløpet kan ikke være under 0";
                        }
                            catch (Exception e) {
                            ut = "Skriv inn gyldig tall";
                        }
                }
            }
            if (!funnet) {
                ut = "Skriv inn korrekt valutasort!";
            }
            return ut;
    }
}


public class Controller {

    // opprett kakulatoren her
    private Kalkulator valutaKalk = new Kalkulator();


    @FXML
    private TextField txtBeløp, txtValuta;

    @FXML
    private Label lblResultat;

    @FXML
    void beregnValuta(ActionEvent event) {

        String ut = valutaKalk.beregn(txtValuta.getText().toUpperCase(), txtBeløp.getText());
            lblResultat.setText(ut);
// kall fyllListe
        // kall beregn og legg resultatet ut i label'en


        }
    }
