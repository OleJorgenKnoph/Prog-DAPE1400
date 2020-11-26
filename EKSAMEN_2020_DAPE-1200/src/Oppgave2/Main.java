package Oppgave2;

class Person{
    private String navn;
    private String personnummer;
    private int alder;

            //Konstruktør
        public Person(String navn, String personnummer, int alder) {
            this.navn = navn;
            this.personnummer = personnummer;
            this.alder = alder;
        }

            //toString()-metode
            public String toString(){
                return navn + " er " + alder + " år gammel. Personnummer: " + personnummer;
            }

}
class Pasient extends Person{
    private String diagnose;

        //Konstruktør
        public Pasient(String navn, String personnummer, int alder, String diagnose) {
            super(navn, personnummer, alder);
            this.diagnose = diagnose;
        }

            //toString()-metode
            public String toString(){
                return "Diagnosen heter " + diagnose;
            }
}
class Lege extends Person{
    //Pasient-array med 100 plasser?? Ved bruk av polymorfisme oppretter jeg samme array i main. Deretter tildeler gitte personer til hver indeks.
    private Person[] pasientListe =  new Person[100];

        //Konstruktør
    public Lege(String navn, String personnummer, int alder /*Person[] pasientListe) SE KOMMENTAR I MAIN*/) {
        super(navn, personnummer, alder);
        //this.pasientListe = pasientListe;
    }

    //toString() metode
            public String toString() {
            String ut ="";
                for (Person skrivPasient : pasientListe){
                    if (skrivPasient != null) {
                        ut += skrivPasient + "\n";
                    }
                }
            return ut;
            }
}
public class Main {
    public static void main(String[] args) {
            Person[] pasientListe = new Person[100];

        //<Opprett to pasienter med deres egne diagnoser>
        Pasient enPasient = new Pasient("Ole Olesen", "12345678901", 20, "Mononukleose");
        Pasient enAnnenPasient = new Pasient("Per Hansen", "10987654321", 43, "Man-flu");

        //<Legg de to pasientene inn i legens pasient-array>
        pasientListe[1] = enPasient;
        pasientListe[2] = enAnnenPasient;

        //<Opprett en lege>
        Lege enLege = new Lege("Kåre Pettersen", "5678914321", 52); /*Person[]??*/
        pasientListe[0] = enLege;
/*
        SÅNN JEG TRODDE DET SKULLE LØSES. MEN GIKK IKKE SOM PLANLAGT. LEGGER VED ALTERNATIV LØSNING UNDER
        
        
        //<Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>
            System.out.print(enLege.toString() + "\n");
*/
        for (Lege liste : pasientListe){
            System.out.println(liste + "\n");
        }
        

    }
}
