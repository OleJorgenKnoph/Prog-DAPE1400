package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

class Film{
    public String tittel;
    public double utLeiePris;
    public Person leidAv;

    public  Film(String tittel, double utLeiePris, Person leidAv){
        this.tittel = tittel;
        this.utLeiePris = utLeiePris;
        this.leidAv = leidAv;
    }

}

class Person{
    public String navn;
    public String telefonnr;

    public Person(String navn, String telefonnr) {
        this.navn = navn;
        this.telefonnr = telefonnr;
    }
    // konstruktør inn her
}

class FilmUtleie{

    // instansier arrayet her
    ArrayList<Film> filmUtleie = new ArrayList<>();

    public FilmUtleie() {

        Film film1 = new Film("hodejegerne", 50, null);
            filmUtleie.add(film1);

        Film film2 = new Film("harry potter", 35, null);
        filmUtleie.add(film2);

        // legg inn filmene som skal være til utleie her
        // to filmer holder
    }

    public String leiUt(String navn, String telefonnr, String tittel){
        String ut ="";
        // sjekk om filmen finnes og at den ikke er leid ut (at leidAv er null)
        for (Film utleie : filmUtleie){
                if (utleie.tittel.equals(tittel)) {
                    if (utleie.leidAv == null) {
                        utleie.leidAv = new Person(navn, telefonnr);
                        ut = "Utleie var vellykket \n";
                        ut += "Utleid " + tittel + " til " + navn + " med telefonnr " + telefonnr +
                                " for " + utleie.utLeiePris + " kroner. \n Kos deg!";
                    }
                    else {
                        ut = "Vi har filmen, men den er allerede leid ut...";
                            }
                }
                    else {
                        ut = "Vi har dessverre ikke den filmen";
                }
        }
        return ut;
        // returner meldinger om det var vellykket utleie
        // om ikke filmen fantes
        // eller om filmen fantes men den var utleid

    }

    public String leverInn(String tittel){
        // sjekk om filmen finnes og at den er utleid (at det er et personobjekt på leidAv)
        // dersom dette nullstill person-pekeren i filmen og returner at den ble levert
        // returner feilmelding dersom filmen ikke finnes
        // returner også feilmelding dersom filmen finnes med ikke er utleid
        String ut ="";
        for (Film utleie : filmUtleie){
            if (utleie.leidAv != null){
                if (utleie.tittel.equals(tittel)){
                        ut = "Du har levert inn filmen " + tittel;
                    utleie.leidAv = null;
                }
                 if (!utleie.tittel.equals(tittel)){
                        ut = "Denne filmen eksisterer ikke";
                }
            }
            else {
                ut = "Det er ingen som har leid ut denne filmen";
            }
        }
        return ut;
    }

    @Override
    public String toString(){
        // løp igjennom hele registrert og formater
        String ut = "";
            for (Film filmene : filmUtleie){
                ut += "Tittel: " + filmene.tittel + "\n";
                ut += "Pris for leie: " + filmene.utLeiePris + " kr \n\n";
            }
            return ut;

    }
}

public class Controller {

    private FilmUtleie filmene = new FilmUtleie();

    @FXML
    private Label lblOversikt;

    @FXML
    private TextField txtKundeNavn;

    @FXML
    private TextField txtTlf;

    @FXML
    private TextField txtTittel;

    @FXML
    void leiUt(ActionEvent event) {

            lblOversikt.setText(filmene.leiUt(txtKundeNavn.getText(), txtTlf.getText(), txtTittel.getText().toLowerCase()));
    }

    @FXML
    void leverInn(ActionEvent event) {

        lblOversikt.setText(filmene.leverInn(txtTittel.getText().toLowerCase()));
    }

    @FXML
    void visUtleie(ActionEvent event) {

        lblOversikt.setText(filmene.toString());

    }

}