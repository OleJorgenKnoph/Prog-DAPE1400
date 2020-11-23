package BilRegister;


public class Main {

    public static void main(String[] args) {

         Bil[] bilene = new Bil[3];
        // opprett et array av Biler


            String type = "Audi rs6";
                String skiltnummer = "CF 81185";
                Dato førsteReg = new Dato(4, 6, 2020);
            bilene[0] = new Bil(type, skiltnummer, førsteReg);

            String type1 = "Volvo XC40 ReCharge";
                String skiltnummer1 = "EB 68935";
                Dato førsteReg1 = new Dato(28, 6, 2020);
            bilene[1] = new Bil(type1, skiltnummer1, førsteReg1);

             String type2 = "BMW i8";
                String skiltnummer2 = "EV 69696";
                Dato førsteReg2 = new Dato(23, 11, 2020);
             bilene[2] = new Bil(type2, skiltnummer2, førsteReg2);
        // Sett inn noen biler i arrayet

        System.out.println("Registrerte biler: \n");
        for (Bil bilPark : bilene){
            if (bilPark != null){
                System.out.println(bilPark + "\n");
            }
        }

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

    }
}
