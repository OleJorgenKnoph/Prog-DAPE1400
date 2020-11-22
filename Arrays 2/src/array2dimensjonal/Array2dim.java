package array2dimensjonal;

public class Array2dim {
    public static void main(String[] args) {
        int [][] tabell = new int[4][4]; // 4x4 tabell

        tabell[0][0] = 23;
        tabell[1][0] = 24;
        tabell[2][0] = 25;
        tabell[3][0] = 26;


            for (int i = 0; i < tabell.length; i++) {

                    for (int j = 0; j < tabell[i].length; j++) {

                        System.out.print(tabell[i][j] + " ");

                    }
                System.out.println();
            }
        System.out.println();

                        for (int[] liste : tabell) {

                                for (int tall : liste) {

                                    System.out.print(tall + " ");
                                }
                                System.out.println();

            }
    }
}
