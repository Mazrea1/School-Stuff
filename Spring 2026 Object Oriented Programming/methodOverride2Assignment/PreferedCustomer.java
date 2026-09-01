package methodOverride2Assignment;

public class PreferedCustomer extends Customer {
    @Override public double calculateDiscount(double subtotal) {
        double total;
        double discount = 0.0;
        if (subtotal >= 100) {
            discount = subtotal * 0.25; // 25% discount for orders over $100
        } else if (subtotal >= 50) {
            discount = subtotal * 0.20; // 20% discount for orders over $50
        } else {
            discount = 0.1; // 10% discount for orders under $50
        }
        total = subtotal - discount;
        return total;
    }
}
