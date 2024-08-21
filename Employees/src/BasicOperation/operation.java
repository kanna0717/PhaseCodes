
package BasicOperation;

import java.util.Scanner;
public class operation {

	public static void main(String[] args) {
		  int n1,n2,cal;
		  System.out.println("Arithmetric operation");
		  Scanner s =new Scanner(System.in);
		  System.out.println("Enter the first number");
		  n1 =s.nextInt();
		  System.out.println("Enter the second number");
		  n2 =s.nextInt();
		  
		  System.out.println("Arithmetric operation of two numbers:");
		  System.out.println("Addition of two numbers :"+ (n1+n2));
		  System.out.println("Subtraction of two numbers"+ (n1-n2));
		  System.out.println("Multiplication of two numbers"+ (n1*n2));
		  System.out.println("Division of two numbers"+ (n1/n2));
		  System.out.println("Modulation of two numbers"+ (n1%n2));
		   
	}

}
