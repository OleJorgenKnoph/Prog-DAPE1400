package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.CheckBox;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label lblSkrivUt;

    @FXML
    private TextField txtFornavn;

    @FXML
    private TextField txtEtternavn;

    @FXML
    private CheckBox chxSmor;

    @FXML
    private CheckBox chxMelk;

    @FXML
    private CheckBox chxBrod;

    @FXML
    void trykkMeg(ActionEvent event) {
        String ut;

        String fornavn = txtFornavn.getText();
        String etternavn = txtEtternavn.getText();

        String navn =  fornavn + " " + etternavn;

            ut = navn + " har bestilt følgende varer: \n ";

            if (chxSmor.isSelected()) {
                ut += "Smør \n";
            }
                if (chxMelk.isSelected()){
                    ut += "Melk \n";
            }
                    if (chxBrod.isSelected()){
                        ut += "Brød \n";
                    }

        lblSkrivUt.setText(ut);
    }

}


