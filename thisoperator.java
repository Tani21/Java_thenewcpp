class MyClass
{
     int i, j, k;
     int add(int i, int j)
    {
        this.i = i;
        this.j = j;
        k = this.i + this.j;
        return k;
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    MyClass object = new MyClass();
	    int z = object.add(4,5);
	    System.out.println(z);
	}
	
	
}
