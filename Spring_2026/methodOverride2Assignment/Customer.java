package methodOverride2Assignment;

public class Customer {
    public double calculateDiscount(double subtotal) {
        double total;
        double discount = 0.0;
        if (subtotal >= 100) {
            discount = subtotal * 0.2; // 20% discount for orders over $100
        } else if (subtotal >= 50) {
            discount = subtotal * 0.1; // 10% discount for orders over $50
        } else {
            discount = 0.0; // No discount for orders under $50
        }
        total = subtotal - discount;
        return total;
    }
}
