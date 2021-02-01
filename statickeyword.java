class MyClass
{
    static int i,j;
    static int MyClass(int a, int b)
    {
        i=a;
        j=b;
        return i+j;
    }
}


public class Main
{
    static void hello()
    {
        System.out.println("Hello");
    }
    
	public static void main(String[] args) {
	    
	    MyClass object = new MyClass();
	     int result = object.MyClass(4,5);
		System.out.println(result);
		
		hello();
	}
}
