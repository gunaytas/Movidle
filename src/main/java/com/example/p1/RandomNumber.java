package com.example.p1;

import java.util.Random;

public class RandomNumber {

    public String[] Rnd ()
    {
        String[] randomMovie = new String[8];
        JavaParse JP = new JavaParse();
        String[][] Movies = JP.JavaParse();
        Random rnd = new Random();
        int a = rnd.nextInt(250);
        randomMovie[0] = Movies[a][0];
        randomMovie[1] = Movies[a][1];
        randomMovie[2] = Movies[a][2];
        randomMovie[3] = Movies[a][3];
        randomMovie[4] = Movies[a][4];
        randomMovie[5] = Movies[a][5];
        randomMovie[6] = Movies[a][6];
        randomMovie[7] = Movies[a][7];


        //test etmek için yazıldı
        //System.out.println(randomMovie[1]);

        return (randomMovie);
    }
}
