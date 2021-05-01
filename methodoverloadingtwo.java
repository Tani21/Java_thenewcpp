package labfile;

class Area
{
	void area(int length)
	{
		System.out.println("area is "+(length*length));
	}
	
	void area(int length, int breadth)
	{
		System.out.println("area is "+(length*breadth));
	}
	
	void area(double base, double height)
	{
		System.out.println("area is "+(0.5*base*height));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Area areaone = new Area();
		
		areaone.area(4);
		areaone.area(4,8);
		areaone.area(5.5, 6.6);
		

	}

}

