package StringExample;

import java.util.Scanner;

public class string6 {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("ENter the string:");
	        String s1 = scan.nextLine();
	        int space = 0;
	        int len = s1.length();
	        String s2 = "";
	        //Count the spaces
	        for(int i=0;i<len;i++) {
	            if(s1.charAt(i)==' ') {
	                space++;
	            }
	        }
	        //Finding the count of the words 
	        //total_space_count +1
	        int word_cnt = space+1;
	        
	        //Create an array having size as to total count of words
	        String str[] = new String[word_cnt];
	        int count = 0;
	        
	        //Loops the string in reverse direction
	        for(int i=s1.length()-1;i>=0;i--) {
	            //checking for the space
	            if(s1.charAt(i)==' ') {
	                str[count] = s2;
	                s2 = "";
	                count++;
	            }
	            else {
	                s2 = s2 + s1.charAt(i);
	            }
	        }
	        
	        //pushing the last word traversed into the string array
	        str[count] = s2;
	        
	        //Printing the array in reverse direction
	        
	
	for(int i=str.length-1;i>=0;i--) {
	            System.out.print(str[i]+" ");
	        }
	    }
	}

    