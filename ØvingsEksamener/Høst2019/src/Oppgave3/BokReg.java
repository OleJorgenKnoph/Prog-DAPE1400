package Oppgave3;

import java.util.ArrayList;

class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    public String toString(){
        String ut = "Tittel: " + tittel + "\n";
                ut += "Forfatter: " + forfatter + "\n";
                ut += "Pris: " + pris + " kroner \n";
        return ut;
    }
}

class Papirbok extends Bok {
    private int iSBN;

    public Papirbok(String tittel, String forfatter, double pris, int iSBN) {
        super(tittel, forfatter, pris);
        this.iSBN = iSBN;
    }

    public String toString(){
        String ut = super.toString();
                ut += "iSBN: " + iSBN;
        return ut;

    }
}

class Lydbok extends Bok {
    private int lengdeIminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdeIminutter) {
        super(tittel, forfatter, pris);
        this.lengdeIminutter = lengdeIminutter;
    }

    public String toString(){
        String ut = super.toString();
                ut += "Lengde i minutter: " + lengdeIminutter;
        return ut;
    }
}

public class BokReg {
    public static void main(String[] args) {
        ArrayList<Bok> bøker = new ArrayList<>();

        Lydbok lydBok1 = new Lydbok("I hjørnet", "Anne Katt", 150, 183);
            bøker.add(lydBok1);
        Papirbok papirBok1 = new Papirbok("Kniven", "Jo Nesbø", 350, 23456);
            bøker.add(papirBok1);

        for (Bok bøkene : bøker) {
            System.out.println(bøkene.toString() + "\n");
        }
    }
}
