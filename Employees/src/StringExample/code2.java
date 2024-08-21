package StringExample;

import java.util.Scanner;
class OverAgeException extends Exception{
    public String getMessage() {
        return "Your Age is above the max limit";
    }
}
class UnderAgeException extends Exception{
    public String getMessage() {
        return "Your Age is below the min limit";
    }
}

class User {
    int age;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        age = sc.nextInt();
    }
    void check() throws Exception{
        if(age>65) {
            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
        else if(age<18) {
            UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        }
        else {
            System.out.println("Issue License");
        }
    }
}



public class code2 {
    public static void main(String[] args) {
        try {
            User u = new User();
            u.input();
            u.check();
        }
        catch (Exception e) {
            //System.out.println("exception handled in main");
        }
    }
}

