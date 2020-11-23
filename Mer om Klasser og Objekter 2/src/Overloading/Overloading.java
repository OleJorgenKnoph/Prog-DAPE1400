package Overloading;

public class Overloading {

    private static int summer(int ... tall){
        int sum = 0;

        for (int i : tall) {
            sum += i;
        }
        return sum;
    }

   /* OVERLOADING: (men konverterte til ulikeParametre-metoden over: Mindre kode. Fikk ikke til den metoden med double

    private static double summer(double tall1, double tall2, double tall3){
        double sum = tall1 + tall2 + tall3;
        return sum;

    private static double summer(double tall1, double tall2, double tall3){
        double sum = tall1 + tall2 + tall3;
        return sum;
    }*/

    public static void main(String[] args) {
        System.out.println("Summen blir: " + summer(3,3,3));
        System.out.println("Summen blir: " + summer(3,3));
        System.out.println("Summen blir: " + summer(3));
    }
}
