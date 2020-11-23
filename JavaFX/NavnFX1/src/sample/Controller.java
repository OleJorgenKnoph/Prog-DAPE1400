package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label lblNavn;

    @FXML
    private TextField txtFornavn;

    @FXML
    private TextField txtEtternavn;

    @FXML
    void trykkMeg(ActionEvent event) {

            String fornavn = txtFornavn.getText();
            String etternavn = txtEtternavn.getText();

            String navn = fornavn + " " + etternavn;

                lblNavn.setText(navn);
    }

}
