package oblig1.oppgave1;

class Sirkel{
    // Statisk metode som beregner og returnerer sirkelens diameter.
    public static double beregnDiameter(double r){
            return r*2;
    }

    // Statisk metode som beregner og returnerer sirkelens omkrets.
    // Omkrets = 2*pi*r
    public static double beregnOmkrets(double r) {
        return 2*Math.PI*r;
    }

    /* Statisk metode som beregner og returnerer sirkelens areal.
       Areal = pi*r^2
       Math.PI kan brukes for en konstant for PI
       Math.pow kan brukes for å opphøye et tall i en potens
     */
    public static double beregnAreal(double r) {
        return Math.PI*(Math.pow(r, 2));
    }

}

public class oppg1 {

    public static void main(String[] args) {
        //  Sett en variabel lik en verdi for radius
        double radius = 23.5;


        double diameter = Sirkel.beregnDiameter(radius);
        double omkrets = Sirkel.beregnOmkrets(radius);
        double areal = Sirkel.beregnAreal(radius);

        String ut = "";
        ut += "Arealet av sirkelen med radius " + radius + " er " + String.format("%.2f", areal) + "\n";
        ut += "Omkretsen av sirkelen med radius " + radius + " er " + String.format("%.2f", omkrets)+ "\n";
        ut += "Diameteren av sirkelen med radius " + radius + " er " + String.format("%.2f", diameter);

        System.out.println(ut);

        /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */

    }
}
