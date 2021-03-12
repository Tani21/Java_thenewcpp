package packageone;

class Car
{
	int avgSpeed = 70;
	
	class RacingCar
	{
		void speed()
		{
			System.out.println("Avg speed is: "+(2*avgSpeed)+"km/h");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Car obj = new Car();
		Car.RacingCar newObj = obj.new RacingCar();
		newObj.speed();
	}

}

