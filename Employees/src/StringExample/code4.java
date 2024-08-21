package StringExample;

 import java.util.Scanner;

 class InvaildCustomerException extends Exception{
     public String getMessage() {
         return "Invaild user Id";
     }
 }
 class Customer{
	    int usr_id = 111;
	    int pin = 222;
	    int usr_input_id;
	    int usr_input_pin;
	    void input() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("User ID = ");
	        usr_input_id = sc.nextInt();
	        System.out.println("pin = ");
	        usr_input_pin = sc.nextInt();
	    }
	    
	    void check() throws Exception{
	        if(usr_id==usr_input_id) {
	            if(pin==usr_input_pin) {
	                System.out.println("Allow withdrawal");
	            }
	            else {
	                System.out.println("Invalid pin");
	                InvaildCustomerException ice = new InvaildCustomerException();
	                System.out.println(ice.getMessage());
	                throw ice;
	            }
	        }
	        else {
	            System.out.println("Invaild id");
	            InvaildCustomerException ice = new InvaildCustomerException();
	            System.out.println(ice.getMessage());
	            throw ice;
	        }
	    }
	}
 public class code4 {
	    public static void main(String[] args) {
	        try {
	        Customer c = new Customer();
	        c.input();
	        c.check();
	        }
	        catch (Exception e) {
	        }
	    }
	}


	 
	