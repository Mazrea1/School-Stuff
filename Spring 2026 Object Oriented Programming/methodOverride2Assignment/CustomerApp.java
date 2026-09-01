package methodOverride2Assignment;
import java.util.Scanner;

public class CustomerApp{
    public void main(String[] args) {
            double subtotal;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the subtotal: ");
            subtotal = scanner.nextDouble();

            Customer customer = new Customer();
            double total = customer.calculateDiscount(subtotal);
            System.out.println("Total for regular customer: " + total);
            PreferedCustomer preferedCustomer = new PreferedCustomer();
            double preferedTotal = preferedCustomer.calculateDiscount(subtotal);
            System.out.println("Total for prefered customer: " + preferedTotal);
    }
}
