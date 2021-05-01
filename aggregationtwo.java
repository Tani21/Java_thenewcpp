package labfile;

class Car
{
	int yearofpurchase;
	String model;
	
	Car(int yearofpurchase, String model)
	{
		this.yearofpurchase = yearofpurchase;
		this.model=model;
	}
}

class Driver
{
	String name;
	int age;
	Car car;
	
	Driver(String name, int age, Car car)
	{
		this.name=name;
		this.age=age;
		this.car=car;
	}
	
	void display()
	{
		System.out.println("name: "+name+" age: "+age+" year of purchase: "+car.yearofpurchase+" model: "+car.model);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		System.out.println("Aggregation is a weak association, that is of type 'Has a'. One object can exist without the other object");
		
		Car carone = new Car(2015, "SUV");
		Car cartwo = new Car(2002, "BMW");
		
		Driver driverone = new Driver("Ramesh", 23, carone);
		Driver drivertwo = new Driver("Suresh", 20, cartwo);
		
		driverone.display();
		System.out.println();
		drivertwo.display();
	}

}

