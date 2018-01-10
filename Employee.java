import java.util.ArrayList;

class Employee
{
	String name;
	int age;
	double salary;
	
	public Employee()
	{
		this.name = "NA";
		this.age = 0;
		this.salary = 0;
	}
	
	public Employee(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return this.name + " " + this.age + " " + this.salary;
	}
	
}


public class ACM 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> company = new ArrayList();
		
		Employee set [] = new Employee[3];
		
		set[0] = new Employee("Tony", 22, 20000);
		set[1] = new Employee("Maria", 20, 40000);
		set[2] = new Employee("Alvaro", 22, 5000);
		
		for(int i=0; i<set.length; i++)
		{
			company.add(set[i]);
		}
		
		System.out.println(company);
	}
}
