package MapDemo;
import java.util.*;

public class MapsDemo {
	
		public static void main(String[] args) {
		Map<String,String> m=new HashMap<>();
		System.out.println("enter the state name");
		m.put("KAR", "karnataka");
		
		System.out.println("karnataka:"+m.get("KAR"));
		
		Set<String>keys=m.keySet();
		}
}