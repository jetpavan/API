package collections;

import java.util.LinkedHashSet;

public class SetLinkedHash {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add("Pavan");
		set.add("Maveric");
		set.add("Linked");
		set.add(7795);
		set.add("Dell");
		set.add(987);
		set.add(987);
		
		System.out.println(set.size());
		System.out.println(set.remove("Dell"));
		System.out.println(set.contains("Pavan"));
		System.out.println(set.isEmpty());
		System.out.println(set);
	}

}
