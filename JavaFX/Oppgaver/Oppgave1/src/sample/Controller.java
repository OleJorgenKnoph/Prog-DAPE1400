package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Bil{
    public  String bilNummer;
    public  Date startTid;
    public int plass;
    public boolean kortTid; // true = korttids parkering


    public Bil(String bilNummer, Date startTid, boolean kortTid) { //Konstruktør
        this.bilNummer = bilNummer;
        this.startTid = startTid;
        this.kortTid = kortTid;
    }

    public String formaterKvittering(){
        String startDatoTid = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(startTid);
        String nå = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date());

        return "Kvittering for bilnr " + bilNummer + "\n" +
                "Starttid: " + startDatoTid + " til " + nå + "\n"+
                "Betalt: " + avgift() + " kr \n";
        // formater kvitteringen etter oppgitt format
    }

    public double getPris(){
        if (this.kortTid){
            return 10;
        }
        else {
            return 20;
        }
        // returner 10 eller 20 kroner avhengig av kortTid eller ikke
    }
    public double avgift(){
        Date nå = new Date();
        long varighetMilli = nå.getTime() - startTid.getTime();
        int varighetT = (int)varighetMilli / 1000;  //Dette -> hadde gitt for 1t /*3_600_000*7;
        //Men lettere å teste ved 10s
        return varighetT - getPris();
        // regner ut tiden som er gått i timer og ganger med prisen
    }
}

class Parkeringshus{
    public ArrayList<Bil> parkering = new ArrayList<>();
    // opprett arrayet av biler

    public void reserverPlass(Bil enBil){
        parkering.add(enBil);
        // legg bilen i arrayet
    }

    public String frigjørPlass(String bilNummeret){
        //må finne bilen i arrayet
        for (Bil enBil : parkering){
            if (enBil.bilNummer.equals(bilNummeret)){
                //Bilen er funnet
                parkering.remove(enBil);
                return enBil.formaterKvittering();
            }
        }
        return "Fant ikke bilen";
        /* ** når den er funnet slett den fra arrayet
         ** og formater kvitteringen som returneres
         ** dersom bilen ikke finnes skal man returnere en passenede tekst
         */
    }

}

public class Controller {

    Parkeringshus pHus = new Parkeringshus();

    @FXML
    private TextField txtBilnummer;

    @FXML
    private Label lblUtskrift;

    @FXML
    void kjør(ActionEvent event) {

        String melding = pHus.frigjørPlass(txtBilnummer.getText());
        lblUtskrift.setText(melding);

// kall frigjør plass og legg ut kvitteringen i lblAvgift
    }

    @FXML
    void beregnKorttidsPark(ActionEvent event) {
Date nå = new Date();
        Bil enBil = new Bil(txtBilnummer.getText(), nå, true);

            pHus.reserverPlass(enBil);

        // opprett en bil
        // og kall på reserver plass
    }

    @FXML
    void beregnLagtidsPark(ActionEvent event) {
        Date nå = new Date();
        Bil enBil = new Bil(txtBilnummer.getText(), nå, false);

        pHus.reserverPlass(enBil);
        // opprett en bil
        // og kall på reserver plass
    }

}