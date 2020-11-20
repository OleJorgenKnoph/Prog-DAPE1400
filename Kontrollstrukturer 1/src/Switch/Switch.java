package Switch;

import javax.swing.*;

public class Switch {
    public static void main (String[] args) {
            double tall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 1"));
                String regneart= JOptionPane.showInputDialog(" + , - , * , /");
            double tall2= Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tall 2"));

            double resultat = 0;

            switch (regneart) {
                case  "+":
                        resultat = tall1 + tall2;
                break;

                case  "-":
                    resultat = tall1 + tall2;
                    break;

                case  "*":
                    resultat = tall1 + tall2;
                    break;

                case  "/":
                    resultat = tall1 + tall2;
                    break;

                default:
                    resultat = 0;
                    break;
            }

//Dette gir samme resultat
          /*  if (regneart.equals("+")) {
                    resultat = tall1 + tall2;
            }
                else if (regneart.equals("-")) {
                        resultat = tall1 - tall2;
            }
                    else if (regneart.equals("*")) {
                        resultat = tall1 * tall2;
                        }
                        else if (regneart.equals("/")) {
                            resultat = tall1 / tall2;
                        }*/

            JOptionPane.showMessageDialog(null, tall1 +" "+ regneart +" "+ tall2 +" = " + resultat);
    }
}
