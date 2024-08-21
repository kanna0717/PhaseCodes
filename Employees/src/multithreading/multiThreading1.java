package multithreading;

//single threaded approach
import java.util.Scanner;

class Addition1{
	void addition1() {
		System.out.println("Addition ops started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("enter the num2:");
		int num2 = sc.nextInt();

		int res = num1 + num2;

		System.out.println(res);
		System.out.println("addition ops completed");
	}
}
class Printing1{
	void printing1() {
		System.out.println("Printing ops started");
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Welcome to SimpliLearn");
				Thread.sleep(4000);//Checked exceptions
			}
		}
		catch (Exception e) {
			System.out.println("Exception in Printing");
		}
		System.out.println("Printing ops completed");
	}
}
class Banking1{
	void banking1() {
		System.out.println("Banking ops started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the accno:");
		int acc = sc.nextInt();
		System.out.println("enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking ops Completed");
	}
}
public class multiThreading1 {
	public static void main(String[] args) {
		Addition1 a = new Addition1();
		Printing1 p = new Printing1();
		Banking1 b = new Banking1();
		
		a.addition1();
		p.printing1();
		b.banking1();
	}
}