package day11;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
