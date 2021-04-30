package labfile;

public class PrintArea {
	
	static double triangle(double length, double breadth)
	{
		return (0.5*length*breadth);
	}
	
	static double circle(double radius)
	{
		return (3.14*radius*radius);
		
	}
	
	static int square(int length)
	{	
		return (length*length);
	}

	public static void main(String[] args) {
		double trianglearea = triangle(4.0, 4.0);
		double circlearea = circle(7.0);
		int squarearea = square(20);
		
		System.out.println("area of triangle: "+trianglearea);
		System.out.println("area of circle: "+circlearea);
		System.out.println("area of square: "+squarearea);
	}
}

