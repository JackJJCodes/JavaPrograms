import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamImplementation {

	public static void main(String[] args) 
	{
//		Stream<Integer> stream = Stream.of(1, 2 ,3, 4, 5, 6, 7);
//		stream.forEach((p -> System.out.println(p*2)));
		
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		
		// Demonstrating map method:
		List<Integer> square = number.stream().map(x -> x*x). 
                collect(Collectors.toList());
		
		// System.out.println(square);
		
		// Demonstrating streams using Strings.
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Sniper", "Poindexter");
		
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		
		// System.out.println(result);
		
		// Demonstrating sorting operation:
		List<Integer> numberUnsorted = Arrays.asList(2, 1, 4, 3, 6, 5);
		
		List<Integer> numberSorted = numberUnsorted.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Unsorted numbers: " + numberUnsorted);
		System.out.println("Sorted Numbers: " + numberSorted);
	}

}
