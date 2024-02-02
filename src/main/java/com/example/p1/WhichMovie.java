package com.example.p1;
public class WhichMovie {
    public String[] MovieGuess(String guess)
    {
        JavaParse JP = new JavaParse();
        String[] selectedMovie = new String[8];
        String[][] Movies = JP.JavaParse();

        for (int i=0;i<251;i++) {
            if (guess.toLowerCase().equals(Movies[i][1].toLowerCase())) {
                selectedMovie[0] = Movies[i][0];
                selectedMovie[1] = Movies[i][1];
                selectedMovie[2] = Movies[i][2];
                selectedMovie[3] = Movies[i][3];
                selectedMovie[4] = Movies[i][4];
                selectedMovie[5] = Movies[i][5];
                selectedMovie[6] = Movies[i][6];
                selectedMovie[7] = Movies[i][7];
            }
        }

        return selectedMovie;
    }
}
