package Objekter1;

    class Bil {
        private String farge;

        /*public void visFarge() {
            System.out.println("Fargen til bilen er " + farge);
        }*/

        public void settFarge(String farge1) {
            farge = farge1;
        }

        public String hentFarge() {
            return farge;
        }
    }


public class Objekter1 {
    public static void main (String [] args) {

        Bil nyBil = new Bil();

           // nyBil.farge = "blå";
            nyBil.settFarge("blå");

       // nyBil.visFarge();
        String bilFargen;
        bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er " + bilFargen);
    }
}
