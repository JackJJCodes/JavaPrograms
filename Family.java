import java.lang.*;
import java.util.*;

public class familyInformation
{
	private String name;
	private int age;
	Scanner get = new Scanner(System.in);
	
	familyInformation()
	{
		System.out.println("Enter the name of member: \n");
		name = get.nextLine();
		System.out.println("Enter the age: \n");
		age = get.nextInt();
	}
	familyInformation(String n, int a)
	{
		name = n;
		age = a;
	}
	void ShowName(String name)
	{
		System.out.println("The name of the member is " + name);
	}
	void showAge(int age)
	{
		System.out.println("The age of the member is " + age);
	}
}

class Dad extends familyInformation
{
	private String level;
	Dad(String level)
	{
		
	}
}

public class Family {

}
