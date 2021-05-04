import java.util.Scanner;

class ExceptionQuestion {

	public static void main(String[] args) 
	{
		Scanner get = new Scanner(System.in);
		try 
		{
			int data;
			data = get.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println("You have not entered an integer.");
		}
	}

}
