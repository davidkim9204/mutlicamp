package day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();

		s.add("Java");
		s.add("JDBC");
		s.add("Servlet/JSP");
		s.add("Java");
		s.add("iBATIS");

		int size = s.size();
		System.out.println("총 객체수 : " + size);

		Iterator<String> iterator = s.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		s.remove("JDBC");
		s.remove("iBATIS");

		System.out.println("총 객체수 : " + s.size());

		iterator = s.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		s.clear();
		if (s.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
