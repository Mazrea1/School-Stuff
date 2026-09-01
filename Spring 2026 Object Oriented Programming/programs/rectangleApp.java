package programs;
import java.util.Scanner;
public class rectangleApp {

    public static void main(){
        rectangle r1 = new rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        r1.width = scanner.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        r1.height = scanner.nextInt();
        int perimeter = r1.perimeter(r1.width, r1.height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

    }


}
