package onlineStoreBackend;
import java.util.Scanner;

public class main {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to our store! Enjoy our selection but first make an account.");
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your address: ");
        String address = scanner.next();
        System.out.println("Your account has now been created, please enjoy our store.");

        person person1 = new person(name);


    }
}
