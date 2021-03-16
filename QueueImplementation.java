import java.util.*;
public class QueueImplementation {

	public static void main(String[] args)
	{
		// Initializing the deque
		Deque<String> deque = new LinkedList<String>();
		
		deque.addFirst("1st Element: Hello");
		deque.add("Middle Element");
		deque.add("Hey");
		deque.add("Morning");
		deque.addLast("Last Element: World");
		
		System.out.println(deque + "\n");
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println(deque + "\n");
	}

}
