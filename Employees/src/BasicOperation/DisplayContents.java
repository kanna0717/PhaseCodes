package BasicOperation;
 import java.util.Scanner;
public class DisplayContents {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 int fact_var=1;
		 for(int i=1; i<=n; i++) 
		 {
		fact_var =fact_var*i;
		 }
		 System.out.println("factoral value of the number"+n+"is:"+fact_var);
		

	}

}
