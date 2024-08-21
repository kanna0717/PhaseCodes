package Collections;

import java.util.ArrayDeque;


public class Arraydeque {

	public static void main(String[] args) {
	
		ArrayDeque ad= new ArrayDeque();
		
		ad.add(4567);
		ad.add("krishna");
		ad.add(true);
		ad.addFirst(12);
		ad.addLast(456);
	
		System.out.println(ad);
		
		ad.element();
		System.out.println(ad);
		ad.getLast();
		System.out.println(ad);
		//ad.getFirst();
		
		ad.push(200);
		System.out.println(ad);
		ad.peek();
		System.out.println(ad);
		ad.peekLast();
		System.out.println(ad);	}

}
