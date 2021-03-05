class Employee 
{
	private String en;
	@SuppressWarnings("unused")
	private String eid;
	@SuppressWarnings("unused")
	private double salary;
	
	public Employee(String en, String eid, double salary)
	{
		this.en = en;
		this.eid = eid;
		this.salary = salary;
	}
	public void setName(String en)
	{
		this.en = en;
	}
	String getName()
	{
		return en;
	}
	public void setEid(String eid)
	{
		this.eid = eid;
	}
	String getEid()
	{
		return eid;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	double getSalary()
	{
		return salary;
	}
}
class Manager extends Employee
{
	private double bonus;
	// Manager class constructor:
	Manager(String en, String eid, double salary, double bonus)
	{
		super(en, eid, salary);
		this.bonus = bonus;
	}
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	public double getBonus()
	{
		return bonus;
	}
	double getSalary()
	{
		double msalary = super.getSalary() + bonus;
		return msalary;
	}
}

// Driver class
public class Company
{
	public static void main(String args[])
	{
		Employee e = new Employee("XYZ", "ABC89898", 50000.00);
		System.out.println(e.getSalary());
		Manager boss = new Manager("Anad", "ABC1010", 100000.00, 9000);
		
		System.out.println(boss.getSalary());
		
		// Array of objects:
		Employee staff[] = new Employee[3];
		for(int i=0;i<3;i++)
		{
			System.out.println(staff[i].getName());
		}
	}
}
