package oblig4.oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {

        int [] liste = {2,4,6,12,78,45,3,42,5,-7};

        int sum1 = 0;
            for (int i = 0; i < liste.length; i++){
                sum1 += liste[i];
            }
        System.out.println(sum1);

        int sum2 = 0;
            for (int tall : liste){
                sum2 += tall;
            }
        System.out.println(sum2);

    }
}
