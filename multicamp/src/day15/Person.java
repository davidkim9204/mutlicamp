package day15;

public class Person implements Comparable<Person>{
	public String name;
	public int  age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if(age<o.age) {
			System.out.println(name);
			System.out.println(o.name);
			System.out.println(o.name+"//"+o.age+"1");
			return -1;
		}
		else if (age == o.age) {
			System.out.println(o.name+"//"+o.age+"2");
			return 0;
		}
		else {
			//System.out.println(name);
			//System.out.println(o.name);
			//System.out.println(o.name+"//"+o.age+"3");
			return 1;
		}
	}
	
}
