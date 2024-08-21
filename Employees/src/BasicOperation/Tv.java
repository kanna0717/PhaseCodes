package BasicOperation;

class Television 
{
	
	private String name;
	private String color;
	private int cost;
	private String brand;
	
	public Television() {
		name="Samsung 9 series";
		color="yellow";
		cost=100000;
		brand="Samsung";
		
	}
	
	public Television(String name) {
		this.name=name;
		}
	public Television(String name,int cost) {
		this.name=name;
		this.cost=cost;
		
	}
	public Television(String name,String brand) {
		this.name=name;
		this.brand=brand;
	}
	
	public Television(String name,String brand,int cost, String color) {
		this.name=name;
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	}
	
	

public class Tv 
{

	
	public static void main(String[] args) {
	 Television t1= new Television();
	 Television t2=new Television("LG");
	 Television t3=new Television("MI","Redmi");
	 Television t4=new Television("Sony Bravia",150000);
	 Television t5=new Television("TCL","Reliance",90000,"Black");
	 System.out.println(t4.getColor());
	 System.out.println(t4.getBrand());
	 System.out.println(t4.getCost());
	 System.out.println("------------------------------------------");
	 
	 System.out.println(t1.getName());
	 System.out.println(t1.getColor());
	 System.out.println(t1.getBrand());
	 System.out.println(t1.getCost());
	 System.out.println("------------------------------------------");
	 
	 System.out.println(t2.getName());
	 System.out.println(t2.getColor());
	 System.out.println(t2.getBrand());
	 System.out.println(t2.getCost());
	 System.out.println("------------------------------------------");
	 
	 System.out.println(t3.getName());
	 System.out.println(t3.getColor());
	 System.out.println(t3.getBrand());
	 System.out.println(t3.getCost());
	 System.out.println("------------------------------------------");
	 
	 System.out.println(t4.getName());
	 System.out.println(t4.getColor());
	 System.out.println(t4.getBrand());
	 System.out.println(t4.getCost());
	 System.out.println("------------------------------------------");
	 
	 System.out.println(t5.getName());
	 System.out.println(t5.getColor());
	 System.out.println(t5.getBrand());
	 System.out.println(t5.getCost());
	 System.out.println("------------------------------------------");
	 
	 
	}

	
	

}
