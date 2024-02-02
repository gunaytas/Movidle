package com.example.p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaParse {

    public String[][] JavaParse() {
        String line;
        String[][] Movies = new String[251][8];
        int j=0;
        try (
                BufferedReader br = new BufferedReader(
                        new FileReader("C:\\Users\\User\\Downloads\\imdb_top_250.csv"))) {

            while ((line = br.readLine()) != null) {
                
                String[] split = line.split(";");
                Movies[j][0] = split[0];
                Movies[j][1] = split[1];
                Movies[j][2] = split[2];
                Movies[j][3] = split[3];
                Movies[j][4] = split[4];
                Movies[j][5] = split[5];
                Movies[j][6] = split[6];
                Movies[j][7] = split[7];
                j++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return (Movies);
    }

}