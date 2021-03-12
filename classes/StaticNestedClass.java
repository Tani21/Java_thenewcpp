package packageone;

class carrs
{
	private static int avgSpeed = 70;
	static class Racingcars
	{
		void Printspeed()
		{
			System.out.println("avg speed of racing car: "+(2*avgSpeed)+"km/h");
		}
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {
		System.out.println("static inner classes can access only static variables and methods of outer class");
		System.out.println("It can also access private static members of outer class as shown");
		
		carrs.Racingcars obj = new carrs.Racingcars();
		obj.Printspeed();

	}

}

