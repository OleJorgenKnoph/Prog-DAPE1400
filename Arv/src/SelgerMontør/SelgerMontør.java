package SelgerMontør;

class Ansatt {
        private String navn;
        protected double lønn;

        public Ansatt(String navn, double lønn) {
            this.navn = navn;
            this.lønn = lønn;
        }

        public String getNavn() {
            return this.navn;
        }

        public double getLønn() {
            return this.lønn;
        }
}
class Selger extends Ansatt {
        private double bonus;

        public Selger(String navn, double lønn, double bonus) {
            super(navn, lønn);
            this.bonus = bonus;
        }

        public double getLønn(){
            return  this.lønn + this.bonus; //Kjører super.getLønn (fra klassen den arver(ANSATT)) + denne getLønn.
        }
}
class Montør extends Ansatt{
        private String bil;

        public Montør(String navn, double lønn, String bil) {
            super(navn, lønn);
            this.bil = bil;
        }
}



public class SelgerMontør {

    public static void main(String[] args) {

        Selger Per = new Selger("Per Hansen", 650_000, 10_000);
        Montør Ole = new Montør("Ole Knoph", 850_000, "Volvo");

            System.out.println(Per.getNavn() + " har i lønn " + Per.getLønn());
            System.out.println(Ole.getNavn() + " har i lønn " + Ole.getLønn());
    }
}
