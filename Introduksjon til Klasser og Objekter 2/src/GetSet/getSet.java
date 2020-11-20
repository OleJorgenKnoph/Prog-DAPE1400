package GetSet;

    class Bil {
        private  String farge;
        private int HK;

            public void setFarge (String farge) {
                this.farge = farge;
            }
                public  String getFarge () {
                    return farge;
                }

        public void setHK (int HK) {
           if (HK > 0) {
            this.HK = HK;
                }
            }
            public  int getHK () {
                return HK;
            }
    }

public class getSet {
        public static void main (String [] args) {

            Bil nyBil = new Bil();

                nyBil.setFarge("blå");
                String bilFargen = nyBil.getFarge();

                    System.out.println("Fargen til bilen er " + bilFargen);

                nyBil.setHK(234);

                    System.out.println("Antall hestekrefter er " + nyBil.getHK());
        }
}
