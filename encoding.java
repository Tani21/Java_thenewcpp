package project;
import java.util.*;

public class Encoding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string");
		String considerstring = scanner.nextLine();
		System.out.println("enter the encoding value between 2 and 25");
		int ev = scanner.nextInt();
		if(ev<2 || ev >25)
		{
			System.out.println("Please enter a value between 2 and 25 only");
		}
		
		else
		{
			char chararray[] = considerstring.toCharArray();
			for(int i=0; i<chararray.length; i++)
				{
					for(int j=0; j<ev; j++)
						{
							chararray[i]++;
						}
				}
		
			System.out.println(chararray);
		}
		scanner.close();
	}

}

