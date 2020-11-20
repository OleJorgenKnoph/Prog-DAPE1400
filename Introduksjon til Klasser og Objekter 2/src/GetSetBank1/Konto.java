package GetSetBank1;

public class Konto {
    private String personNummer;
    private String navn;
    private double saldo;


    //CODE -> Generate -> Constructor -> Select All
    public Konto(String personNummer, String navn, double saldo) {
        this.personNummer = personNummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    //CODE -> Generate -> Getter and Setter -> Select All
    public String getPersonNummer() {
        return personNummer;
    }

        public void setPersonNummer(String personNummer) {
            this.personNummer = personNummer;
        }


    public String getNavn() {
        return navn;
    }

        public void setNavn(String navn) {
            this.navn = navn;
        }


    public double getSaldo() {
        return saldo;
    }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
}
