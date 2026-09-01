package programs;

public class bankAccountApp {
    public static void main(String[] args) {
        bankAccount account1 = new bankAccount("123456789", 1000.00);
        System.out.println(account1.checkBalance());
        System.out.println(account1.deposit());
        System.out.println(account1.deposit());
        System.out.println(account1.withdraw());
    }
}
