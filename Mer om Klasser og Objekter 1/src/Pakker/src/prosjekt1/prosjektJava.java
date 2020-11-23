package prosjekt1;

import prosjekt2.*;

    class Klasse1{

        private String fornavn;

        public String getNavn() {
            return fornavn;
        }

        public void setNavn(String fornavn) {
            this.fornavn = fornavn;
        }
    }

public class prosjektJava {
    public static void main(String[] args) {

            Klasse1 objekt1 = new Klasse1();
            klasse3 objekt2 = new klasse3();

                objekt1.setNavn("Ole");
                objekt2.setEtternavn("Knoph");

                System.out.println(objekt1.getNavn() + " " + objekt2.getEtternavn());

    }
}
