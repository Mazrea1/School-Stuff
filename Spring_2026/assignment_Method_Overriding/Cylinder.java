package assignment_Method_Overriding;

public class Cylinder extends Circle {
    double height;

    public String area() {
        double area = 2 * 3.1415 * (radius + height);
        String result = ("Area of the cylinder is: " + area);
        return result;
    }
}
