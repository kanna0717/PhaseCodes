package multithreading;

//multi threaded approach -1 (using thread class)
//If a class extends thread clas sthen it must provide the implementation for the public void run()
//run() should contain the logic

import java.util.Scanner;

class Addition extends Thread
{
	public void run() {
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
class Printing extends Thread
{
	public void run() {
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
class Banking extends Thread
{
	public void run() {
		System.out.println("Banking ops started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the accno:");
		int acc = sc.nextInt();
		System.out.println("enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking ops Completed");
	}
}
public class Multithreading2 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Addition a = new Addition();//Thread
		Printing p = new Printing();//Thread
		Banking b = new Banking();//Thread
		
		a.start();//The thread is assigned to Thread Schedular
		p.start();//The thread is assigned to Thread Schedular
		b.start();//The thread is assigned to Thread Schedular
		
		System.out.println("Main Terminated");
		
		
	}
}


