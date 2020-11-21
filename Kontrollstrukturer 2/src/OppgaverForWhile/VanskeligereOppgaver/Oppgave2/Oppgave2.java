/*
Lag en primtallsgenerator. Det vl si liste ut alle primtall fra 0 og opp til et valgt tall.
 Et primtall er et tall som bare er delelig med 1 og seg selv.
 */
package OppgaverForWhile.VanskeligereOppgaver.Oppgave2;

import javax.swing.*;

//Skjønte ikke denne hell. kl er 0200. skylder på det
public class Oppgave2 {
    public static void main(String[] args) {
        int n = 100;
        int i = 1;
        while(i <= n) {
            int c=0;
            for(int j=1;j<=i;j++) {
                if( i % j == 0) {
                    c++; // øk teller; delelig med
                }
            }
            if(c==2) {
                System.out.print(" "+i);
            }
            i++;
        }
    }
}
/* SHADY EGEN LØSNING
System.out.print(2 + " " + 3 + " " + 5 + " ");
        for (int i = 2; i <= 100; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {

                System.out.print(i + " ");
            }

        }
 */