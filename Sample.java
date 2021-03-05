class Problems // For second degree
{
	int m;
	int x;
	int c;
	
	public int solutionOneDegree(int m, int x, int c)
	{
		int y = m*x + c;
		return y;
	}
	
	// Method for calculating factorial:
	public int calcFactorial(int a)
	{
		int i, fact = 1;
		for(i=1;i<=a;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	//Method for finding out greatest number among 2 numbers:
	public void findGreatest(int a, int b)
	{
		if(a < b)
			System.out.println(b + " is greater than " + a);
		else
			System.out.println(a + " is greater than " + b);
	}
	
	//Method for finding out if a number is divisible by 5
	public void findDivisibleby5(int a)
	{
		if (a % 5 == 0)
			System.out.println(a + " is divisible by 5");
		else
			System.out.println(a + " is not divisible by 5");
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Problems obj = new Problems();
//		int result = obj.solutionOneDegree(2, 5, 10);
//		System.out.println("The value of y is: " + result);
		
//		int result = obj.calcFactorial(5);
//		System.out.print(result);
		
//		obj.findGreatest(5, 15);
		
		obj.findDivisibleby5(89);

	}

}
