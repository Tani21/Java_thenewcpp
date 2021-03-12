package packageone;

class Cars
{
	int avgSpeed = 70;
	
	void printSpeed()
	{
		class RacingCar
		{
			void speed()
			{
				System.out.println("Avg speed of racing car is: "+(2*avgSpeed)+"km/h");
			}
		}
		
		RacingCar obj = new RacingCar();
		obj.speed();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		System.out.println("Local Inner class is used for creating a class inside method");
		Cars newObj = new Cars();
		newObj.printSpeed();
	}

}

