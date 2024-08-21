package DataStructure;

public class StackExample {
		static final int n = 1000;// static to access by class name, final to keep it constant
		int top;
		int arr[] = new int[n];
		boolean isEmpty() {
			return (top<0);
		}
		StackExample(){
			top = -1;
		}
		
		boolean push(int x) {
			if(top>(n-1)) {
				System.out.println("The stack is overflow");
				return false;
			}
			else {
				arr[++top] = x;
				System.out.println("The data push on to the stack is :"+x);
				return true;
			}
		}
		
		int pop() {
			if(top<0) {
				System.out.println("The stack is empty");
				return 0;
			}
			else {
				int i = arr[top--];
				return i;
			}
		}
		
		public static void main(String[] args) {
			StackExample s = new StackExample();
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			
			System.out.println(s.pop() + " is removed from the stack");
			System.out.println(s.pop() + " is removed from the stack");
		}
	}

