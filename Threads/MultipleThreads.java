package threading;

class ThreadOne implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(100);
				System.out.println("This thread is used to move pointer on screen");
		
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class ThreadTwo implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(100);
				System.out.println("This thread is used to take input from the keyboard");
		
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}

class ThreadThree implements Runnable
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1);
				System.out.println("This thread is used to display on screen");
		
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}



public class MultipleThreads {

	public static void main(String[] args) {
		Thread threadone = new Thread(new ThreadOne());
		Thread threadtwo = new Thread(new ThreadTwo());
		Thread threadthree = new Thread(new ThreadThree());
		
		threadone.start();
		threadtwo.start();
		threadthree.start();
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		threadone.setPriority(Thread.NORM_PRIORITY+1);
		threadtwo.setPriority(Thread.NORM_PRIORITY+3);
		threadthree.setPriority(Thread.NORM_PRIORITY+5);
		
		
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1);
				System.out.println("Hey! I am responsible for all the threads to work");
		
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		
		System.out.println("states of all threads: "+"threadone: "+threadone.isAlive()+" threadtwo: "+threadtwo.isAlive()+" threadthree: "+threadthree.isAlive());
		
		try
		{
			threadone.join();
			threadtwo.join();
			threadthree.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("states of all threads: "+"threadone: "+threadone.isAlive()+" threadtwo: "+threadtwo.isAlive()+" threadthree: "+threadthree.isAlive());
	
		

	}

}

