package project;
   class LockClass implements Runnable{
	 
    static int flag=1;
    int left;
 
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
                while (flag % 3 != left) 
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
                
                if(Thread.currentThread().getName()=="ThreadOne")
                {
                	System.out.print(" I");
                }
                
                if(Thread.currentThread().getName()=="ThreadTwo")
                {
                	System.out.print(" love");
                }
                
                if(Thread.currentThread().getName()=="ThreadThree")
                {
                	System.out.print(" UPES");
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
    	LockClass runnable3=new LockClass(0);
 
        Thread threadone=new Thread(runnable1,"ThreadOne");
        Thread threadtwo=new Thread(runnable2,"ThreadTwo");
        Thread threadthree=new Thread(runnable3,"ThreadThree");
 
        threadone.start();
        threadtwo.start();
        threadthree.start();   
    }
}
