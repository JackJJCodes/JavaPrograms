import java.util.*;
public class HashSetImplementation {

	public static void main(String[] args) 
	{
		HashSet<Integer> t1 = new HashSet<Integer>();
		
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		
		Iterator<Integer> itr = t1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
