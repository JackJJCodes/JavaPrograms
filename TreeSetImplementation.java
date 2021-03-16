import java.util.*;
public class TreeSetImplementation {
	public static void main(String[] args) 
	{
		TreeSet<Integer>ts = new TreeSet<Integer>();
		
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		
		Iterator<Integer> itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
