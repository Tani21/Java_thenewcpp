package threading;

class MyThread implements Runnable
{ 
	Thread newthread;
	
	public void run()
	{
		newthread = new Thread();
		newthread.start();
		
		try
		{
			System.out.println("what do you wanna run?");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("where do you wanna run?");
	}
	
	public void newMethod()
	{
		System.out.println("Will a non defined method work?");
	}
	
	
}

public class MultiThreading
{
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());
		t1.start();
		System.out.println(t1);
		t1.setName("MyThread");
		t1.setPriority(1);
		System.out.println(t1);
		
		for(int i=0; i<5; i++)
		{
			try
				{
					Thread.sleep(1000);
					System.out.println("i value"+i);
				}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		
		//MyThread mt = new MyThread();
		//mt.start();
		//mt.newMethod();
	}
}

