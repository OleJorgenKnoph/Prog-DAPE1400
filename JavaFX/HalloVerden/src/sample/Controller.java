package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label lblUt;

    public void trykkMeg() {
        lblUt.setText("Hello Verden!");
    }
}
