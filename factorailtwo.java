package labfile;

class Factorial
{
	int fact(int number)
	{
		int result;
		
		if(number==1)
			return 1;
		
		else
			result=number*fact(number-1);
		return result;
	}
}

public class Recursion {

	public static void main(String[] args) {
		
		Factorial factorialone = new Factorial();
		int answer = factorialone.fact(6);
		System.out.println("factorial of 6 is: "+answer);
	}

}

