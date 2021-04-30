package labfile;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 1000 include");
		for(int i=2; i<=1000; i++)
		{
			int flag = 0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=flag+1;
				}
			}
			
			if(flag==0)
			{
				System.out.print(i+" ");
			}
			
			else {}
		}

	}

}
