package StatiskeMetoder;

import java.text.DecimalFormat;

public class Statiske1 {

        private static double beregnAreal (double radius) {

            double areal = Math.PI * Math.pow(radius, 2);
            return areal;
            //Kan bare skrive
            // return Math.PI * Math.pow(radius, 2); . Men dette er ikke like tydelig å lese
        }

    public static  void main (String [] args) {

        double radius = 23.23;

        double areal = beregnAreal(radius);

        DecimalFormat df2 = new DecimalFormat(".##"); //Sørger for kun 2 desimaler

        System.out.println("Arealet til en sirkel med radius " + radius + " er " + df2.format(areal) );
    }
}
