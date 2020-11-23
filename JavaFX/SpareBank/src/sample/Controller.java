package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtBelop;

    @FXML
    private TextField txtAntallAar;

    @FXML
    private TextField txtRente;

    @FXML
    private Label lblUt;

    @FXML
    void beregnSparing(ActionEvent event) {


        try {
            double startBeløp = Double.parseDouble(txtBelop.getText());
            double rente = Double.parseDouble(txtRente.getText());
            int år = Integer.parseInt(txtAntallAar.getText());

                double resultat = startBeløp * Math.pow(1+(rente/100) , år);


            String ut = "Hvis du sparer " + startBeløp + " kroner i " + år + " år med rente lik " + String.format("%.2f",(rente)) + ". \n";
            ut+= "Da vil du tjene " + String.format("%.2f",(resultat - startBeløp)) + " kroner, og ha totalt " + String.format("%.2f",(resultat)) + " kroner på kontoen.";

            lblUt.setText(ut);
        }
        catch (Exception e) {
            lblUt.setText("Skriv inn gyldige tall. \n Husk . istedenfor ,");
        }


    }

}
