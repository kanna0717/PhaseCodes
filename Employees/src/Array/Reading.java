package Array;

//Creating a Parent class of Library

class Library{
	
void read() {
	System.out.println("Books which can be Readable");
}
void write() {
	System.out.println("Books which can be Writable");
}
void Narrate() {
	System.out.println("Books which are easy to explain the story");
}
}

class Hindi extends Library {
	void read() {
     System.out.println("Books which can Readable in Hindi");		
	}
	void Language() {
		System.out.println("Books Represented Language in India");
	}
	void write() {
	System.out.println("Books which are written in Hindi");
	}
}

class Chinese extends Library{

	void write() {
         System.out.println("Books which are written in Chinese");
	}
	void read() {
		System.out.println("Books which are readable in Chinese");
	}
	void Language() {
		System.out.println("Books Represented Language in Chinese");
	}

}

class Japanese extends Library{
	
	void write() {
        System.out.println("Books which are written in Japanese");
	}
	void read() {
		System.out.println("Books which are readable in Japanese");
	}
	void Language() {
		System.out.println("Books Represented Language in Japanese");
	}
}
	

class English extends Library{
	
	void write() {
        System.out.println("Books which are written in USA");
	}
	void read() {
		System.out.println("Books which are readable in USA");
	}
	void Language() {
		System.out.println("Books Represented Language in USA");
	}
}
	
class Russian extends Library{
	
	void write() {
        System.out.println("Books which are written in Russia");
	}
	void read() {
		System.out.println("Books which are readable in Russia");
	}
	void Language() {
		System.out.println("Books Represented Language in Russia");
	}
}
	
	
	
public class Reading {
	public static void main(String[] args) {
	
		Hindi hd= new Hindi();
	System.out.println(" Books which consists :");	
	System.out.println("-------------------------------------------------------------------------");
		hd.write();
		hd.Language();
		hd.read();
		hd.Narrate();
		
		System.out.println("*****************************************************************");
		
		Chinese cn= new Chinese();
		System.out.println(" Books which consists :");	
		System.out.println("-------------------------------------------------------------------------");			cn.write();
			cn.Language();
			cn.read();
			cn.Narrate();
			
			System.out.println("*****************************************************************");
			
			Japanese Jp= new Japanese();
			System.out.println(" Books which consists :");	
			System.out.println("-------------------------------------------------------------------------");
				Jp.write();
				Jp.Language();
				Jp.read();
				Jp.Narrate();
				
				System.out.println("*****************************************************************");
				
				English En= new English();
				System.out.println(" Books which consists :");	
				System.out.println("-------------------------------------------------------------------------");
					En.write();
					En.Language();
					En.read();
					En.Narrate();
					
					System.out.println("*****************************************************************");

					Russian Rn= new Russian();
					System.out.println(" Books which consists :");	
					System.out.println("-------------------------------------------------------------------------");
						Rn.write();
						Rn.Language();
						Rn.read();
						Rn.Narrate();
						
						System.out.println("*****************************************************************");
						
					
	}

}
