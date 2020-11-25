package oblig2.oppgave1;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {

        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Nedre grense: "));
        int øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Øvre grense: "));

            if (øvreGrense <= nedreGrense){
                JOptionPane.showMessageDialog(null, "Øvre grense kan ikke være mindre eller lik nedre");
                    øvreGrense = Integer.parseInt(JOptionPane.showInputDialog("Øvre grense: "));
                    nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Nedre grense: "));
            }

        String ut = "";
        int sum = 0;
            for (int i = nedreGrense; i <= øvreGrense; i++){
                sum += i;
                ut += i + " + ";
                if (i % 10 == 0){
                    ut += "\n";
                }
            }
            ut += " = " + sum;

            System.out.print(ut);

    }
}
