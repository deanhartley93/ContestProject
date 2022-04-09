import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Helper_Methods {

    static void submissions(int[] arr, Scanner scnr, String newLine) {
        try{
            scnr = new Scanner(new File("data/submissions.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured: " + e.getMessage());
            return;
        }
        



    
    }


    static void title(Scanner scnr, File title, String newLine){
    try {
        title = new File("data/submissions.txt");
        scnr = new Scanner(title);

            newLine = scnr.nextLine();
            System.out.println(newLine);
            scnr.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }


    }



    
    static void times(Scanner scnr, int[] timesArr) {
        scnr = new Scanner(new File("data/submissions.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    public static String title() {
        return null;
    }

}
