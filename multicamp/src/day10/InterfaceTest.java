package day10;

interface Clickable{
	public void onClick();
}
class CheckButton implements Clickable, Comparable{
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("와왕 클릭됐따");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		Clickable c = new CheckButton();
		c.onClick();
	}
}
