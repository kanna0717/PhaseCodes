package StringExample;

	class Animal{
		
		String name;
		int Cost;
		String color;
		int age;
		
		
//		creating constructor
		public Animal() {
			super();
			
			System.out.println("animal type is: "+name+" and cost is : "+Cost);
		}
		public Animal(String color) {
			super();
			this.color =color;
			System.out.println(color);
			
		}
		public Animal(int cost, int age) {
			super();
			this.Cost = cost;
			this.age= age;
			
			
			System.out.println(cost);
			System.out.println(age);
		}
		public Animal(String color, String name) {
			super();
			this.color = color;
			this.name= name;
			
			
			System.out.println(color);
			System.out.println(name);
		}
		public void Animal(int i, int j) {
			// TODO Auto-generated method stub
			
		}
	}
	public class new2 {
	public void main(String[] args) {
		Animal a1 = new Animal();


	a1.color="Black";
	a1.name="Tommy";

	a1.Animal(5000,6);

		
		
	}
	}

