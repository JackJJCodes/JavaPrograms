import java.util.*;
import java.util.stream.Collectors;

public class Streams2 
{
	public static void main(String[] args) 
	{
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Warren Buffett", 120));
		people.add(new Person("Jeff Bezos", 150));
		people.add(new Person("Bill Gates", 100));
		people.add(new Person("Mark Zuckerberg", 50));
		
		// Doing it manually:
		
//		List<Person> hundredClub = new ArrayList<>();
		
//		List<Person> hundredClub = people.stream().filter(person -> person.billions >= 100)
//																		  .collect(Collectors.toList());
		
		List<Person> sortedNames = people.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());
		
//		for(Person p:people)
//		{
//			if(p.billions >= 100)
//				hundredClub.add(p);
//		}
		
		sortedNames.forEach(p -> System.out.println(p.name));
	}
	
	static class Person
	{
		String name;
		int billions;
		
		public Person(String name, int billions)
		{
			this.name = name;
			this.billions = billions;
		}
	}
}


