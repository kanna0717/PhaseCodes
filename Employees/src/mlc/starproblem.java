package mlc;

//*****
//*****      problem example 1
//*****
//*****
//*****

import java.util.Scanner;

public class starproblem {

	public static void main(String[] args) {
		System.out.println("Enter the number of row and coloumns");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
			
			System.out.print("*");
		
		}
	System.out.println();
}
}
}