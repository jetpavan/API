package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHash {

	public static void main(String[] args) {
		
		HashSet<Object> set = new LinkedHashSet<Object>();
		set.add("pavan");
		set.add("n");
		set.add("kumar");
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.remove("n");
//		set.clear();
		int size = set.size();
		
		System.out.println(size);
		System.out.println(set);
		System.out.println(set.contains("pavan"));
		System.out.println(set.isEmpty());
	}

}
