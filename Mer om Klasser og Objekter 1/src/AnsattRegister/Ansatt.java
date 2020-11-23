package AnsattRegister;

public class Ansatt {

    private String navn;
    private Dato født, ansatt;
    private int lønnstrinn;
    private final int MIN = 30, MAX = 80;

        public Ansatt(String navn, Dato født, Dato ansatt) {
            this.navn = navn;
            this.født = født;
            this.ansatt = ansatt;
            lønnstrinn = MIN;
        }

    public String getNavn() {
            return navn;
    }

        public int getLønnstrinn() {
            return lønnstrinn;
        }

            public void  setLønnstrinn(int trinnLønn) {

                if (trinnLønn >= MAX) {
                    this.lønnstrinn = MAX;
                }
                    else {
                        this.lønnstrinn = lønnstrinn;
                }
            }

    public String toString() {
            return navn + ", født: " + født + ", ansatt: " + ansatt;
    }
}
