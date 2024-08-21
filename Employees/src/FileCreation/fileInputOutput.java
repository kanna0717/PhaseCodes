package FileCreation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileInputOutput {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\Users\\surya\\Desktop\\Newfolder\\user.txt";
		String path2 = "C:\\Users\\surya\\Desktop\\Newfolder\\output.txt";

		FileInputStream fis = new FileInputStream(path1);//checked exception
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);

		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		System.out.println("operation completed");
		fis.close();
		fos.close();
	}
}

