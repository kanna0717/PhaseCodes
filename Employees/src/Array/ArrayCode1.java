package Array;

import java.util.Scanner;
public class ArrayCode1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a1[] = {1,2,3,4,5}; // approach-1 (Static)
        for(int i=0;i<=(a1.length-1);i++)
        {
            System.out.println(a1[i]);
            //a[0],a[1],a[2],a[3],a[4]
        }
        System.out.println("--------------------------");
        int a[] = new int[5];     // approach-2 (Dynamic)
        System.out.println("Enter the array elements");
        for(int i=0;i<(a.length);i++)//loop to store the info
        {
            a[i]=scr.nextInt();
            //a[0],a[1],a[2],a[3],a[4]
        }
        for(int i=0;i<(a.length);i++)
        {
            System.out.println(a[i]);
            //a[0],a[1],a[2],a[3],a[4]
        }
    }
}

