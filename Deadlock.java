package labfile;
 
public class Deadlock 
{
    public static Object objone = new Object();
    public static Object objtwo = new Object();
    
    public static void main(String[] args) {
        
        NewClassOne nco = new NewClassOne();  
        NewClassTwo nct = new NewClassTwo();  
        nco.start();  
        nct.start();  
        
    }
    
    private static class NewClassOne extends Thread
    {
        
        public void run()
        {
            synchronized (objone) 
            {  
                  System.out.println("Thread 1 locked resource 1");  
          
                  try 
                 { 
                      Thread.sleep(10);
                  } 
                  
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }  
             
        
          
                  synchronized (objtwo) 
                  {  
                      System.out.println("Thread 1 locked resource 2");  
                  }
            }
        }
        
    }
 
    private static class NewClassTwo extends Thread
    {
        
        public void run()
        {
            synchronized (objtwo) 
            {  
                  System.out.println("Thread 2 locked resource 2");  
          
                  try 
                  { 
                      Thread.sleep(10);
                  } 
                  
                  catch (Exception e) 
                  {
                      System.out.println(e);
                  }  
          
                  synchronized (objone) 
                  {  
                      System.out.println("Thread 2 locked resource 1");  
                  }
            }
        
        }
    }
    
}
                    
