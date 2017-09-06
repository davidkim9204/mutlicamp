package day12;

class Store<T> {
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}
public class StoreTest {
	public static void main(String[] args) {
		Store<String> store = new Store<String>();
		store.set("Hello World");
//		String str = (String) store.get();
//		Integer i = (Integer) store.get();
	}
}






