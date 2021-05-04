import java.io.*;	// Will be used for writing
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class WritingToAFile 
{
	public static void main(String args[])
	{
		try 
		{
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java is so complicated.");
			myWriter.close();
			System.out.println("Successfully written on the file.");
			java.nio.file.Path pf = Paths.get("/home/jackson/eclipse-workspace/MyProject/filename.txt");
			List <String> l1 = Files.readAllLines(pf);
			System.out.println(l1);
		}
		catch (IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
