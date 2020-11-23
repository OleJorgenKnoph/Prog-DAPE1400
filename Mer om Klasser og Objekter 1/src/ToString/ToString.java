package ToString;

    class Person {
        public String personnummer;
        public String navn;
        public String adresse;
        public String telefonnummer;


        public String toString() {
            String ut = " Her er innholdet i objektet: \n";
                ut += "Personnummer: " + this.personnummer + "\n";
                ut += "Navn: " + this.navn + "\n";
                ut += "Adresse: " + this.adresse + "\n";
                ut += "Telefonnummer: " + this.telefonnummer + "\n";
            return ut;
        }



    }

public class ToString {

    public static void main(String[] args) {
        Person enPerson = new Person();
            enPerson.personnummer = " 01234567891";
            enPerson.navn = "Ole";
            enPerson.adresse = "Osloveien 82";
            enPerson.telefonnummer = "99867896";

                System.out.println(enPerson);
    }

}
