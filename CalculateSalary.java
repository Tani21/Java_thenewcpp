package labfile;

class Employee
{
	String name;
	int id, basicsalary, sa, hra, da, salary;
	
	Employee(String name, int id, int basicsalary, int sa, int hra, int da)
	{
		this.name=name;
		this.id =id;
		this.basicsalary=basicsalary;
		this.sa=sa;
		this.hra=hra;
		this.da=da;
	}
	
	void calculateSalary()
	{
		salary=basicsalary + sa + hra + da;
		System.out.println("Name: "+name+" id: "+ id+ " salary: "+salary);
	}
}

class Manager extends Employee
{

	Manager(String name, int id, int basicsalary, int sa, int hra, int da) 
	{
		super(name, id, basicsalary, sa, hra, da);
		
	}
	
	void calculateSalary()
	{
		salary=basicsalary + 2*sa + hra + da;
		System.out.println("Name: "+name+" id: "+ id+ " salary: "+salary);
	}
	
}

class ProjectManager extends Manager
{

	ProjectManager(String name, int id, int basicsalary, int sa, int hra, int da) 
	{
		super(name, id, basicsalary, sa, hra, da);
	}
	
	void calculateSalary()
	{
		salary=basicsalary + 2*sa + 2*hra + da;
		System.out.println("Name: "+name+" id: "+ id+ " salary: "+salary);
	}
	
}

public class CalculateSalary {

	public static void main(String[] args) {
		Employee emp = new Employee("Tanishka", 21, 300000, 2000, 2000, 2000 );
		emp.calculateSalary();
		emp = new Manager("Tanishka", 21, 300000, 2000, 2000, 2000);
		emp.calculateSalary();
		emp = new ProjectManager("Tanishka", 21, 300000, 2000, 2000, 2000);
		emp.calculateSalary();

	}

}

