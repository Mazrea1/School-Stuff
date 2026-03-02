package MyFirstProject.src.com.stthom.javaapp;


public class Circle {

	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}

	public double calculateArea() {
		return 3.1415 * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * 3.1415 * radius;
	}

}
