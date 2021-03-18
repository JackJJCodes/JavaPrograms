import java.util.*;

class Employees
{
	// Declaring private variables
	private String fName;
	private String lName;
	private Integer deptNumber;
	
	// Initializing with the help of constructor
	Employees(String fName, String lName, Integer deptNumber)
	{
		this.fName = fName;
		this.lName = lName;
		this.deptNumber = deptNumber;
	}
	
	// Declaring getters and setters methods:
	public void setFName(String fName)
	{
		this.fName = fName;
	}
	public void setLName(String lName)
	{
		this.lName = lName;
	}
	public void setDeptNumber(Integer deptNumber)
	{
		this.deptNumber = deptNumber;
	}
	public String getFName()
	{
		return fName;
	}
	public String getLName()
	{
		return lName;
	}
	public Integer getDeptNumber()
	{
		return deptNumber;
	}
	
	//Overriding toString method:
	public String toString()
	{
		return ("First Name: " + getFName() + ", Last Name: " + getLName() + ", with Department number: " + getDeptNumber());
	}
}

class ProcessingEmployees
{
	public static void main(String args[])
	{
		Employees[] arrayOfEmployees = {
				new Employees("Eden", "Hazard", 7),
				new Employees("Karim", "Benzema", 9),
				new Employees("Luka", "Modric", 10)
		};
		
//		for(int i=0; i<3; i++)
//		{
//			System.out.println(arrayOfEmployees[i].toString());
//		}
		
		List <Employees> empList = Arrays.asList(arrayOfEmployees);
		empList.stream().forEach(System.out.println(empList.toString()));
	}
}