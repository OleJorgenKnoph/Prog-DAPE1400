package Konstruktører;

    class Bil {
        private String farge;
        private int HK;

        //Konstruktør
            public Bil( String farge, int HK) {
                this.farge = farge;
                this.HK = HK;
            }


        public void setFarge(String farge) {
            this.farge = farge;
        }
            public String getFarge() {
                return farge;
            }
                public void setHK (int HK) {
                    if (HK > 0) {
                        this.HK = HK;
                    }
                }
                    public int getHK() {
                        return HK;
                    }
    }

public class Konstruktror {
        public static void main (String [] args) {

            Bil volvo = new Bil( "Rød", 234);

            int HK = volvo.getHK();
            String farge = volvo.getFarge();

                System.out.println(farge +" "+ HK);

        }
}
