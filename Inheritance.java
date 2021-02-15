class Clothes
{
	String jeans="jeans", shirt="shirt";
	int no_of_jeans, no_of_shirts;
	
	Clothes(int no_of_jeans, int no_of_shirts)
	{
		System.out.println("Welcome to the clothes section");
		this.no_of_jeans=no_of_jeans;
		this.no_of_shirts=no_of_shirts;
	}
	
	
	Clothes()
	{
		System.out.println("Welcome to the clothes section");
	}
	
	
	
}

class BoysClothes extends Clothes
{
	String shorts="shorts", Tshirt="Tshirt";
	int no_of_shorts, no_of_Tshirts;
	
	public BoysClothes(int no_of_shorts, int no_of_Tshirts, int no_of_jeans, int no_of_shirts) {
		super(no_of_jeans, no_of_shirts);
		System.out.println("Welcome to the clothes section of boys");
		this.no_of_shorts=no_of_shorts;
		this.no_of_Tshirts=no_of_Tshirts;
	}
	
	
	
	
	BoysClothes()
	{
		System.out.println("Welcome to the clothes section of boys");
	}
	
	
	
	
}

class InfantBoysClothes extends BoysClothes
{
	InfantBoysClothes()
	{
		System.out.println("Welcome to the clothes section of infant boys");
	}
	
	String shoes="shoes"; 
	int no_of_shoes;
	
	InfantBoysClothes(int no_of_shoes, int no_of_shorts, int no_of_Tshirts, int no_of_jeans, int no_of_shirts)
	{
		super( no_of_shorts, no_of_Tshirts, no_of_jeans, no_of_shirts);
		System.out.println("Welcome to the clothes section of infant boys");
		this.no_of_shoes=no_of_shoes;
		
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		InfantBoysClothes object = new InfantBoysClothes(10,20,30,40,50);
		System.out.println("no of shirts= " + object.no_of_shirts );
		System.out.println("no of jeans= " + object.no_of_jeans );
		System.out.println("no of Tshirts= " + object.no_of_Tshirts );
		System.out.println("no of shorts= " + object.no_of_shorts );
		System.out.println("no of shoes= " + object.no_of_shoes );
	}

}
