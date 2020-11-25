package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

class Observasjoner {
    private  String dato;
    private double temperatur;
    private double nedbør;

    public Observasjoner(String dato, String temperatur, String nedbør) {
        this.dato = dato;
        this.temperatur = Double.parseDouble(temperatur);
        this.nedbør = Double.parseDouble(nedbør);
    }

    public String getDato() {
        return dato;
    }
        public void setDato(String dato) {
            this.dato = dato;
        }

    public double getTemperatur() {
        return temperatur;
    }
        public void setTemperatur(double temperatur) {
            this.temperatur = temperatur;
        }

    public double getNedbør() {
        return nedbør;
    }
        public void setNedbør(double nedbør) {
            this.nedbør = nedbør;
        }
}

public class Controller {

    //legg inn en ArrayList kalt register her (av type Observasjoner)
        ArrayList<Observasjoner> register = new ArrayList<>();

    @FXML
    private TextField txtDato;

    @FXML
    private TextField txtTemp;

    @FXML
    private TextField txtNedbør;

    @FXML
    private Label lblSnittRegn;

    @FXML
    private Label lblSnittTemp;

    @FXML
    private Label lblRegVær;

    @FXML
    void regVær(ActionEvent event) {

        Observasjoner regVær = new Observasjoner(txtDato.getText(), txtTemp.getText(), txtNedbør.getText());
            register.add(regVær);
        lblRegVær.setText("Vær for " + txtDato.getText() + " ble registrert.");

        lblSnittTemp.setText("");
        lblSnittRegn.setText("");

    }

    @FXML
    void slettRegister(ActionEvent event) {
        for (Observasjoner sjekk : register){
            if (!txtDato.equals(sjekk.getDato())){
                register.remove(sjekk);
                lblRegVær.setText("Værregistreringen for " + sjekk.getDato() + " er slettet");
                break;
            }
        }
        txtDato.clear();
        txtTemp.clear();
        txtNedbør.clear();

        lblSnittTemp.setText("");
        lblSnittRegn.setText("");
    }

    @FXML
    void snittRegn(ActionEvent event) {
    double nedbørSum = 0;
    int antallReg = 0;

        for (Observasjoner i : register){
            nedbørSum += i.getNedbør();
            antallReg++;
        }
    double snitt = nedbørSum / antallReg;
        lblSnittRegn.setText("Snitt nedbør: " + snitt);

        lblRegVær.setText("");
        lblSnittTemp.setText("");
    }

    @FXML
    void snittTemp(ActionEvent event) {
        double tempSum = 0;
        int antallReg = 0;

        for (Observasjoner i : register){
            tempSum += i.getTemperatur();
            antallReg++;
        }
        double snitt = tempSum / antallReg;
        lblSnittTemp.setText("Snitt temperatur: " + snitt);

        lblRegVær.setText("");
        lblSnittRegn.setText("");
    }

    @FXML
    void nyttVær(ActionEvent event) {
        txtDato.clear();
        txtTemp.clear();
        txtNedbør.clear();

        lblSnittTemp.setText("");
        lblSnittRegn.setText("");
        lblRegVær.setText("");
    }
}