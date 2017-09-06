package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("Milk");
		list.add("Bread");
		list.add("Butter");
		list.add("Apple");
		for( String s : list )
			System.out.println(s);
		list.remove("Bread");
		System.out.println("-----------------");
		for( String s : list )
			System.out.println(s);
		
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i));
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext())
//			System.out.println(iter.next());
	}
}




