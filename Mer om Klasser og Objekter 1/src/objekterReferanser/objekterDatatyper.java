package objekterReferanser;

    class Person {

        public String navn;
    }

public class objekterDatatyper {

            private static void endreNavn(Person personref1, String navn) {
                personref1.navn = navn;
            }

    public static void main(String[] args) {
        Person person1 = new Person();
            person1.navn = "Heidi";
                System.out.println("Person1 navn: " + person1.navn);

                    endreNavn(person1, "Kari");
                    System.out.println("Navnet er nå endret til " + person1.navn);
    }
}
