import java.io.File;	// For working with files
import java.io.FileNotFoundException;	// For handling errors
import java.util.Scanner;	// for read text files

public class ReadingAFIle 
{
	public static void main(String args[])
	{
		try
		{
			File file = new File("filename.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine())	// .hasNextLine() returns boolean
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
