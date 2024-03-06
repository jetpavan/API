package collections;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("pavan");
		list.add("kumar");
		list.add("N");
		list.add("pavan");
		list.add("kumar");
		list.add("N");

		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
