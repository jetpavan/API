package collections;

import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(7796);
		set.add(9908);
		set.add(665);
		
		System.out.println(set.last());
		System.out.println(set.first());
		System.out.println(set);
	}

}
