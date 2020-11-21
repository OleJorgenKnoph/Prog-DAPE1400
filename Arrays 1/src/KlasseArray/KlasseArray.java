package KlasseArray;

import java.util.Arrays;

public class KlasseArray {
    public static void main(String[] args) {

        double [] liste1 = {1.2, 3.5, 5.3, -3.4, 3.9, 10};

            Arrays.sort(liste1);

            for (double tall : liste1) {
                System.out.print(tall + " ");
            }

                double [] liste2 = Arrays.copyOf(liste1, liste1.length);

                double [] liste3 = liste2;

                boolean b = Arrays.equals(liste2, liste1);

                int location = Arrays.binarySearch(liste1, 3.5);

                        System.out.println("\n" + "Indeksen til tallet -3.4 er " + location);
    }
}
