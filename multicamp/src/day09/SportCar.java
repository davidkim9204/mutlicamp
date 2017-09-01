package day09;

public class SportCar extends Car{
	public boolean turbo;
	
	public SportCar(){
		System.out.println("스포츠카 생성!");
	}
	public void speedUp(int increment){
		if( turbo)
			speed += 2*increment;
		else
			speed += increment;
	}
	public void setTurbo(boolean newValue)
	{
		turbo = newValue;
	}
}
