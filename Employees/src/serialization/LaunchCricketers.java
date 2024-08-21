package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable
{
    String name;
    int runs;
    float avg;
    int catches;
    int matches;
    
    public Cricketer(String name, int runs, float avg, int catches, int matches) {
        super();
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.catches = catches;
        this.matches = matches;
    }
    
    void disp() {
        System.out.println("Name of the Cricketer: "+name);
        System.out.println("Runs of the Cricketer: "+runs);
        System.out.println("Avrg of the Cricketer: "+avg);
        System.out.println("Catches of the Cricketer: "+catches);
        System.out.println("Matches of the Cricketer: "+matches);
    }
    
}
public class LaunchCricketers {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      Cricketer c1 = new Cricketer("Sachin", 50000, 45.6f, 100, 200);
        c1.disp();
        String path = "C:\\Users\\surya\\Desktop\\12345\\Cricketers.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(path);//path for the store
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);//creating the stream to pass the object
        objectOutputStream.writeObject(c1);
        
    //    String path = "C:\Users\surya\Desktop\12345\\Cricketer.txt";
    //    FileInputStream fileInputStream = new FileInputStream(path);
    //    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    //    Cricketer c2 = (Cricketer)objectInputStream.readObject();
    //    c2.disp();
    }
}