package FileCreation;


	import java.io.File;

	public class fileDeletion {
		public static void main(String[] args) {
			File f = new File("C:\\Users\\surya\\Desktop\\Newfolder\\user1.txt");
			
			if(f.delete()==true) {
				System.out.println("file deleted successfully");
			}
			else {
				System.out.println("File deletion failed");
			}
}
	}
