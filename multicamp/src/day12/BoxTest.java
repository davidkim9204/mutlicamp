package day12;

class Util{
	// <T>  메소드가 제네릭을 사용한다.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		//Util u = new Util()
		//Box<String> box1 = u.boxing("Hong");
		
		Box<String> box1 = Util.boxing("Hong");
		String str = box1.get();
		
		//<String>없어도 매개변수가 String이라 boxing(T t)에서 T가 String 타입으로 알아 들음
		//다만 명시적으로 나타내는 것.
		Util.<String>boxing("Kim");
	}
}
