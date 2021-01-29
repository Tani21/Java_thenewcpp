class MyClass
{
    static int i,j;
    static int add(int a, int b)
    {
        i=a;
        j=b;
        return i+j;
    }
}


public class Main
{
	public static void main(String[] args) {
	    
	    MyClass object = new MyClass();
	     int result = object.add(4,5);
		System.out.println(result);
	}
}
