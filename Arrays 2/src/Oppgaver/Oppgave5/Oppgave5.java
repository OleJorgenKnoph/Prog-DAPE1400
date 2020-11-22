/*
Det er definert et to-dimensjonalt helttalls-array (se under).
Hver rad tilsvarer en filmanmelders "score" av 4 filmer (kolonner).

4	6	2	5
7	9	4	8
6	9	3	7

Lag et program som beregner gjennomsnittlig "score" for de 4 forskjellige filmene og skriver ut resultatet.
 */
package Oppgaver.Oppgave5;


public class Oppgave5 {
    public static void main(String[] args) {

        int[][] filmScore = new int[3][4];

        filmScore[0][0] = 4;
        filmScore[0][1] = 6;
        filmScore[0][2] = 2;
        filmScore[0][3] = 5;

        filmScore[1][0] = 7;
        filmScore[1][1] = 9;
        filmScore[1][2] = 4;
        filmScore[1][3] = 8;

        filmScore[2][0] = 6;
        filmScore[2][1] = 9;
        filmScore[2][2] = 3;
        filmScore[2][3] = 7;


        int scoreFilm1 = 0;
        int scoreFilm2 = 0;
        int scoreFilm3 = 0;
        int scoreFilm4 = 0;

        for (int[] verdi : filmScore) {
            for (int j = 0; j < verdi.length; j++) {



                if (j == 0) {//Hvis j = 0 altså hvis vi er på den første kolonnen (film 1) så  legges poeng til
                    scoreFilm1 += verdi[j];
                }
                    else if (j == 1) {
                        scoreFilm2 += verdi[j];
                    }
                        else if (j == 2) {
                            scoreFilm3 += verdi[j];
                        }
                            else if (j == 3) {
                                scoreFilm4 += verdi[j];
                            }
            }
        }
        double snittFilm1 = (double)scoreFilm1 /4;
        double snittFilm2 = (double)scoreFilm2 /4;
        double snittFilm3 = (double)scoreFilm3 /4;
        double snittFilm4 = (double)scoreFilm4 /4;

        System.out.println("Score for film 1: " + snittFilm1 + "\n"+
                "Score for film 2: " + snittFilm2 + "\n"+
                "Score for film 3: " + snittFilm3 + "\n"+
                "Score for film 4: " + snittFilm4 + "\n");
        }
    }

