import java.util.*;

public class CollectionImplementation
{
	public static void main(String args[])
	{
		// Implementing ArrayList
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Mourinho");
		a1.add("Pep");
		a1.add("Zidane");
		a1.add("Sir Alex Ferguson");
		
//		Iterator<String> itr = a1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.hasNext());
//		}
		
		// Passing an array as ArrayList
		String[] teams = {"Barcelona", "Real Madrid", "Chelsea", "Arsenal"};
		Integer[] score = {1, 2, 3, 4, 5};
		List<String> l1 = Arrays.asList(teams);
		List<Integer> l2 = Arrays.asList(score);
		List<Integer> l3 = new ArrayList<Integer>();
		
		// Sorting arrays:
		System.out.printf("Unsorted: %s%n", l1);
		Collections.sort(l1);
		int max = Collections.max(l2);
		boolean b = Collections.addAll(l3, 10, 20, 45);
		
		System.out.println("The maximum number in array l2 is " + max);
		System.out.printf("Sorted: %s%n", l1);
		System.out.println(l3);
		
		// Vector Implementation:
		int size = 7;
		int incr = 1;
		String st[] = {"Hello", "My", "Dear", "Students"};
		
		Vector<String> v1 = new Vector<String>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Double> v3 = new Vector<Double>();
		
		v1.add("Hello");
		v1.add("My");
		v1.add("Dear Boys Lmao");
		
		v1.addElement("Kushwah");
		v1.addElement("Loves you ahah");
		// System.out.println(v1);
	}
	
	
}
