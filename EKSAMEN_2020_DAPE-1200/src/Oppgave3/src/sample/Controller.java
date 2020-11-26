package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label lblAntallRett;

    @FXML
    private Label lblAntallFeil;

    /*@FXML
    private Label lblProsentRett;*///FEIL

    @FXML
    private Label lblRettProsent;

    @FXML
    private Label lblFeilProsent;

    @FXML
    private Label lblOppgave;

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtSvar;

    int tall1 = 0;
    int tall2 = 0;
    int antallRiktige;
    int antallFeil;

    @FXML
    void nullstill(ActionEvent event) {
        antallRiktige = 0;
        antallFeil = 0;
        lblResultat.setText("");
        lblFeilProsent.setText("");
        lblAntallFeil.setText("");
        lblRettProsent.setText("");
        lblAntallRett.setText("");
        lblOppgave.setText("");
    }

    @FXML
    void nyOppgave(ActionEvent event) {
        tall1 =(int) (Math.random() * 10 + 1);
        tall2 =(int) (Math.random() * 10 + 1);
        lblOppgave.setText("Hva blir " + tall1 + " x " + tall2 + "?");
    }

    @FXML
    void svar(ActionEvent event) {
        int svar = 0;
        lblRettProsent.setText("");
        lblFeilProsent.setText("");
        if (txtSvar.getText().isEmpty()){
            lblResultat.setText("Skriv inn et heltall");
        }
        try {
            svar = Integer.parseInt(txtSvar.getText());
        }
        catch (Exception e){
            lblResultat.setText("Ugyldig input");
        }
        txtSvar.setText("");
        lblResultat.setText("");
        int riktigSvar = tall1 * tall2;

        if (svar == riktigSvar) {
            lblResultat.setText("Riktig!");
            antallRiktige++;
        }
        else {
            lblResultat.setText("Feil…");
            antallFeil++;
        }


        int forsøk = antallRiktige + antallFeil;

        lblAntallRett.setText(String.valueOf(antallRiktige));
        lblAntallFeil.setText(String.valueOf(antallFeil));
        float riktigProsent = (float)(antallRiktige / forsøk) * 100;
        float feilProsent =    (float)(antallFeil / forsøk) * 100;


        lblRettProsent.setText(riktigProsent + "%");
        lblFeilProsent.setText(feilProsent + "%");

    }
}