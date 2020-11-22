package toDimArrayUtlaan;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

   public class tabellTest
  {
      public static void main( String[] args )
          {
             utlaan simulator = new utlaan();
             JTextArea utskrift = new JTextArea( 15, 60 );
             utskrift.setEditable( false );
             utskrift.setTabSize(6);
             JScrollPane skrollefelt = new JScrollPane( utskrift );

             simulator.genererData();
             simulator.skrivUt( utskrift );
             JOptionPane.showMessageDialog( null, skrollefelt, "Utlånsdata",
                 JOptionPane.PLAIN_MESSAGE );
           }
         }