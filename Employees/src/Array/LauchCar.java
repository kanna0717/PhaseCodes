package Array;

abstract class Car
{
    void start() //inherited
    {
        System.out.println("Car is starting");
    }
    void stop() //inherited
    {
        System.out.println("Car is stopping");
    }
    abstract void drift(); //overridden
    
}
class Benz extends Car
{
    void drift() //overridden
    {
        System.out.println("Benz cannot drift");
    }
    void logo() //specialized 
    {
        System.out.println("Benz has more value for its logo");
    }
}
class Audi extends Car
{
    void drift() //overridden
    {
        System.out.println("Audi can drift swiftly");
    }
    void appearence()//specialized 
    {
        System.out.println("Audi has more value for its appearence");
    }
}
public class LauchCar {
    public static void main(String[] args) {
        Audi a = new Audi();
        Benz b = new Benz();
        
        //Car c1 = new Car();//An abstract class cannot be instantiated because abstract class is incompleted.
        
        Car c;
        
        c = a;
        c.start(); //parent
        c.stop(); //parent
        c.drift(); //child
        a.appearence();//specialized method accessed by the child object reference
        
        c = b;
        
        c.start(); //parent
        c.stop(); //parent
        c.drift(); //child
        b.logo();//specialized method accessed by the child object reference
    }
}
