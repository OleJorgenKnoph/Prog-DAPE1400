package Oppgave2;

import java.util.Arrays;

class Trekning {

    private int[] vinnere = new int[7];

    public int[] vinnere(){

        for (int i = 0; i < 7; i++){
            int randomTall = (int) (Math.random() * 34 + 1);
                vinnere[i] = randomTall;
        }
        Arrays.sort(vinnere);

        return vinnere;
    }
}

public class Lottogenerator {
    public static void main(String[] args) {

        Trekning lotto = new Trekning();

            int[] vinnerTall = lotto.vinnere();

        System.out.print("Vinnertallene er: \t");
        for (int i = 0; i < vinnerTall.length; i++){
            System.out.print(vinnerTall[i] + " ");
        }
    }
}
