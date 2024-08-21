package maps;

import java.util.Map;
import java.util.HashMap;

public class treemap1{
	public static void main(String[] args) {
		HashMap<Integer,String>hashmap= new HashMap<Integer, String>();
		
		hashmap.put(5, "integer");
		hashmap.put(8, "Open");
		hashmap.put(6, "zero");
		hashmap.put(4, "two");
		System.out.println(hashmap);
		
		 
        for(Map.Entry<Integer, String> m:hashmap.entrySet()) {
        	System.out.println(m.getKey()+"----------------"+m.getValue());
        }
        
	}
}