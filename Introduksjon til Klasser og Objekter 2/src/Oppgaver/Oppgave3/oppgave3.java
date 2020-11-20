/*
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)
Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
Lag så en metode finnTotalPrisen. Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall. Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.
 */

package Oppgaver.Oppgave3;

    class BensinKjøp {
        private String sted;
        private String bensinType;
        private double antallLiter;
        private double prisPrLiter;
        private String tidpunkt;

        public BensinKjøp(String sted, String bensinType, double antallLiter, double prisPrLiter, String tidpunkt) {
            this.sted = sted;
            this.bensinType = bensinType;
            this.antallLiter = antallLiter;
            this.prisPrLiter = prisPrLiter;
            this.tidpunkt = tidpunkt;
        }

            public String getSted() {
                return sted;
            }
                public void setSted(String sted) {
                    this.sted = sted;
                }

            public String getBensinType() {
                return bensinType;
            }
                public void setBensinType(String bensinType) {
                    this.bensinType = bensinType;
                }

            public double getAntallLiter() {
                return antallLiter;
            }
                public void setAntallLiter(double antallLiter) {
                    this.antallLiter = antallLiter;
                }

            public double getPrisPrLiter() {
                return prisPrLiter;
            }
                public void setPrisPrLiter(double prisPrLiter) {
                    this.prisPrLiter = prisPrLiter;
                }

            public String getTidpunkt() {
                return tidpunkt;
            }
                public void setTidpunkt(String tidpunkt) {
                    this.tidpunkt = tidpunkt;
                }


            public double finnTotalPrisen() {
                return antallLiter * prisPrLiter;
            }
    }

public class oppgave3 {
        public static void main (String [] args) {

            BensinKjøp nyBensinKjøp = new BensinKjøp("Uno X Ullevål", "95 blyfri", 22, 14.5, "15:30");


            String ut = "Du kjøpte " + nyBensinKjøp.getAntallLiter() + " liter av typen " + nyBensinKjøp.getBensinType() + " på " + nyBensinKjøp.getSted() +
                        " klokken " + nyBensinKjøp.getTidpunkt() + ". Prisen per liter var " + nyBensinKjøp.getPrisPrLiter() + " og gav en totalpris på " +
                         String.format("%.2f", nyBensinKjøp.finnTotalPrisen()) + " kroner.";

                System.out.print(ut);
        }
}
