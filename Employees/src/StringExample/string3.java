package StringExample;

import java.util.Scanner;

public class string3 {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the string");
		String s1=scan.nextLine();
		String s2="";
		String s3="";
 
		for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)>=65 && s1.charAt(i)<=90 ||(s1.charAt(i)>=97 && s1.charAt(i)<=122))
        	{
        		s2=s2+s1.charAt(i);
        	}
        		else {
        			s3=s3+s1.charAt(i);
        }
	}
         System.out.println(s2);
}
	
}
