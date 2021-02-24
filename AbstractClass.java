
abstract class Shape
{
	abstract void area();
	abstract void perimeter();
}

class Triangle extends Shape
{
	double height, base;
	Triangle(double height, double base)
	{
		this.height=height;
		this.base=base;
	}
	
	void area()
	{ 
		System.out.println("Area of traingle is: "+ (height*base*0.5)); 
	}
	
	void perimeter() 
	{
		System.out.println("Perimeter of traingle is: "+ (3*height));
	}
	
	Triangle(){}
	
}

class Circle extends Triangle
{
	
	double radius;
	
	Circle(double radius, double height, double base)
	{
		super(height,base);
		this.radius=radius;
	}	
	
	void area()
	{
		System.out.println("Area of Circle is: "+(3.14*radius*radius));
	}
	
	void perimeter() 
	{
		System.out.println("Perimeter of Circle is: "+ (2*3.14*radius));
	}

	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Shape object = new Circle(7.0,2.0,4.0);
		object.area();
		object.perimeter();
		object = new Triangle(20.0,45.0);
		object.area();
		object.perimeter();

	}

}
