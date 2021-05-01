package labfile;

class Multiplication
{
	int a, b, result;
	
	Multiplication(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void multiply()
	{
		result=a*b;
	}
	
}

class Answer
{
	int ans =12;
	
	void match(Multiplication multiplication)
	{
		if(multiplication.result==ans)
		{
			System.out.println("Your answer is correct");
		}
		
		else
		{
			System.out.println("Your answer is incorrect");
		}
	}
	
}

public class ObjectAsParameter {

	public static void main(String[] args) {
		
		Multiplication multiplicationone = new Multiplication(3,4);
		multiplicationone.multiply();
		
		Answer answerone = new Answer();
		answerone.match(multiplicationone);

	}

}

