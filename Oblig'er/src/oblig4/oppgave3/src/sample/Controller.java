package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

class Person{
    // attributtene til klassen
    public String navn;
    public int personNr;

    // konstruktør for å initialisere attributtene til klassen


    public Person(String navn, int personNr) {
        this.navn = navn;
        this.personNr = personNr;
    }
}

class Register{
    ArrayList<Person> personReg = new ArrayList<>();


    public void registrerPerson(String navn, String personnummer){
        /* sjekk om personnummeret finnes fra før
           dersom det ikke gjør det registrer det */
        int persNr = Integer.parseInt(personnummer);
        if (personReg.size() == 0){
            Person enPerson = new Person(navn, persNr);
            personReg.add(enPerson);
        }

            if (!finnesFraFør(personnummer)){
                Person enPerson = new Person(navn, persNr);
                personReg.add(enPerson);
            }
        }

    public void slettPerson(String personnummer){
        /* løp igjennom arrayet for å finne personen,
           dersom den finnes, slett den */
        int persNr = Integer.parseInt(personnummer);
        for (Person sjekkPers : personReg){
                if (persNr == sjekkPers.personNr){
                    personReg.remove(sjekkPers);
                    break;
                }
        }

    }

    public boolean finnesFraFør(String personnummer){
        /* sjekk om personnummeret allerede ligger i arrayet
           dersom det gjør det returner true, ellers false */
    boolean persEkistere = false;
        int persNr = Integer.parseInt(personnummer);
        for (Person sjekkPers : personReg) {
            if (persNr == sjekkPers.personNr){
                persEkistere = true;
                break;
            }
        }
        return persEkistere;
    }

    public String visAllePersonene(){
        /* løp igjennom arrayet og formater først personnummer så navn på
           hver sin linje i en streng og returner denne. */
        String ut = "Personnummer: \t Navn: \n\n";
            for (Person skrivUtPers : personReg){
                ut += skrivUtPers.personNr + "\t\t\t\t" + skrivUtPers.navn + "\n";
            }
            return ut;
    }
}

public class Controller {

            Register pers = new Register();
    @FXML
    private Label lblUtskrift;

    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtPersonnr;

    @FXML
    void registrerPerson(ActionEvent event) {

        if(!txtNavn.getText().isEmpty() && !txtPersonnr.getText().isEmpty()){
            pers.registrerPerson(txtNavn.getText(), txtPersonnr.getText());
            lblUtskrift.setText(pers.visAllePersonene());
        }
    }

    @FXML
    void slettPerson(ActionEvent event) {
            pers.slettPerson(txtPersonnr.getText());

                lblUtskrift.setText(pers.visAllePersonene());
    }

}

