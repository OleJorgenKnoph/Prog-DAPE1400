package ArrayList;

import java.util.ArrayList;

class Bil {
        public String farge;
        public int[] verdier = new int[5];
    }

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Bil> biler = new ArrayList<Bil>();

            Bil enVolvo = new Bil();
                enVolvo.farge = "Rød";
                enVolvo.verdier[0] = 4; //f.eks antall dører
                enVolvo.verdier[1] = 250; //f.eks antall hk

            Bil enAudi = new Bil();
                enAudi.farge = "Blå";
                enAudi.verdier[0] = 5;
                enAudi.verdier[1] = 345;

                    biler.add(enAudi);
                    biler.add(enVolvo);

            for ( Bil enBil : biler) {

                    System.out.println("Fargen: " + enBil.farge);
                System.out.println("Dører: " + enBil.verdier[0]);
                System.out.println("Hestekrefter: " + enBil.verdier[1]);
                System.out.println("--------------");
            }

                biler.remove(enAudi);
                biler.add(enVolvo);

            for (Bil enBil : biler) {
                System.out.println("Fargen: " + enBil.farge);
                System.out.println("Dører: " + enBil.verdier[0]);
                System.out.println("Hestekrefter: " + enBil.verdier[1]);
                System.out.println("--------------");
            }

            System.out.println("Lengden på arrayet er nå: " + biler.size());
            biler.clear();
            System.out.println("Lengden på arrayet er nå: " + biler.size());
    }
}
