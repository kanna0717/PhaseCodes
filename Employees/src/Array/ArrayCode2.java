package Array;

import java.util.Scanner;
//2D-Array
public class ArrayCode2 {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first square bracket value: (row)(m)");
      int m = scan.nextInt();
      System.out.println("Enter the second square bracket value: (col)(n)");
      int n = scan.nextInt();
      
      int a[][] = new int[m][n];
      
      for(int i=0;i<m;i++) {
          for(int j=0;j<n;j++) {
              System.out.println("Enter the value:");
              a[i][j] = scan.nextInt();
          }
      }
      for(int i=0;i<m;i++) {
       
    	  for(int j=0;j<n;j++) {
             
              System.out.println(a[i][j]);
              System.out.print(" ");
          }
    	  System.out.println();
      }
  }
  
}

