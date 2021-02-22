class Shape{
    Shape()
    {
        System.out.println("Grandparent constructor");
    }
    
    void area()
    {
        System.out.println("area by shape");
        System.out.println();
    }
}

class Parallelogram extends Shape{
    Parallelogram()
    {
        System.out.println("parent constructor");
    }
    
    void area()
    {
        System.out.println("area by Parallelogram");
        System.out.println();
    }
    
    
}

class Square extends Parallelogram{
    Square()
    {
        System.out.println("child constructor");
    }
    
    void area()
    {
        System.out.println("area by square");
        System.out.println();
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    Shape object = new Shape();
	    object.area();
	    
	    object = new Parallelogram();
	    object.area();
	    
	    object = new Square();
	    object.area();
	    
	}
}
