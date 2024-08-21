package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class queueExample {
	  public static void main(String[] args) {
	        Queue<String> q = new LinkedList<String>();
	        q.add("Krishna");
	        q.add("kishan");
	        q.add("surya");
	        q.add("bheemesh");
	        q.add("chandana");
	        q.add("swathi");
	        q.add("akhil");
	        System.out.println(q);
	        System.out.println("Person at the front position: "+q.peek());
	        q.remove();
	        System.out.println(q);
	        System.out.println("Person at the front position: "+q.peek());
	        q.remove();
	        System.out.println(q);
	        System.out.println("Person at the front position: "+q.peek());
	        q.remove();
	        System.out.println(q);
	        System.out.println("Person at the front position: "+q.peek());
	        q.remove();
	        System.out.println(q);
	        System.out.println("Person at the front position: "+q.peek());



	    }
	}


