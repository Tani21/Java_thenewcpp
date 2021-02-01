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
		
		System.out.println("Using reference variable");
		System.out.println("i: "+object.i+" "+"j: "+object.j);
		System.out.println("Using class name");
		System.out.println("i: "+MyClass.i+" "+"j: "+MyClass.j);
		
	}
}
