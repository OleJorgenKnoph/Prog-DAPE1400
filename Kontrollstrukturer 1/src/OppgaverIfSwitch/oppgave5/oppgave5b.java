/*
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
b) Lag deretter et program som løser det med bruk av switch.
 */
package OppgaverIfSwitch.oppgave5;

import javax.swing.*;

public class oppgave5b {
    public static void main(String[] args) {
        String maaned = JOptionPane.showInputDialog("Hvilken måned er det?");

            String aarstid = "";

        switch (maaned){
            case "juni":
            case "juli":
            case "august":
                aarstid = "Sommer";
                    break;
                    case "september":
                    case  "oktober":
                    case  "november":
                            aarstid = "Høst";
                            break;
                            case "desember":
                            case  "januar":
                            case  "februar":
                                    aarstid = "Vinter";
                                    break;
                                    case "mars":
                                    case  "april":
                                    case  "mai":
                                            aarstid = "Vår";
                                            break;
            }
                    JOptionPane.showMessageDialog(null, aarstid);
    }
}
