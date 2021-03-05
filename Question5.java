//*******************************************************************************


//							Program by Jackson Jacob(19BAI10049)
	

//*******************************************************************************
abstract class Student
{
	private String name;
	private int id;
	private double gpa;
	
	Student(String name, int id, double gpa)
	{
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	public String getName()
	{
		return name;
	}
	public double getGPA()
	{
		return gpa;
	}
	public int getID()
	{
		return id;
	}
	void setName(String name1)
	{
		this.name = name1;
	}
	public String toString()
	{
		return (name + " with ID " + id + " with GPA " + gpa);
	}
}

class Undergrad extends Student
{
	private int year;
	Undergrad(String name, int id, double gpa)
	{
		super(name, id, gpa);
	}
	void setYear(int year)
	{
		this.year = year;
	}
	int getYear()
	{
		return year;
	}
	public String toString()
	{
		return (getName() + " with ID " + getID() + " with GPA " + getGPA() + " in year " + getYear());
	}
}

class Graduate extends Student
{
	private String thesisTitle;
	Graduate(String name, int id, double gpa)
	{
		super(name, id, gpa);
	}
	void setThesisTitle(String thesisTitle)
	{
		this.thesisTitle = thesisTitle;
	}
	String getThesisTitle()
	{
		return thesisTitle;
	}
	public String toString()
	{
		return (getName() + " with ID " + getID() + " with GPA " + getGPA());
	}
}


public class Question5 
{
	public static void main(String args[])
	{
		Graduate g1 = new Graduate("James", 10, 4.0);
		Undergrad u1 = new Undergrad("Dino", 1011, 3.5);
		
		g1.setThesisTitle("ML AI");
		System.out.println(g1.getThesisTitle());
		u1.setYear(2020);
		System.out.println(u1.getYear());
		
		System.out.println(g1.toString());
		System.out.println(u1.toString());
	}
	
}
