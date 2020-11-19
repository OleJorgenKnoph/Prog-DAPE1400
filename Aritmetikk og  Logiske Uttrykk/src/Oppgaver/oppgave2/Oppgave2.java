package Oppgaver.oppgave2;

import javax.swing.*;

public class Oppgave2 {
    public static void main (String [] args) {

        for (int antall = 0; antall < 10; antall++)
                if (antall % 2 == 0 && antall != 0) {
                    System.out.print(antall + ", ");
                }
    }
}
