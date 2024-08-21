package mlc;

import java.util.Scanner;

public class example10 {

	public static void main(String[] args) {
		System.out.println("Enter the numbers of rows and columns");
		Scanner scr= new Scanner(System.in);
		int n=scr.nextInt();
		int count=25;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count);
				System.out.print(" ");
				count--;
			}
			System.out.println();
		}

	}

}
