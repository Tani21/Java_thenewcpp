import java.util.*;

public class NextPeak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scanner.nextInt();
		System.out.println("enter the elements of array");
		int myarray[] = new int[size];
		for(int i=0; i<size; i++)
		{
			myarray[i]  = scanner.nextInt();		
		}
		
		int count=0;
		int peakarray[] = new int[size];
		for(int i=0; i<size; i++)
		{
			count=0;
			for(int j=i+1; j<size; j++)
			{
				if(myarray[i]<myarray[j])
				{
					count=count+1;
					peakarray[i]=j-i;
					
				}
				
				if(count==1)
				break;
			}
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(peakarray[i]+" ");
		}
			scanner.close();
		

	}

}
