package day10;

class Animal{
	protected String name;
	public void bark(){
		//동물이 어떻게 짖지...??(추상적인데..)
	}
}
class Dog extends Animal{
	public void bark(){
		System.out.println("멍멍ㅋ");
	}
	public void play(){
		System.out.println("논다놀아");
	}
}
class Cat extends Animal{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("냐옹");
	}

}
class Cow extends Animal{
	public void bark(){
		System.out.println("아뭐~");
	}
}
public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Cow();
		
		for( int i = 0; i < animals.length; i++ ){
			animals[i].bark();
		}
		
		
		((Dog)animals[0]).play();
	}
}












