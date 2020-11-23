package AnsattRegister;

public class Stab {
    private Ansatt[] staben = new Ansatt[2];

        public Stab() {
            String ansatt1 = "Ole Knoph";
            Dato født1 = new Dato(28, 6, 2000);
            Dato tiltrått1 = new Dato(26, 6, 2000);
            staben[0] = new Ansatt(ansatt1, født1, tiltrått1);

            String ansatt2 = "Sidsel Sidserk";
            Dato født2 = new Dato(14, 12, 1996);
            Dato tiltrått2 = new Dato(2, 4, 2012);
            staben[1] = new Ansatt(ansatt2, født2, tiltrått2);
        }

            public String toString() {
                String ut = "";
                    for (Ansatt enAnsatt : staben){
                        if (enAnsatt != null) {
                            ut += enAnsatt + "\n";
                        }
                    }
                    return ut;
            }
}
