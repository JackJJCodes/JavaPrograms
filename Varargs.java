// Implementation of Varargs(Taking multiple parameters in a function)
public class Varargs {
	public void sum(double ... args)
	{
		System.out.println(args.length);
		double sum = 0;
		for(double i: args)
		{
			sum = sum + i;
		}
		System.out.println("Sum = " + sum);
	}

	public static void main(String args[])
	{
		Varargs v = new Varargs();
		v.sum(12, 23);
		v.sum(35, 12, 15);
	}
}
