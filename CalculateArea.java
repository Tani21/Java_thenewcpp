public class CalculateArea
{
	public static void main(String[] args) {
	    System.out.println("Enter breadth and height of triangle");
		int b = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		double area1 = triangleArea(b,h);
		System.out.println("Area of triangle is "+area1);
		
		System.out.println("Enter side of square");
		int l = Integer.parseInt(args[2]);
		int area2 = squareArea(l);
		System.out.println("Area of square is "+area2);
		
		System.out.println("Enter radius of circle");
		int r = Integer.parseInt(args[3]);
		double area3 = circleArea(r);
		System.out.println("Area of circle is "+area3);
		
	}
	
	static double triangleArea(int b, int h)
	{
	    return (0.5*b*h);
	}
	
	static int squareArea(int l)
	{
	    return (l*l);
	}
	
	static double circleArea(int r)
	{
	    return (3.14*r*r);
	}
}


