package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    int[] priser = {36, 59, 82, 105, 128};

    @FXML
    private CheckBox chkRabatt;

    @FXML
    private Label lblResultat;

    @FXML
    private Label lblFeil;

    @FXML
    private TextField txtSoner;

    @FXML
    private TextField txtAntall;

    @FXML
    void beregnPris(ActionEvent event) {

        lblFeil.setText("");
        lblResultat.setText("");
        int antallPers = Integer.parseInt(txtAntall.getText());
        int antallSoner = Integer.parseInt(txtSoner.getText());

        if (antallPers > 0 && antallSoner >= 1 && antallSoner <= 5) {
              int pris = 0;
            for (int i = 0; i < priser.length; i++) {
                pris = priser[antallSoner - 1];
            }
            double sum = pris * antallPers;

            double nySum = 0;
            boolean sjekk = chkRabatt.isSelected();
            if (sjekk) {
                nySum = sum / 2;
                lblResultat.setText(nySum + "kr");
            }
            else {
                lblResultat.setText(sum + "kr");
            }
        } else {
            lblFeil.setText("Ugyldig antall eller soner");
        }
    }
}
