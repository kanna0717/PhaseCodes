package Collections;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add(11);
		ll.add("surya");
		ll.add(123.786);
		ll.add(6546);
		ll.add(true);
		
		System.out.println(ll);
		
		ll.addFirst(2000);
		System.out.println(ll);
		ll.addLast(3456);
		System.out.println(ll);
		ll.push(20000);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		
		
		
		
		
	}

}
