package day11;

class OuterClass{
	private String secret = "TTT";
	public OuterClass() {
		InnerClass ic = new InnerClass();
		ic.method();
	}
	
	
	public class InnerClass{
		private int data;
		public void method() {
			System.out.println(secret);
		}
	}
}



public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass o1 = new OuterClass();
		OuterClass o2 = new OuterClass();
		//OuterClass 객체 없이는 InnerClass가 객체화 될 수 없음. 
		//OuterClass객체화 해주고 해당 OuterClass에 속하는InnerClass를 객체화 해주어야 함.
		OuterClass.InnerClass oi = o1.new InnerClass();
	}

}
