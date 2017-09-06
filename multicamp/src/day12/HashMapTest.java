package day12;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Member> map = new HashMap<>();
		map.put("1001", new Member("Hong", 24));
		map.put("1002", new Member("Kim", 40));
		map.put("1002", new Member("Lee", 34));
		
		for( Map.Entry<String, Member> e : map.entrySet() )
			System.out.println(e.getKey() + "//" + e.getValue());
		System.out.println("-----------------------------------");
		for( String s : map.keySet() )
			System.out.println(s + "//" + map.get(s));
	}
}
