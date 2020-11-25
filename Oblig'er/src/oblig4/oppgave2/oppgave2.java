package oblig4.oppgave2;

class SjekkArray {

    public static int summer(int tall1, int tall2, int[] tallArray){
        int sum = 0;

        for (int i = tall1; i < tall2; i++){
             sum += tallArray[i];
        }
        return sum;
    }

    public static boolean arrayLike(int[] array1, int[] array2){
       boolean like = false;
        if (array1.length == array2.length){
            for (int i = 0; i < array1.length; i++){
                if (array1[i] == array2[i]){
                    like = true;
                }
                    else {
                        like = false;
                }
            }
        }
        else {
            like = false;
        }
        return like;
    }

    public static boolean arrayEksisterer (int[] innArray, int sjekkTall){
        boolean eksisterer = false;

            for (int i : innArray){
                if (i == sjekkTall){
                    eksisterer = true;
                }
            }
            return eksisterer;
    }

}

public class oppgave2 {
    public static void main(String[] args) {
        SjekkArray arrayKlasse = new SjekkArray();

        int [] array1 = {1,2,3,4,5,6,7,8,9};
        int [] array2 = {2,4,6,8,10};
        int [] array3 = {2,4,6,8,10,12,14,16,18};
        int [] array4 = {1,2,3,4,5,6,7,8,9};

        int sum = arrayKlasse.summer(2,8,array1);
        System.out.println(sum);

        boolean arrayLike = arrayKlasse.arrayLike(array1,array4);
        System.out.println(arrayLike);

        boolean eksitererTall = arrayKlasse.arrayEksisterer(array3, 16);
        System.out.println(eksitererTall);

    }
}
