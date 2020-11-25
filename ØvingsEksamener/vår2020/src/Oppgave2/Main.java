package Oppgave2;

class KonverterTemperatur {

        public static double tilCelsius(double farenheit){
                double celsius = (farenheit - 32) / 1.8;
            return celsius;
        }

        public static double tilFarenheit(double celsius){
            double farenheit = celsius * 1.8 + 32;
            return farenheit;
        }
}

public class Main {
    public static void main(String[] args) {

        double celsius = 10;
        double farenheit = 50;

        double cTILf = KonverterTemperatur.tilFarenheit(celsius);
        double fTILc = KonverterTemperatur.tilCelsius(farenheit);

            System.out.println(celsius + " celsius tilsvarer " + cTILf + " farenheit.");
            System.out.println(farenheit + " farenheit tilsvarer " + fTILc + " celsius.");




    }
}
