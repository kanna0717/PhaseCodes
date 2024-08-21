package mlc;
import java.util.Scanner;

//12345
//12345
//12345
//12345
//12345

public class example1 {

	public static void main(String[] args) {
	System.out.println("Enter the number of rows and columns :");
	Scanner scr= new Scanner(System.in);
	System.out.println("Enter the value of n :");
	int n=scr.nextInt();
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			System.out.print("");
		    System.out.print(i);
		}
		System.out.println();
	}

	}

}
