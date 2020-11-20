package Oppgaver.Oppgave6;

public class vindMain {
    public static void main (String [] args) {

        Vind vindHastighet1 = new Vind( 59);

            System.out.println("Vindhastigheten i kmt er " + vindHastighet1.getVindhastighet());

                if (vindHastighet1.getVindhastighet() > 120) {
                    System.out.println("Det er orkan styrke");
                }
                    if (vindHastighet1.getVindhastighet() < 2) {
                        System.out.println("Det er vindstille");
                    }

            System.out.println("Det tilsvarer " + String.format("%.2f", vindHastighet1.getKnop()) + " knop");
            System.out.println("Som igjen tilvarer " + vindHastighet1.getBeaufort() + " på Beaufort-skala (1-12)");
    }
}
