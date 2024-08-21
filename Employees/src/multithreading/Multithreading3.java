package multithreading;

//multi threaded approach -1 (using Runnable class)
//If a class extends thread clas sthen it must provide the implementation for the public void run()
//run() should contain the logic

import java.util.Scanner;

class Add implements Runnable
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
class Print implements Runnable
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
class Bank implements Runnable
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
public class Multithreading3 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Add a = new Add();//Thread
		Print p = new Print();//Thread
		Bank b = new Bank();//Thread

		Thread t1=new Thread(a);
		Thread t2=new Thread(p);
		Thread t3=new Thread(b);

		t1.start();//The thread is assigned to Thread Schedular
		t2.start();//The thread is assigned to Thread Schedular
		t3.start();//The thread is assigned to Thread Schedular

		System.out.println("Main Terminated");


	}
}
