package threading;

class ClassOne extends Thread
{
	static synchronized public void play(int n)
	{
		for(int i=n; i<n+5; i++)

		{
			try
			{
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
	}
}

class ClassTwo extends Thread
{
	synchronized public void run()
	{
		ClassOne.play(5);
		
	}
	
}

class ClassThree extends Thread
{
	synchronized public void run()
	{
		ClassOne.play(20);
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		Thread threadone = new Thread(new ClassOne());
		Thread threadtwo = new Thread(new ClassTwo());
		Thread threadthree = new Thread(new ClassThree());
		
		threadone.start();
		threadtwo.start();
		threadthree.start();

	}

}

