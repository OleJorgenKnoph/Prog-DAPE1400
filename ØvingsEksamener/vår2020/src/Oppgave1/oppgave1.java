package Oppgave1;

public class oppgave1 {
    public static void main(String[] args) {

    int[] liste = {1, 3, 6, 2, 7, 10, 23, 6, 3, 6};

    // a
        for (int tall : liste){
            System.out.print(tall + " ");
        }

System.out.println("\n -------------------------");

    // b
        for (int i = liste.length - 1; i > 0; i--){
            System.out.print(liste[i] + " ");
        }

        System.out.println("\n -------------------------");

        // c

        int i = 0;
        int sum = 0;
        while (i < liste.length){
            sum += liste[i];
            i++;
        }
        double snitt = (double) sum / i;
        System.out.println("Snittet er " + snitt);
    }
}
