package BasicOperation;

class Car1{
    //Instance variables
    private String name;
    private String color;
    private int cost;
    
    public Car1(){
        name = "kia";
        color = "yellow";
        cost = 3000000;
    }
    public Car1(String name)
    {
        this.name = name;
    }
    public void Car2(String color)
    {
        this.color = color;
    }
    public Car1(String name, String color) {
        this.name = name;
        this.color = color;
    }
public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color= color;
    }
}
public class LauchDog {
    public static void main(String[] args) {
        Car1 d1 = new Car1();
        Car1 d2 = new Car1("kia");
         Car1 d3 = new Car1("yellow");
        Car1 d4 = new Car1("kia","yellow");
        System.out.println(d1.getcolor());
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println("------------------------");
        System.out.println(d2.getcolor());
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println("------------------------");
        System.out.println(d3.getcolor());
        System.out.println(d3.getCost());
        System.out.println(d3.getName());
        System.out.println("------------------------");
        System.out.println(d4.getcolor());
        System.out.println(d4.getCost());
        System.out.println(d4.getName());
    }
}



