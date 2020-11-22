package toDimArrayUtlaan;

import javax.swing.JTextArea;
import java.util.Random;

public class utlaan {

private int[] månedsdager = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
private String[] månedsnavn = { "januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember" };
private int[][] utlån; // skal inneholde simulerte utlånsdata

 public utlaan() {
  //oppretter 12 endimensjonale arrayer for månedene
    utlån = new int[ månedsdager.length ][];

  //oppretter en array med riktig lengde for hver måned
  for ( int i = 0; i < utlån.length; i++ ) {

      utlån[i] = new int[månedsdager[i]];
    }
  }

 //genererer utlånstall som slumptall
 public void genererData()
         {
              Random generator = new Random();
                 //gjennomløper den to-dimensjonale arrayen tabell og genererer
                 //verdier som slumptall
                 for ( int rad = 0; rad < utlån.length; rad++ ) {
                       for ( int kolonne = 0; kolonne < utlån[ rad ].length; kolonne++ )
                             utlån[ rad ][ kolonne ] = generator.nextInt( 500 );
                     }
               }

        //lager tabellutskrift i tekstområde
           public void skrivUt( JTextArea utskrift )
           {
                 //overskrift
                 utskrift.append( "Utlånstall\n\t" );
                 for ( int dag = 1; dag <= månedsdager[0]; dag++ )
                       utskrift.append( dag + ".\t" );
                 utskrift.append( "\n" );
                 //tabellutskrift
               for ( int rad = 0; rad < utlån.length; rad++ )
                     {
                       utskrift.append( månedsnavn[ rad ] + "\t" );
                     for ( int kolonne = 0; kolonne < utlån[ rad ].length; kolonne++ )
                             utskrift.append( utlån[ rad ][ kolonne ] + "\t" );

                       utskrift.append( "\n" );
                  }
           }
}

