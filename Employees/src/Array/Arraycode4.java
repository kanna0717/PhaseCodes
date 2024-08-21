package Array;

import java.util.Scanner;

public class Arraycode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
		      System.out.println("Enter the first square bracket value: (row)(m)");
		      int m = scan.nextInt();
		      System.out.println("Enter the second square bracket value: (col)(n)");
		      int n = scan.nextInt();
		      System.out.println("Enter the third square bracket value :(col)(o)");
		      int o =scan.nextInt();
		      System.out.println("Enter the fourth square bracket value :(col)(u)");
		      int u =scan.nextInt();
		      
		      int a[][][][]= new int[m][n][o][u];
		      
		      for(int i=0;i<m;i++) {
		          for(int j=0;j<n;j++) {
		        	  for(int z=0; z<o; z++) {
		        		  for(int p=0; p<u; p++) {
		              System.out.print("Enter the value:");
		              a[i][j][z][p] = scan.nextInt();
		          }
		      }
		      for(int i1=0; i1<m; i1++) {
		       
		    	  for(int j1=0; j1<n; j1++) {
		             for(int z=0; z<o; z++) {
		            	 for(int p=0; p<u; p++) {
		             
		              System.out.print(a[i1][j1][z][p]);
		              System.out.print(" ");
		          }
		    	  System.out.println();
		      }

	}
		      }
		          }
		      }
	}
}

