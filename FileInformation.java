import java.io.File;
public class FileInformation
{
	public static void main(String args[])
	{
		File file = new File("filename.txt");
		if (file.exists()) 
		{
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Writeable: " + file.canWrite());
			System.out.println("Readable: " + file.canRead());
			System.out.println("File size: " + file.length());
		}
	}
}
