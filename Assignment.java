import java.util.Scanner;
class assignmentFunctions {
	
	// Functions required for the first question:
	void getBox()
	{
		System.out.println ("*******");
		System.out.println ("*	   *");
		System.out.println ("*	   *");
		System.out.println ("*	   *");
		System.out.println ("*	   *");
		System.out.println ("*	   *");
		System.out.println ("*	   *");
		System.out.println ("*******");
	}
	void getOval()
	{
		System.out.print("     ***      \n");
		System.out.print("    *   * \n");
		System.out.print("   *     * \n");
		System.out.print("   *     * \n");
		System.out.print("   *     * \n");
		System.out.print("   *     * \n");
		System.out.print("   *     * \n");
		System.out.print("   *     * \n");
		System.out.print("    *   * \n");
		System.out.print("     ***      \n");
	}
	void getArrow()
	{
		System.out.print("   *    \n");
		System.out.print("  *** \n");
		System.out.print(" ***** \n");
		System.out.print("   * \n");
		System.out.print("   * \n");
		System.out.print("   * \n");
		System.out.print("   * \n");
		System.out.print("   * \n");
		System.out.print("   * \n");
	}
	void getDiamond()
	{
		System.out.print("   *    \n");
		System.out.print("  * *    \n");
		System.out.print(" *   *    \n");
		System.out.print("*     *    \n");
		System.out.print(" *   *    \n");
		System.out.print("  * *    \n");
		System.out.print("   *    \n");
	}
	
	// Functions required for the second question:
	void barsAsterisk(int num1, int num2, int num3, int num4, int num5)
	{
		while (num1 != 0)
		{
			System.out.print("*");
			num1--;
		}
		System.out.print("\n");
		while (num2 != 0)
		{
			System.out.print("*");
			num2--;
		}
		System.out.print("\n");
		while (num3 != 0)
		{
			System.out.print("*");
			num3--;
		}
		System.out.print("\n");
		while (num4 != 0)
		{
			System.out.print("*");
			num4--;
		}
		System.out.print("\n");
		while (num5 != 0)
		{
			System.out.print("*");
			num5--;
		}
	}
	
}

class Assignment
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		assignmentFunctions obj_1 = new assignmentFunctions();
		Scanner get = new Scanner(System.in);
		
		// For the first question: 
		
		obj_1.getBox();
		obj_1.getArrow();
		obj_1.getDiamond();
		obj_1.getOval();
		
		// For the second question:
		
		int num1, num2, num3, num4, num5;
		System.out.println("Enter the first number: ");
		num1 = get.nextInt();
		System.out.println("Enter the second number: ");
		num2 = get.nextInt();
		System.out.println("Enter the third number: ");
		num3 = get.nextInt();
		System.out.println("Enter the fourth number: ");
		num4 = get.nextInt();
		System.out.println("Enter the fifth number: ");
		num5 = get.nextInt();
		
		obj_1.barsAsterisk(num1, num2, num3, num4, num5);
		
	}
}
