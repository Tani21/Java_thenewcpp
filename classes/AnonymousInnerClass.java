package packageone;

class Sports
{
	void eat()
	{
		System.out.println("playing");
	}
}

class AnonymousInnerClass
{
	public static void main(String args[])
	{  
	    Sports obj=new Sports()
	    {  
	    	void eat(){System.out.println("playing badminton");
	    }  
	   };  
	 obj.eat();  
	 System.out.println("The anonymous inner class is basically used to override functions");
	 System.out.println("the class can be abstract or concrete");
	}  
}


