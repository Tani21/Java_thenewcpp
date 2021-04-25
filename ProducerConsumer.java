package project;
   class LockClass implements Runnable{
	 
    static int flag=4;
    int left;
    
    int arrayy[] = new int[3];
 
    LockClass(int left)
    {
        this.left=left;
    }
    
    static Object lock=new Object();
   
    public void run() 
    {
        while (true) 
        {
            synchronized (lock) 
            {
                while (flag % 4 != left) 
                { 
                    try 
                    {
                       lock.wait();
                    } 
                    
                    catch (Exception e) 
                    {
                        System.out.println(e);
                    }
                }
                
                if(Thread.currentThread().getName()=="ConsumerOne")
                {
                	arrayy[0]=0;
                	System.out.print("Consumer One consumed");
                }
                
                if(Thread.currentThread().getName()=="ConsumerTwo")
                {
                	arrayy[1]=0;
                	System.out.print("Consumer Two consumed");
                }
                
                if(Thread.currentThread().getName()=="ConsumerThree")
                {
                	arrayy[2]=0;
                	System.out.print("Consumer Three consumed");
                }
                if(Thread.currentThread().getName()=="Producer")
                {
                	arrayy[0]=10;
                	arrayy[1]=20;
                	arrayy[2]=30;
                	System.out.print("Producer has produced");
                }
                System.out.println();
                flag=flag+1;
                lock.notifyAll();
            }
        }
    }
}

public class LoveUPES {
	 
    public static void main(String[] args) {
 
    	LockClass runnable1=new LockClass(1);
    	LockClass runnable2=new LockClass(2);
    	LockClass runnable3=new LockClass(3);
    	LockClass runnable4=new LockClass(0);
 
        Thread threadone=new Thread(runnable1,"ConsumerOne");
        Thread threadtwo=new Thread(runnable2,"ConsumerTwo");
        Thread threadthree=new Thread(runnable3,"ConsumerThree");
        Thread threadfour=new Thread(runnable4, "Producer");
 
        threadfour.start();
        threadone.start();
        threadtwo.start();
        threadthree.start();   
    }
}
 
