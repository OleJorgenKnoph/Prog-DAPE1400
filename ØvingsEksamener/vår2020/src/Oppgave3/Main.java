package Oppgave3;

public class Main {
    public static void main(String[] args) {

        Forfatter forfatter = new Forfatter("Jo Nesbø", "29. Mars 1960");

        Bok bok1 = new Bok("Snømannen", forfatter);
        Bok bok2 = new Bok("Kniven", forfatter);

        System.out.println(bok1.toString());
        System.out.println(bok2.toString());
    }
}
