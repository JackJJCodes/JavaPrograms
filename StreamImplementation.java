import java.util.*;
import java.util.stream.Stream;
public class StreamImplementation {

	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.of(1, 2 ,3, 4, 5, 6, 7);
		stream.forEach((p -> System.out.println(p*2)));
	}

}
