class Shape{
    Shape()
    {
        System.out.println("Grandparent constructor");
    }
}

class Parallelogram extends Shape{
    Parallelogram()
    {
        System.out.println("parent constructor");
    }
}

class Square extends Parallelogram{
    Square()
    {
        System.out.println("child constructor");
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    Square object = new Square();
	    
	}
}

