package MyFirstProject.src.com.stthom.javaapp;

public class CircleApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle circle1 = new Circle();
       circle1.setRadius(15.5);
       System.out.println("The area of the circle1 is: "+ circle1.calculateArea());
       System.out.println("The Perimeter is "+circle1.calculatePerimeter());
       System.out.println("The Radius of this Circle is "+ circle1.getRadius());
       
       Circle c2 = new Circle();
       c2.setRadius(123.90);
       double areaofc2 = c2.calculateArea();
       double periofc2 = c2.calculatePerimeter();
	}

}
