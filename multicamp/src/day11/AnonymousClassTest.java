package day11;


interface RemoteControl{
	void turnOn();
	void turnOff();
}


public class AnonymousClassTest {

	public static void main(String[] args) {
		
		RemoteControl ac = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		ac.turnOn();
		ac.turnOff();
	}

}
