package day15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("hong",45));
		treeSet.add(new Person("Park",31));
		treeSet.add(new Person("Java",25));
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.name+":"+p.age);
		}

	}

}
