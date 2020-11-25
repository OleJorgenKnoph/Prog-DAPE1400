package Oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {

        //a
        for (int i = 0; i < 100; i+=3){
            System.out.print(i + " ");
        }

System.out.println("\n ---------------------------");
    //b
        int sum = 0;
        int antall = 0;
        int i = 2;
        while (i < 100){
            sum += i;
            antall++;
            i += 2;
        }

        double snitt = (double) sum / antall;
            System.out.println("Summen av alle partall fra 2 til 100 er " + String.format("%.2f",snitt));
    }
}
