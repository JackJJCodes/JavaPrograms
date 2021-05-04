import java.nio.file.*;
import java.nio.file.Path;
import java.util.List;
import java.io.*;
public class Files1 
{
	public static void main(String[] args) throws IOException
	{
		char[] arr = new char[200];
		Path p1 = Paths.get("/home/jackson/Desktop/hello.txt");
		System.out.println(p1);	// Converts the path
		
		
		CreatingFiles.createFile(p1);
		
		List<String> l1 = CreatingFiles.readAllLines(p1);
		System.out.println(l1);
		
		File file1 = new File("asignment.txt");	// file in the same folder
		boolean x = file1.createNewFile();
		if (x)
		{
			System.out.println("File has been created");
		}
		else
		{
			System.out.println("Already exists");
		}
		
		FileReader content = new FileReader(file1);
		content.read(arr);
		System.out.println(arr);
		content.close();
		
		
	}
}
