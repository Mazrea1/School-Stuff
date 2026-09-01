package programs;
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        double total = 0;
        while (true) {
            System.out.println("Enter price of item (0 to end): ");
            Scanner input = new Scanner(System.in);
            double price = input.nextDouble();
            total += price;
            if (price == 0) {
                break;
            }
        }
        double finalPrice;
        double discountedPrice;
        if (total > 100) {
            discountedPrice = total - (total * 0.1);
        } else {
            discountedPrice = total - (total * 0.05);
        }
        finalPrice = discountedPrice + (discountedPrice * 0.0825);
        int n = 2;

        finalPrice = Math.round(finalPrice * Math.pow(10, n))
                / Math.pow(10, n);
        System.out.println("Your total is $" + finalPrice);
    }
}