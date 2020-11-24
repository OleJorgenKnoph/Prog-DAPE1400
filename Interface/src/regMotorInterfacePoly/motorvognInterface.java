package regMotorInterfacePoly;

interface Kjøretøy {
    String toString();
}

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



class Bil implements Kjøretøy{
    private String type, regNr;
    private Dato førsteReg;
    private int lasteKapasitet;

    public Bil(String type, String regNr, Dato førsteReg, int lasteKapasitet) {
        this.type = type;
        this.regNr = regNr;
        this.førsteReg = førsteReg;
        this.lasteKapasitet = lasteKapasitet;
    }

    public String toString() {
        String ut = "Type: " + type + "\n" +
                    "RegNr: " + regNr + "\n" +
                    "FørsteReg: " + førsteReg + "\n" +
                    "Lastekap: " + lasteKapasitet + "kg";
        return ut;
    }
}

class Motorsykkel implements Kjøretøy{

    private String type, regNr;
    private Dato førsteReg;

    public Motorsykkel(String type, String regNr, Dato førsteReg) {
        this.type = type;
        this.regNr = regNr;
        this.førsteReg = førsteReg;
    }


    public String toString() {
        String ut = "Type: " + type + "\n" +
                "RegNr: " + regNr + "\n" +
                "FørsteReg: " + førsteReg + "\n";
        return ut;
    }
}
public class motorvognInterface {
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


        for (Kjøretøy etKjøretøy : liste)
            if (etKjøretøy != null) {
                System.out.println(etKjøretøy);
                System.out.println();
            }
    }
}
