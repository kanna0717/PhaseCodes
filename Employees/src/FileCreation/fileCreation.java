package FileCreation;

import java.io.File;
import java.io.IOException;
public class fileCreation {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\surya\\Desktop\\Newfolder\\user.txt ");
		if(f.createNewFile()==true) {
			System.out.println("File is created :");
		}
		else {
			System.out.println("error occured");
		}

	}

}
