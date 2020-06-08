package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2 * (width + height);
	}
	public double diagonal() {
		double b = Math.pow(height, 2);
		double h = Math.pow(width, 2);
		return Math.sqrt(b + h) ;
	}

}