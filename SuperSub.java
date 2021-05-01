package project;

class superclass
{
    void displayone()
    {
        System.out.println("one");
    }
}

class subclass extends superclass
{
    void displaytwo()
    {
        System.out.println("two");
    }
    
}

public class SuperSub
{
	public static void main(String[] args) {
	superclass supc = new superclass();
	//subclass subc = new subclass();
	//subc = new superclass();
	supc = new subclass();
	supc.displayone();
	//supc.displaytwo();
	
	}
}
