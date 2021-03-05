import java.util.Scanner;
public class CommandLine 
{
	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		
//		String plus = "+";
//		String minus = "-";
//		String multiply = "*";
//		String divide = "/";
		
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		
		if(args[2] == '+')
		{
			System.out.println(sum1 + sum2);
		}
		
//		if(op.equals(plus))
//				{
//					System.out.println(num1 + num2);
//				}
//		else if(op.equals(minus))
//		{
//			System.out.println(num1 - num2);
//		}
//		else if(op.equals(multiply))
//		{
//			System.out.println(num1 * num2);
//		}
//		else if(op.equals(divide))
//		{
//			System.out.println(num1 / num2);
//		}
//		
	}
}
