package BilRegister;

public class Bil {

    private String type, skiltnummer;
    private Dato førstegangsRegistrert;

        public Bil(String type, String skiltnummer, Dato førstegangsRegistrert){
            this.type = type;
            this.skiltnummer = skiltnummer;
            this.førstegangsRegistrert = førstegangsRegistrert;
        }

        public String toString(){
            return type + " har skiltnummer " + skiltnummer +
                    " og ble førstegangsregistrert " + førstegangsRegistrert;
        }
    // lag så en toString metode for å vise alle attributtene
}
