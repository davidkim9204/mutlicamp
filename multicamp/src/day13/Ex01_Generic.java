package day13;

class Store<T>{
	private T data;
	public void set(T data) {
		this.data=data;
	};
	public T get() {
		return data;
	}
}

public class Ex01_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store<Integer> s = new Store<Integer>();
		Store<String> a = new Store<String>();
		s.set(new Integer(10));
		a.set("Hello World!");
		
		String r = (String)a.get();
		Integer i = (Integer)s.get();
		System.out.println(r);
		//System.out.println(i);

	}

}
