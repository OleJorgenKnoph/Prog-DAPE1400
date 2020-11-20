package Oppgaver.Oppgave6;

public class Vind {
    private double vindHastighet = 0.0;

    // her skal det inn en konstruktør for å sette vindhastigheten
        public Vind (double vindHastighet) {
            if (vindHastighet >= 0) {
                this.vindHastighet = vindHastighet;
            }
        }

    public double getVindhastighet() {
            return vindHastighet;
    }


    public boolean erOrkan() {
            return true;
    }

        public boolean erVindstille () {
            return true;
    }

    public double getKnop() {
        return vindHastighet / 1.852;
    }

    public int getBeaufort() {
        int beaufort = (int) (vindHastighet / Math.pow(3.01, 0.6666) + 0.5);
            if (beaufort > 12) {
                beaufort = 12;
            }
            return beaufort;
    }
}
