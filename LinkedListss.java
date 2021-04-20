package project;
import java.util.*;

public class LinkedListss {

	public static void main(String[] args) {
		System.out.println("Linked lists are similar to array lists, except for their working");
		System.out.println("One container points to the other container where data is stored");
		
		LinkedList <Integer> ll = new LinkedList<Integer> ();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(0);
		System.out.println(ll);
		ll.addLast(40);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.add(0, 0);
		System.out.println(ll);
		

	}

}
