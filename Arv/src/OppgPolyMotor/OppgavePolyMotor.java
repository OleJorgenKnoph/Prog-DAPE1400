/*
Lag en klasse Kjøretøy som er super-klassen til Bil og Motorsykkel.
Motorsykkelklassen skal ha de samme attributtene som Bil-klassen i refererte oppgave (typebetegnelse, førstegangsregisterering og kjennetegn).
Bil-klassen skal i dette tilfellet ha en ny attributt : lastekapasitet (i kg).

Skriv om koden for "Register for Motorvogn" for å implementere det overstående.
Husk å bruke polyformisme ved å opprette arrayet med typen "Kjøretøy".
 */
package OppgPolyMotor;


class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return dag + ". " + månedsnavn(måned) + " " + år;
    }
}

class Kjøretøy {
    private String type;
    private String regNr;
    private Dato førsteReg;

    public Kjøretøy(String type, String regNr, Dato førsteReg) {
        this.type = type;
        this.regNr = regNr;
        this.førsteReg = førsteReg;
    }

    public String toString(){
        String ut = "";
            ut += "Type: " + type + "\n";
            ut += "Registreringsnummer: " + regNr + "\n";
            ut += "Første-gangs registrert: " + førsteReg + "\n";
        return ut;
    }


}

class Bil extends Kjøretøy{
    private static int last;

    public Bil(String type, String regNr, Dato førsteReg, int last) {
        super(type, regNr, førsteReg);
        Bil.last = last;
    }

    public String toString() {
        String ut = super.toString();
                ut += "Last: " + last;
        return ut;
    }
}

class Motorsykkel extends Kjøretøy{

    public Motorsykkel(String type, String regNr, Dato førsteReg) {
        super(type, regNr, førsteReg);
    }

    public String toString() {
        return super.toString();
    }
}

public class OppgavePolyMotor {
    public static void main(String[] args) {

        Kjøretøy[] liste = new Kjøretøy[10];

        Dato datoBil1 = new Dato(28, 6, 2019);
        Kjøretøy audi = new Bil("Audi RS6", "CF 81186", datoBil1, 50);


        Dato datoBil2 = new Dato(2, 4, 2020);
        Kjøretøy volvo = new Bil("Volvo Xc40 ReCharge", "EV 86951", datoBil2, 40);


        Dato datoSykkel1 = new Dato(4, 1, 2018);
        Kjøretøy ducati = new Motorsykkel("Ducati", "AB 32548", datoSykkel1);

        liste[0] = audi;
        liste[1] = volvo;
        liste[2] = ducati;


        for(Kjøretøy etKjøretøy : liste)
            if (etKjøretøy != null) {
                System.out.println(etKjøretøy);
                System.out.println();
            }
    }
}



