/*
Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else
 */
package OppgaverIfSwitch.oppgave5;

import javax.swing.*;

public class oppgave5a {
    public static void main(String[] args) {

        String maaned = JOptionPane.showInputDialog("Hvilken måned er det?");

            if (maaned.equals("juni") || maaned.equals("juli") || maaned.equals("august")) {
                JOptionPane.showMessageDialog(null,"Sommer");
            }
                else if (maaned.equals("september") || maaned.equals("oktober") || maaned.equals("november")) {
                    JOptionPane.showMessageDialog(null,"Høst");
                }
                    else if (maaned.equals("desember") || maaned.equals("januar") || maaned.equals("februar")) {
                        JOptionPane.showMessageDialog(null,"Vinter");
                    }
                        else if (maaned.equals("mars") || maaned.equals("april") || maaned.equals("mai")) {
                            JOptionPane.showMessageDialog(null,"Sommer");
                        }
        }
}
