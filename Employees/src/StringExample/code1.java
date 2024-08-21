package StringExample;

import java.util.Scanner;
class Test{
    void ops() throws Exception //called
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int num = sc.nextInt();
        System.out.println("Enter the denominator:");
        int den = sc.nextInt();
        int res=0;
        res = num/den;//critical statement
        System.out.println(res);
    }
}
//case-1
public class code1 {
    public static void main(String[] args) //calling
    {
        Test t = new Test();
        try {
            t.ops();
        } 
        //generic catch
        catch(Exception e) {
            System.out.println("Mesage from generic catch of main. Arithmetic exception identified");
        }

    }
}
//case-2
//public class code1 {
//    public static void main(String[] args) throws Exception//calling
  //  {
  //      Test t = new Test();
   //     t.ops();
   // }
//}
//when main used throws keyword then the exception will be handled by default exception handler
