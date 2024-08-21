package BasicOperation;

import java.util.Scanner;

public class chooseOption {

	public static void main(String[] args) {
        
		int n;
		Scanner scr=new Scanner(System.in);
		while(true) {
		System.out.println("Who is the creator of Bulb");
		System.out.println("\n1 1.Thomas\n2 2.Edson\n3 3.Steve\n4 4.Edward");
		System.out.println("choose the opinion");
	    n=scr.nextInt();

		if(n==1)
		{
			System.out.println("Right opinion");
			break;
		}
		
		else if(n==5)
		{
			System.out.println(" no opinion");
			break;
		}
		else {
			System.out.println("Wrong choose");
		}
}
}
}			
			

