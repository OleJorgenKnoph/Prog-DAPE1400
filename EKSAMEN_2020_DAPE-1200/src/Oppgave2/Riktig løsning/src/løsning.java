class Person{
    private String navn;
    private String personnummer;
    private int alder;
    public Person(String navn, String personnummer, int alder){
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    public String toString(){
        String ut = "";
        ut += "Navn: " + this.navn + "\n" + "Personnummer: " + this.personnummer + "\n" + "Alder: " + this.alder;
        return ut;
    }

}
class Pasient extends Person{
    private String diagnose;

    public Pasient(String navn, String personnummer, int alder, String diagnose){
        super(navn, personnummer, alder);
        this.diagnose = diagnose;

    }

    public String toString(){
        String ut = "";
        ut += super.toString() + "\n" + "Diagnose: " + this.diagnose;
        return ut;
    }
}
class Lege extends Person{
    Pasient[] pasArr = new Pasient[100];
    public Lege(String navn, String personnummer, int alder, Pasient[] pasArr){
        super(navn, personnummer, alder);
        this.pasArr = pasArr;
    }

    public String toString(){
        String ut = "";
        ut += super.toString() + "\n" + "Legen har følgende pasienter: ";

        for (int i = 0; i < pasArr.length; i++){
            ut += "\n" + pasArr[i].toString();
            if (pasArr[i+1] == null){
                break;
            }
        }
        return ut;

    }
}
public class løsning {
    public static void main(String[] args) {
        Pasient Test1 = new Pasient("test navn 1", "3003004", 23, "Kronisk trøtt");
        Pasient Test2 = new Pasient("test navn 2", "55555", 2222, "Kronisk våken");
        Pasient[] pasArr = new Pasient[100];
        pasArr[0] = Test1;
        pasArr[1] = Test2;
        Lege Test3 = new Lege("test navn 3", "999999", 12, pasArr);
        System.out.println(Test3.toString());
    }
}

