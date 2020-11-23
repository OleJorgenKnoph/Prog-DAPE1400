package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ToggleGroup grupp1;

    @FXML
    private Label lblUt;

    @FXML
    void SjekkKnapp(ActionEvent event) {

        RadioButton valgtKnapp = (RadioButton) grupp1.getSelectedToggle();

        String radioknapp = valgtKnapp.getText();

            if (radioknapp.equals("Knapp1")){
                lblUt.setText("Knapp1 er valgt");
            }
                if (radioknapp.equals("Knapp2")){
                    lblUt.setText("Knapp2 er valgt");
                }
    }

}
