package Array;

public class Array {
    public static void main(String[] args) {

        int[] liste = new int[4];

            liste[0] = 23;
            liste[1] = 2;
            liste[2] = -4;
            liste [3] = 5;

                String ut = "Her er tallene: ";

                   /* ut += liste[0] + " ";
                    ut += liste[1] + " ";
                    ut += liste[2] + " ";
                    ut += liste[3] + " ";

                        System.out.print(ut);*/

        //ALTERNTIVT

                for (int i = 0; i < liste.length; i++) {
                    System.out.print(liste[i] + " ");
                }


    }
}
