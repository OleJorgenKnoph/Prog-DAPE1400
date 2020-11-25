package Oppgave3;

public class Forfatter {
    private String navn;
    private String født;

    public Forfatter(String navn, String født) {
        this.navn = navn;
        this.født = født;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFødt() {
        return født;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    public String toString() {
        String ut = "forfatteren som heter " + getNavn() + " og som er født " + getFødt();
        return ut;
    }
}
