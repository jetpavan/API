package maps;

import java.util.Hashtable;

public class TableHash {
	public static void main(String []P) {
		
		Hashtable<String, Object> map = new Hashtable<String, Object>();
		map.put("name", "pavan");
		map.put("age", 26);
		map.put("name", "Kumar");
//		map.put(null, null); //Null Key and Value not allowed
		map.put("place", "Bangalore");
		map.put("company", "Maveric");
		
		System.out.println(map);
	}
}
