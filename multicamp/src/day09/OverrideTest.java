package day09;

class ParentClass{
	int data;
	protected int value = 200;
	public ParentClass(int data){
		super();
		this.data = data;
	}
	public void print(){
		System.out.println("ParentClass, data: " + data);
		System.out.println(value);
	}
}
class ChildClass extends ParentClass{
	int data = 200;
	public ChildClass(){
		super(100);
	}
	public void print(){
//		System.out.println(value);
		int data = 300;
		super.print();
		System.out.println("--------------");
		System.out.println("local data : " + data);
		System.out.println("this data : " + this.data);
		System.out.println("super data : " + super.data);
	}
}
public class OverrideTest {
	public static void main(String[] args) {
		ParentClass c = new ChildClass();
		c.print();
	}
}
