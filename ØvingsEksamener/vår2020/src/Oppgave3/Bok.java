package Oppgave3;

public class Bok {
    private String tittel;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public Forfatter getForfatter() { return forfatter; }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    public String toString() {
        String ut = "Boken heter " + getTittel() + " og er skrevet av " + getForfatter();
        return ut;
    }
}
