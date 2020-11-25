package oblig3;


import javax.swing.*;

class array {
    // Deklarasjon av array for lagring av tilfeldige heltall
    int[] tilfeldigArray;

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet.  */
    public array(int arrayLengde) {
        tilfeldigArray = new int[arrayLengde];
    }

    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayet.
     Hvis ikke skal metoden returnere false. */
    public boolean sjekkTall(int tall){
    boolean sjekk = false;
        for (int i = 0; i < tilfeldigArray.length; i++){
                if (tilfeldigArray[i] == tall){
                    sjekk = true;
                }
                    else {
                        sjekk = false;
                }
        }
        return sjekk;
    }

   /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */
    public void fyllArray(){

            for (int i  = 0; i < tilfeldigArray.length; i++){
                int randomTall = (int)(Math.random()*900) + 100;
                if (!sjekkTall(randomTall)){
                    tilfeldigArray[i] = randomTall;
                }
            }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    public int minsteTall(){
    int minsteTallet = 999;
        for (int i : tilfeldigArray){
            if (i < minsteTallet){
                minsteTallet = i;
            }
        }
        return minsteTallet;
    }

    // Metode som finner og returnerer det største tallet i arrayet.
    public int størsteTall(){
        int størsteTallet = 100;
        for (int i : tilfeldigArray){
            if (i > størsteTallet){
                størsteTallet = i;
            }
        }
        return størsteTallet;
    }

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */
    public double snitt(){
        int antall = 0;
        int sum = 0;
        double snitt;
            for (int i : tilfeldigArray){
                antall++;
                sum += i;
            }
            snitt = (double) sum/antall;
        return snitt;
    }

   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */
    public String toString(){
        String ut = "";
                for (int i = 0; i < tilfeldigArray.length; i++){
                    ut += tilfeldigArray[i] + "\t\t";
                        if (i == 9){
                            ut += "\n";
                        }
                }
                ut += "\n\n";
                ut += "Det minste tallet er " + minsteTall()+ "\n";
                ut += "Det største tallet er " + størsteTall() + "\n";
                ut += "Snittet av tallene er " + String.format("%.2f", snitt());
        return ut;
    }
}

public class tilfeldigArray {
    public static void main(String[] args) {
        array program = new array(12);

        program.fyllArray();
        JOptionPane.showMessageDialog(null, program.toString());

    }
}
