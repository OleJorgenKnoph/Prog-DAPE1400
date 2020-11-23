package Scope;

public class scope {

    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;
            System.out.println("x verdien inne i main er " + x);

        brukLokalVariabel();
        brukGlobalVariabel();
        brukLokalVariabel();
        brukGlobalVariabel();
    }

        public static  void brukLokalVariabel() {
        int x = 25;
            System.out.println("x verdien inne i lokal er " + x);

            x++;
            System.out.println("x verdien lokal er tilslutt lik "+ x);
        }

        public static void brukGlobalVariabel() {
            System.out.println("x verdien i global er " + x);

            x*=10;
            System.out.println("global x er tilslutt " + x);
        }
}

