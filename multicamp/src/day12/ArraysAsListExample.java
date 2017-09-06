package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "Hong";
		arr[1] = "Kim";
		arr[2] = "Lee";
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		String[] arr2 = new String[list.size()];
		list.toArray(arr2);
		
		for(String s : arr2)
			System.out.println(s);
	}
}






