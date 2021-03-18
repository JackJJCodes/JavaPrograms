import java.util.*;
import java.util.stream.Collectors;
public class ClassWorkCollections {

	public static void main(String[] args) 
	{
		ArrayList<String> students = new ArrayList<String> ();
		
		students.add("Matt");
		students.add("Karen");
		students.add("Foggy");
		students.add("Wilson");
		students.add("Poindexter");
		
		students.stream().filter(s->s.startsWith("W")).forEach(System.out::println);
		
		System.out.println(students);
		
	}

}
