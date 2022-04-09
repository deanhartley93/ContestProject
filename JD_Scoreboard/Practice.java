import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Practice
{

	public static void main(String[] args)
	{
		//try to find file 
		try 
		{
		File rand = new File("data/submissions.txt");
		Scanner scnr = new Scanner(rand);
		String[] nums = new String[100];
		char[] letters = new char[100];
		char i = 0;
		
		//while scanner still reads input can change to != "end" if end of file has the word end
		 while (scnr.hasNext());
		 {
			 //populates array with next read int and increments i for next spot in array
			 nums[i] = scnr.next();
			 letters[i] = scnr.next().charAt(0);
			 i++;
		 }
		 //closing object
		 scnr.close();
		 
		}
		//if not found
		catch (FileNotFoundException e)
		{
			System.out.println("Invalid path name");
		}
		
	}
	//end main
}
//end class