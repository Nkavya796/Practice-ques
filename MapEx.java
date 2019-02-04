import java.util.*;
public class MapEx {

	
	public static void main(String[] args) {
	Map<String,String> m=new HashMap<>();
	m.put("  ","  ");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the state");
	String state=sc.next();
	
	String key = state.substring(0,3);
	System.out.println(key);
	
	Set<String> keys=m.keySet();
	for(String k:keys)
	{
		System.out.println("Key: "+k+ "value: "+m.get(k));
	}
	
	
	//while (iterator.hasNext()) {
	  //  String code = iterator.next();
	    //String country = mapCountryCodes.get(code);
	
	
	
	
	String value=key.toUpperCase();
	System.out.print(value);
	
	for(Map.Entry<String,String> mp:m.entrySet())
	{
		System.out.print(mp.getKey()+" " +mp.getValue());
	}
	
	System.out.print(state);
	
	}
}