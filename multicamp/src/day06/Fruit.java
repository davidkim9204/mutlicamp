package day06;

public class Fruit {
	private String name;
	private int weight;
	private String origin;
	public Fruit(){
		name = "Plum";
		weight = 1;
		origin = "Korea";
	}
	public Fruit(String name, int weight, String origin){
		this.name = name;
		this.weight = weight;
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", weight=" 
	+ weight + ", origin=" + origin + "]";
	}
	
	
}
