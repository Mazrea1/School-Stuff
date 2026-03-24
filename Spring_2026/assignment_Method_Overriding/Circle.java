package assignment_Method_Overriding;

public class Circle {
        double radius;


    public String area() {
        double area = 3.1415 * radius * radius;
        String result = ("Area of the circle is: " + area);
        return result;
    }
}
