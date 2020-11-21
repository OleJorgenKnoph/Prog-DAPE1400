package While;

import javax.swing.*;

public class While {
    public static void main(String[] args) {

        int sum = 0;
        int antall = 0;

        int innTall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0"));

            while (innTall1 > 0) {
                sum = sum + innTall1;
                antall++;
                    innTall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall og avslutt med 0"));
            }
                JOptionPane.showMessageDialog(null,"sum:" + sum);

            double snitt = (double) sum / (double) antall;
                JOptionPane.showMessageDialog(null, "Snitt: " + String.format("%.2f", snitt));
    }
}
