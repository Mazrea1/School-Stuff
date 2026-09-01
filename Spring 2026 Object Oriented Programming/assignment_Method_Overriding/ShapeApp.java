package assignment_Method_Overriding;
import javax.swing.JOptionPane;

public class ShapeApp {
    public static void main() {
        Circle circle = new Circle();
        circle.radius = 5;

        Cylinder cylinder = new Cylinder();
        cylinder.radius = 5;
        cylinder.height = 10;


        JOptionPane.showMessageDialog(null, circle.area());
        JOptionPane.showMessageDialog(null, cylinder.area());
    }
}
