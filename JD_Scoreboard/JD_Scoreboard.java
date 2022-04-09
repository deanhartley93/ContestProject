/*
* Scoreboard
* Author: Justin Dean
* Date: April 6th 2022
*/

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JD_Scoreboard {
    public static void main(String[] args) throws IOException {
        

       
        System.out.println("Team\t\t\tSlv/Time\t\tP1\t\tP2\t\tP3\t\tP4\t\tP5\t\tP6\t\tP7\t\tP8\t\tP9\t\tP10\t\tP11");
        
        
        try {
            File teamNames = new File("data/teams.txt");
            Scanner scnr = new Scanner(teamNames);

            scnr.useDelimiter("[\\t0-9]");

            while (scnr.hasNext()) {
                System.out.println(scnr.next());
            }

                

            scnr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

    }   


        





    
}

}