package maps;

import java.util.HashMap;

public class MapHash {

	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put("name", "pavan");
		map.put(null, "Maveric");
		map.put(1, "Bangalore");
		map.put(1, "Bangalore");
		map.put("age", 27);
		
		System.out.println(map);
	}

}
