package project;
import java.util.*;

public class Arrayys {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Working with arraylist");
		ArrayList <Integer> al = new ArrayList <Integer>();
		System.out.println("Number of integers you want to input");
		int totalnumbers = scanner.nextInt();
		System.out.println("Enter all numbers");
		al.add(scanner.nextInt());
		al.add(scanner.nextInt());
		al.add(scanner.nextInt());
		System.out.println(al);
		
		System.out.println("get numbers at particular index");
		System.out.println("value at index 1 "+al.get(1));
		System.out.println("value at index 2 "+al.get(2));
		
		System.out.println("setting numbers at particular index");
		al.set(2, 4);
		//al.set(3, 5);
		//al.set(4, 6);
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		System.out.println("size: "+al.size());
		
		al.add(4);
		al.add(20);
		al.add(7);
		al.add(40);
		al.add(10);
		
		Collections.sort(al);
		System.out.println(al);
		
		scanner.close();

	}

}
