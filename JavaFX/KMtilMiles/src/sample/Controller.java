package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private Label lblUt;

    @FXML
    private ToggleGroup gruppe1;

    @FXML
    private ToggleGroup gruppe2;

    @FXML
    private TextField txtAntall;

    @FXML
    void Konverter(ActionEvent event) {
        RadioButton konvertFra = (RadioButton) gruppe1.getSelectedToggle();
        RadioButton konvertTil = (RadioButton) gruppe2.getSelectedToggle();

            String knappFra = konvertFra.getText();
            String knappTil = konvertTil.getText();

            int antall = 0;
            double resultat = 0;

                if (knappFra.equals("Kilometer") && knappTil.equals("Miles")){

                        antall = Integer.parseInt(txtAntall.getText());

                            resultat = antall / 1.609;
                }
                    if (knappFra.equals("Miles")  && knappTil.equals("Kilometer")){

                        antall = Integer.parseInt(txtAntall.getText());

                            resultat = antall * 1.609;
                    }

                        else {
                            lblUt.setText("Skriv inn gyldig antall");
                    }

                        lblUt.setText(antall + " " + knappFra + " er lik " + String.format("%.2f",resultat) + " " + knappTil);

    }

}
