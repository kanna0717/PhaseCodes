package maps;
import java.util.Map;
import java.util.TreeMap;

public class treemaps {

	public static void main(String[] args) {
		TreeMap<Integer,String>treemap=new TreeMap<Integer,String>();
		
        treemap.put(1, "Java");
        treemap.put(5, "Integer");
        treemap.put(4,"String");
        treemap.put(9, "www");
        treemap.put(3, "open");
        treemap.put(2,"Stupdown");
       
        System.out.println(treemap);
        
        for(Map.Entry<Integer, String> m:treemap.entrySet()) {
        	System.out.println(m.getKey()+"----------------"+m.getValue());
        }
        
        }

}
