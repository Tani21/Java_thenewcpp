package labfile;

class ShapeClass
{
	void area(int a)
	{
		System.out.println("area of shape");
	}
	
	final void basicCharacteristics()
	{
		System.out.println("This final method cannot be overriden");
		System.out.println("All shapes have some basic characteristics");
		System.out.println();
	}
	
}

final class CircleClass extends ShapeClass
{
	final double pi = 3.14;
	void area(int a)
	{
		System.out.println("Area of circle is: "+(pi*a*a));
	}
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		ShapeClass newshape = new ShapeClass();
		newshape.basicCharacteristics();
		newshape = new CircleClass();
		newshape.area(10);

	}

}

