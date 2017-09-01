package day09;

public class Complex {
	private double real;
	private double image;
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImage() {
		return image;
	}
	public void setImage(double image) {
		this.image = image;
	}
	public Complex add(Complex c){
		double resultReal = real + c.getReal();
		double resultImage = image + c.getImage();
		Complex result = new Complex();
		result.setReal(resultReal);
		result.setImage(resultImage);
		return result;
	}
	
	public String toString(){
		return real + " + " + image + "i";
	}
	
}
