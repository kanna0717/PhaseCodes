package FileCreation;
import java.io.FileWriter;
import java.io.IOException;

public class fileEnter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Users\\surya\\Desktop\\Newfolder\\user.txt");
		fw.write("package mlc;\r\n"
				+ "import java.util.Scanner;\r\n"
				+ "\r\n"
				+ "//12345\r\n"
				+ "//12345\r\n"
				+ "//12345\r\n"
				+ "//12345\r\n"
				+ "//12345\r\n"
				+ "\r\n"
				+ "public class example1 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "	System.out.println(\"Enter the number of rows and columns :\");\r\n"
				+ "	Scanner scr= new Scanner(System.in);\r\n"
				+ "	System.out.println(\"Enter the value of n :\");\r\n"
				+ "	int n=scr.nextInt();\r\n"
				+ "	\r\n"
				+ "	for(int i=1;i<=n;i++) {\r\n"
				+ "		\r\n"
				+ "		for(int j=1;j<=n;j++) {\r\n"
				+ "			System.out.print(\"\");\r\n"
				+ "		    System.out.print(i);\r\n"
				+ "		}\r\n"
				+ "		System.out.println();\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}");
		fw.close();
       System.out.println("data enter is successful");
	}

}
