import java.util.Scanner;
public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		try
		{
			int data = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Divide by zero not possible!!");
		}
		
		System.out.println("Rest of the code...");
	}

}
