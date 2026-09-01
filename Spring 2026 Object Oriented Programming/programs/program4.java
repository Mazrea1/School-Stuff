package programs;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a,b,c,d,e: ");
        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();
        Double d = input.nextDouble();
        Double e = input.nextDouble();
        Double answer = calculation(a,b,c,d,e);
        System.out.println("The result is " + answer);
    }
    public static Double calculation(Double a, Double b, Double c, Double d, Double e) {
        Double result = ((240 * c * e - 50 * b * a)/(d+20 * a * b)) -2 * c;
        return result;
    }
}