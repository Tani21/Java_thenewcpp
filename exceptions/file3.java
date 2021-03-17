
public class Exceptions
{
    static void arithmeticException() throws ArithmeticException
    {
        double a = 15.0;
        double b = 0.0;
        double c = 0;
        try
        {
        	c = a/b;
        }
        
        catch(ArithmeticException ae)
        {
        	System.out.println(ae);
        }
        System.out.println(c);
    }
    
    static void nullPointerException() throws NullPointerException
    {
        String mayankkadimag = null;
        try
        {
        	String appended = mayankkadimag.toLowerCase();
        }
        
        catch(NullPointerException npe)
        {
        	System.out.println(npe);
        }
    }
    
    static void stringIndexOutOfBoundsException()
    {
    	String name="Tanishka";
    	try
    	{	
    			System.out.println(name.charAt(10));
    	
    	}
    	catch(StringIndexOutOfBoundsException sioobe)
    	{
    		System.out.println(sioobe);
    	}
    }
    
    static void arrayIndexOutOfBoundException()
    {
    	int array[] = new int[10];
    	try
    	{
    		System.out.println(array[10]);
    	}
    	catch(ArrayIndexOutOfBoundsException aioobe )
    	{
    		System.out.println(aioobe);
    	}
    	
    }
    
    static void numberFormatException()
    {
    	String circle="friendcircle";
    	try
    	{
    		int number = Integer.parseInt(circle);
    	}
    	catch(NumberFormatException nfe)
    	{
    		System.out.println(nfe);
    	}
    }
    
	public static void main(String[] args) {
		
		arithmeticException();
		nullPointerException();
		stringIndexOutOfBoundsException();
		arrayIndexOutOfBoundException();
		numberFormatException();
	}
}

