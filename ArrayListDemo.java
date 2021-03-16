import java.util.*;

public class ArrayListDemo 
{
	public static void main(String args[])
	{
		// One way of initializing ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		
		System.out.println("The initial size of the array is " + a1.size());
		
		a1.add("Mourinho");
		a1.add("Pep");
		a1.add("Zidane");
		a1.add("Sir Alex Ferguson");
		
		System.out.println("The final size of the array is " + a1.size());
		System.out.println(a1);
		
		// Another way of initializing ArrayList is directly from List class
		List<String> a2 = new ArrayList<String>();
		a2.add("Carlo Ancelotti");
		a2.add("Luis Enrique");
		a2.add("Pirlo");
		
		Iterator itr = a2.iterator();
		
		System.out.println("The size of this array is " + a2.size());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
