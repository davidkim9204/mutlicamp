package day12;

class Car<T>{
	private String color;
	private T speed;
	public void setColor(String c){
		this.color = c;
	}
	public void setSpeed(T s){
		this.speed = s;
	}
	public String toString(){
		return color + "/" + speed;
	}
}
public class Test {
	public static void main(String[] args) {
		Car<Integer> c = new Car<Integer>();
		Car<String> c2 = new Car<String>();
		c.setSpeed(10);
		c2.setSpeed("10KM");
	}
}
