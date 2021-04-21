package project;

class ClassI extends Thread
{
	synchronized static public void displayOne() {
		System.out.print("I ");
	}
	
	synchronized static public void displayTwo() {
		System.out.print("Love ");
	}
		
	synchronized static public void displayThree() {
		System.out.print("UPES ");
	}
		
		
}

class ClassOne extends Thread
{
	public void run()
	{
		ClassI.displayOne();
	}
	
}

class ClassTwo extends Thread
{
	public void run()
	{
		ClassI.displayTwo();
	}
	
}

class ClassThree extends Thread
{
	public void run()
	{
		ClassI.displayThree();
	}
	
}

public class ILoveUpes {

	public static void main(String[] args) {
		ClassOne ci = new ClassOne();
		ClassTwo cl = new ClassTwo();
		ClassThree cu = new ClassThree();
		
		
			ci.start();
			cl.start();
			cu.start();
			
			for(int i=0; i<4; i++)
			{
				ci.run();
				cl.run();
				cu.run();
				
			}
		
	}

}
