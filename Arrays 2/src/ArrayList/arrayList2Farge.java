package ArrayList;

import java.util.ArrayList;

public class arrayList2Farge {

    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("rød");
        liste.add(0,"blå");
        for (String farge : liste){
            System.out.print(farge+" ");
        }
        System.out.println();
        liste.add("grønn");
        liste.add("gul");

        for (int i=0; i<liste.size();i++){
            System.out.print(liste.get(i)+" ");
        }
        System.out.println();
        liste.remove("blå");
        liste.remove(1);
        for (String farge : liste){
            System.out.print(farge+" ");
        }
        System.out.println("\n Størrelse:"+liste.size());
        if(liste.contains("grønn")){
            System.out.println("Grønn finnes i listen");
        }
            else {
            System.out.println("Grønn finnes ikke i listen");
        }
    }
}