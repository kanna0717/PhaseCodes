package mlc;


import java.util.Scanner;

public class Example2 {

      
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the value :");
		int n=scr.nextInt();
	
		int temp=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				if(i==1||j==1||i==n||j==n) {
					
					System.out.print("*");
				}
				else {
				System.out.print(" ");
			}
		}
           System.out.println();
	}

}
}