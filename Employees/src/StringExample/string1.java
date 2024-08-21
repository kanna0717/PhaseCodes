package StringExample;

public class string1 {

	public static void main(String[] args) {
		
		   String s1 = "Ramayana";
	        String s2 = "Ramayana";
	        String s3 = "ramayana";
	        String s4 = "Mahabharatha";
	        
	        System.out.println(s1.charAt(3));//a
	        //System.out.println(s1.charAt(300));//exception--> index out of bounds
	        System.out.println(s1.toUpperCase());
	        System.out.println(s1.toLowerCase());
	        System.out.println(s1.indexOf('m'));//2
	        System.out.println(s1.contains("ana"));//true
	        System.out.println(s1.contains("ban"));//false
	        System.out.println(s1.startsWith("Rama"));//true
	        System.out.println(s1.startsWith("rama"));//false (case-sensitive)
	        System.out.println(s1.endsWith("yana"));//true
	        System.out.println(s1.endsWith("mana"));//false
	        
	        System.out.println(s1.equals(s2));//true
	        System.out.println(s1.equals(s3));//false
	        System.out.println(s1.equals(s4));//false
	        
	        System.out.println(s1.equalsIgnoreCase(s2));//true
	        System.out.println(s1.equalsIgnoreCase(s3));//true
	        System.out.println(s1.equalsIgnoreCase(s4));//false
	        System.out.println(s1.isBlank());//false (no data (space))
	        System.out.println(s1.isEmpty());//false (no data)
	        
	        System.out.println(s1.length());//total length of the string
	        System.out.println(s2.length());//total length of the string
	        System.out.println(s3.length());//total length of the string
	        System.out.println(s4.length());//total length of the string
	        
	        System.out.println(s1.trim());//removes the empty space in the beginning and at the end of the string
	        
	        s1 = s1.replace('a', 'b');
	        System.out.println(s1);//Rbmbybnb}}
            
	        System.out.println(s2.charAt(4));//a
	        //System.out.println(s1.charAt(300));//exception--> index out of bounds
	        System.out.println(s2.toUpperCase());
	        System.out.println(s2.toLowerCase());
	        System.out.println(s2.indexOf('a'));//2
	        System.out.println(s2.contains("yan"));//true
	        System.out.println(s2.contains("ran"));//false
	        System.out.println(s2.startsWith("Rama"));//true
	        System.out.println(s2.startsWith("rama"));//false (case-sensitive)
	        System.out.println(s2.endsWith("yana"));//true
	        System.out.println(s2.endsWith("mana"));//false
	        
	        System.out.println(s2.equalsIgnoreCase(s1));//true
	        System.out.println(s2.equalsIgnoreCase(s3));//true
	        System.out.println(s2.equalsIgnoreCase(s4));//false
	        System.out.println(s2.isBlank());//false (no data (space))
	        System.out.println(s2.isEmpty());//false (no data)
      System.out.println(s2.trim());//removes the empty space in the beginning and at the end of the string
	        
	        s2 = s2.replace('y', 'a');
	        System.out.println(s2);//Rbmbybnb}}
	        System.out.println(s4.charAt(5));//a
	        //System.out.println(s1.charAt(300));//exception--> index out of bounds
	        System.out.println(s4.toUpperCase());
	        System.out.println(s4.toLowerCase());
	        System.out.println(s4.indexOf('M'));//2
	        System.out.println(s4.contains("bha"));//true
	        System.out.println(s4.contains("ram"));//false
	        System.out.println(s4.startsWith("Maha"));//true
	        System.out.println(s4.startsWith("maha"));//false (case-sensitive)
	        System.out.println(s4.endsWith("tha"));//true
	        System.out.println(s4.endsWith("thum"));//false
	        
	        System.out.println(s4.equalsIgnoreCase(s1));//true
	        System.out.println(s4.equalsIgnoreCase(s3));//true
	        System.out.println(s4.equalsIgnoreCase(s4));//false
	        System.out.println(s4.isBlank());//fsalse (no data (space))
	        System.out.println(s4.isEmpty());//false (no data)
      System.out.println(s4.trim());//removes the empty space in the beginning and at the end of the string
	        
	        s4 = s4.replace('h', 't');
	        System.out.println(s4);//Rbmbybnb}}
	}
}
