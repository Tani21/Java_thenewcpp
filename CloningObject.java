class Bottle implements Cloneable
{
	int capacity;
	String color,shape;
	
	
	Bottle(int capacity, String color, String shape)
	{
		this.capacity=capacity;
		this.color=color;
		this.shape=shape;
	}
	
	void Print()
	{
		System.out.println("Capacity: "+capacity+"  shape: "+shape+"  color: "+color);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


public class CloningObject 
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Bottle waterBottle = new Bottle(1, "blue", "rectangularCircle");
		waterBottle.Print();
		Bottle perfumeBottle = (Bottle)waterBottle.clone();
		perfumeBottle.Print();
	}

}

