package StringExample;

import java.util.Scanner;
public class string2 {

	private static int vowel;

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the string");
		String s1=scan.nextLine();
       //a,e,i,o,u,A,E,I,O,Us1.charAt(i)=='a'||
		for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='o'|| s1.charAt(i)=='i'||s1.charAt(i)=='u'|| s1.charAt(i)=='A'||s1.charAt(i)=='E'|| s1.charAt(i)=='I'||s1.charAt(i)=='O'|| s1.charAt(i)=='U') {
        		vowel++;
        }
	}
         System.out.println("vowel count is:"+vowel);
}
}