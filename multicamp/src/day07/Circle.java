package day07;

public class Circle {
	private int radius;
	private Point center;
	public Circle(){
		radius = 0;
		center = new Point();
	}
	public final static double pi = 3.14;
	public double getArea(){
		return radius * radius * pi;
	}
	public double getLength(){
		return 2 * radius * pi;
	}
	
	
	public Circle(int radius, Point center){
		this.radius = radius;
		this.center = center;
	}
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public Point getCenter(){
		return center;
	}
	public void setCenter(Point center){
//		this.center = center;
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius 
				+ ", center=" + center + "]";
	}
	
}
