package packageone;

class checkaccess
{
	public int a = 10;
	private int b = 10;
	int c =10;
	protected int d =10;
	
	void print()
	{
		System.out.println("Variables that can be accessed: "+"a: "+a+" b:"+b+" c: "+c+" d: "+d);
	}
}

class extendedClass extends checkaccess
{
	void print()
	{
		System.out.println("Variables that can be accessed: "+"a: "+a+" c: "+c+" d: "+d);
		System.out.println("b is private and is not accessible outside the class in which defined");
	}
}

public class AccessSpecifiers {

	public static void main(String[] args) {
	checkaccess objNew = new checkaccess();
	objNew.print();
	objNew = new extendedClass();
	System.out.println();
	objNew.print();	
	
	}

}

