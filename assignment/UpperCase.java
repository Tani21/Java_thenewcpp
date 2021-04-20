package project;
import java.util.*;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		System.out.println("Tanishka Vaswani \nRoll No: R171219037\nSap ID: 500076374\n ");
		
		Scanner scanner = new Scanner(System.in);
		String abcd = scanner.nextLine();
		StringBuffer sb = new StringBuffer(abcd);
		
		
		for(int i=0; i<abcd.length(); i++)
		{
			if(abcd.charAt(i)==' ')
			{
				sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
			}
		}
		System.out.println(sb);
		scanner.close();
	}
}

