class Employee
{
    double basic, SA, HRA, DA;
    
    Employee(double basic, double SA, double HRA, double DA )
    {
        this.basic = basic;
        this.SA = SA;
        this.HRA = HRA;
        this.DA = DA;
    }
    
    Employee()
    {
    	
    }
    
    void Salary()
    {
        System.out.println("Salary of Employee : "+(basic+SA+HRA+DA));
    }
    
    void Salary(double perc)
    {
        System.out.println("Salary of Employee : "+(basic+SA+HRA+DA));
    }
}

class Manager extends Employee
{
	 double basic, SA, HRA, DA;
	    
	    Manager(double basic, double SA, double HRA, double DA )
	    {
	        this.basic = basic;
	        this.SA = SA;
	        this.HRA = HRA;
	        this.DA = DA;
	    }
	    
	    Manager()
	    {
	    	
	    }
	
	
    void Salary()
    {
        System.out.println("Salary of manager: "+(basic+(2*SA)+HRA+DA));
    }
    
    void Salary(double perc)
    {
        System.out.println("Percentage Salary of manager: "+(basic+(2*SA)+HRA+DA+(perc/100)));
    }
}

class ProjectManager extends Manager
{
	 double basic, SA, HRA, DA;
	    
	    ProjectManager(double basic, double SA, double HRA, double DA )
	    {
	        this.basic = basic;
	        this.SA = SA;
	        this.HRA = HRA;
	        this.DA = DA;
	    }
	    
	    ProjectManager()
	    {
	    	
	    }
   
   
    void Salary()
    {
        System.out.println("Salary of project manager: "+(basic+(2*SA)+(2*HRA)+DA));
    }
    
    void Salary(double perc)
    {
        System.out.println("Percantage Salary of project manager: "+(basic+(2*SA)+HRA+DA+(perc/100)));
    }
}

public class OverloadingandOverriding
{
	public static void main(String[] args) {
		Employee object = new Employee(100.0,200.0,300.0,400.0);
		object.Salary();
		object = new Manager(100.0,200.0,300.0,400.0);
		object.Salary();
		//Manager newObject = new Manager(100.0,200.0,300.0,400.0);
		object.Salary(20);
		object = new ProjectManager(100.0,200.0,300.0,400.0);
		object.Salary();
		object.Salary(20);
	}
}

